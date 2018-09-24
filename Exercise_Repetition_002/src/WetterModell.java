
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.AbstractListModel;

public class WetterModell extends AbstractListModel {

    private ArrayList<WetterWert> filter = new ArrayList();
    private ArrayList<WetterWert> gesamt = new ArrayList();

    @Override
    public int getSize() {
        return filter.size();
    }

    @Override
    public Object getElementAt(int index) {
        return filter.get(index);
    }

    public void add(WetterWert wert) {
        gesamt.add(wert);
        filter.add(wert);
        fireIntervalAdded(filter, filter.size() - 1, filter.size() - 1);
    }

    public void laden(File file) {
        filter.clear();
        gesamt.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                WetterWert wert
                        = new WetterWert(Integer
                                .parseInt(str[0]), Integer
                                .parseInt(str[1]), LocalDateTime
                                .ofEpochSecond(Long
                                        .parseLong(str[2]),
                                        0, ZoneOffset.UTC));
                gesamt.add(wert);
                filter.add(wert);
                fireIntervalAdded(this, filter.size()-1, filter.size()-1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void save(File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (WetterWert wert : gesamt) {
                bw.write("" + wert.getTemperatur());
                bw.write(",");
                bw.write("" + wert.getLuftfeuchtigkeit());
                bw.write(",");
                bw.write("" + wert.getZeitpunkt().toEpochSecond(ZoneOffset.UTC));
                bw.write("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
