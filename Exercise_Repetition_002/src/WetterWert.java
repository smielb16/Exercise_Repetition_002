
import java.time.LocalDateTime;

public class WetterWert {

    private int temperatur;
    private int luftfeuchtigkeit;
    private LocalDateTime zeitpunkt;

    public WetterWert(int temperatur, int luftfeuchtigkeit, LocalDateTime zeitpunkt) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        String date = String
                .format("%02d.%02d", zeitpunkt.getDayOfMonth(),
                        zeitpunkt.getMonthValue());
        String time = String
                .format("%02d:%02d:%02d", zeitpunkt.getHour(),
                        zeitpunkt.getMinute(), zeitpunkt.getSecond());
        return String.format("%s - %s - %d° - %d",
                date,
                time,
                temperatur, luftfeuchtigkeit);
    }

}
