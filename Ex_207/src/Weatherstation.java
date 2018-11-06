
public class Weatherstation {

    private String place;
    private int sealevel;
    private double temperature;
    private int huidity;

    public Weatherstation(String place, int sealevel, double temperature, int huidity) {
        this.place = place;
        this.sealevel = sealevel;
        this.temperature = temperature;
        this.huidity = huidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getSealevel() {
        return sealevel;
    }

    public String getPlace() {
        return place;
    }

    public int getHuidity() {
        return huidity;
    }

}
