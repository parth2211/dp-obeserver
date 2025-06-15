package observer.util.observer;

import observer.util.observable.WeatherStation;

import java.util.Observable;
import java.util.Observer;

public class ForecastDispaly implements Observer {

    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherStation){
            WeatherStation weatherStation = (WeatherStation) o;
            temperature = weatherStation.getTemperature();
            humidity = weatherStation.getHumidity();
            pressure = weatherStation.getPressure();
            display();
        }
    }

    private void display(){
        System.out.println("Inbuilt!!! -- Forecast: " + temperature + "F degrees and " + humidity + "% humidity and" + pressure + " pressure");
    }
}
