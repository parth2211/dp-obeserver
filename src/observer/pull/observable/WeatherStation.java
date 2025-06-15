package observer.pull.observable;

import observer.pull.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

    private double temperature;
    private double humidity;
    private double pressure;

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    public double getHumidity() {
        return humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }
}
