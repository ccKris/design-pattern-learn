import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2016/5/12.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {

        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {

        if (obs instanceof WeatherData) {

            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();

            display();
        }
    }

    public void display() {

        System.out.println("Current conditions: " + temperature + "F degrees and "
                + humidity + "% humidity and " + pressure + " pressure");
    }
}
