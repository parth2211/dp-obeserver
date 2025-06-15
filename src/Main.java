import observer.pull.observable.WeatherStation;
import observer.pull.observer.DisplayCurrent;
import observer.pull.observer.DisplayForecast;
import observer.pull.observer.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        DisplayCurrent displayCurrent = new DisplayCurrent(weatherStation);
        DisplayForecast displayForecast = new DisplayForecast(weatherStation);

        weatherStation.setMeasurements(80, 65, 30.4);
        weatherStation.setMeasurements(82, 70, 29.2);

        observer.push.observable.WeatherStation weatherStationPush = new observer.push.observable.WeatherStation();
        observer.push.observer.DisplayCurrent displayCurrent1 = new observer.push.observer.DisplayCurrent(weatherStationPush);
        observer.push.observer.DisplayForecast displayForecast1 = new observer.push.observer.DisplayForecast(weatherStationPush);

        weatherStationPush.setMeasurements(80, 65, 30.4);
        weatherStationPush.setMeasurements(82, 70, 29.2);

        observer.util.observable.WeatherStation weatherStationUtil = new observer.util.observable.WeatherStation();
        observer.util.observer.CurrentDispaly currentDispaly2 = new observer.util.observer.CurrentDispaly();
        observer.util.observer.ForecastDispaly forecastDispaly2 = new observer.util.observer.ForecastDispaly();
        weatherStationUtil.addObserver(currentDispaly2);
        weatherStationUtil.addObserver(forecastDispaly2);

        weatherStationUtil.setMeasurements(80, 65, 30.4);
        weatherStationUtil.setMeasurements(82, 70, 29.2);
    }
}