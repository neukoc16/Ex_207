
import java.io.Serializable;


public class Weatherstation implements Serializable{

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

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) throws Exception {
        if (humidity > 0 && humidity <= 100) {
            this.humidity = humidity;
        } else {
            throw new Exception("Humidity out of bounds!");
        }
    }

    public void setSealevel(int sealevel) {
        this.sealevel = sealevel;
    }

    public void setPlace(String place) throws Exception {
        this.place = place;
    }

    public void setTemperature(double temperature) throws Exception {
        if (temperature >= -35 && temperature <= 45) {
            this.temperature = temperature;
        } else {
            throw new Exception("Temperature out of bounds!");
        }
    }

}
