
public class Weatherstation {

    private String place;
    private int sealevel;
    private double temperature;
    private int humidity;

    public Weatherstation(String place, int sealevel, double temperature, int humidity) {
        this.place = place;
        this.sealevel = sealevel;
        this.temperature = temperature;
        this.humidity = humidity;
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
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setSealevel(int sealevel) {
        this.sealevel = sealevel;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}
