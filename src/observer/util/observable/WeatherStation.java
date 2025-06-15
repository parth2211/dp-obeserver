package observer.util.observable;

public class WeatherStation extends java.util.Observable {
    private double temperature;
    private double humidity;
    private double pressure;

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
