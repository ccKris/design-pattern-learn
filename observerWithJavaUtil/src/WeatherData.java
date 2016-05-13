import java.util.Observable;

/**
 * Created by Administrator on 2016/5/12.
 */

// 采用java内置Observer；类实现weatherData。
// java内置观察者模式的实现Observer
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {} // 构造器什么也不做

    public void measurementsChanged() {

        setChanged(); // 指示状态已改变
        notifyObservers(); // 通知观察者
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public float getTemperature() {

        return temperature;
    }

    public float getHumidity() {

        return humidity;
    }

    public float getPressure() {

        return pressure;
    }

}
