package observer.pull.observer;

import observer.pull.observable.Observable;
import observer.pull.observable.WeatherStation;

public class DisplayForecast implements Observer {
    Observable observable;

    private double temperature;
    private double humidity;
    private double pressure;

    public DisplayForecast(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void setObservable(Observable observable){
        observable.removeObserver(this);
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update() {
        if(observable instanceof WeatherStation){
            WeatherStation weatherStation = (WeatherStation) observable;
            temperature = weatherStation.getTemperature();
            humidity = weatherStation.getHumidity();
            pressure = weatherStation.getPressure();
            display();
        }
    }

    private void display() {
        System.out.println("PULL!!! - Displaying forecast: Temperature : " + temperature + "F degrees, Humidity : " + humidity + "%, Pressure : " + pressure + "Pa");
    }
}
