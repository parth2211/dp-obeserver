package observer.push.observer;

import observer.push.observable.Observable;
import observer.push.observable.WeatherStation;

public class DisplayCurrent implements Observer {

    Observable observable;

    private double temperature;
    private double humidity;
    private double pressure;

    public DisplayCurrent(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void setObservable(Observable observable){
        observable.removeObserver(this);
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("PUSH!!! - Current conditions: " + temperature + "F degrees and " + humidity + "% humidity and" + pressure + " pressure");
    }
}
