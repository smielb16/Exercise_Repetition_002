
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class WetterModell extends AbstractListModel{

    private ArrayList filter = new ArrayList();
    private ArrayList gesamt = new ArrayList();
    
    @Override
    public int getSize() {
        return filter.size();
    }

    @Override
    public Object getElementAt(int index) {
        return filter.get(index);
    }
    
    public void add(WetterWert wert){
        gesamt.add(wert);
        filter.add(wert);
        fireIntervalAdded(filter, filter.size()-1, filter.size()-1);
    }
    
}
