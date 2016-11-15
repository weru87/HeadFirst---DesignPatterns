package Observer.WeatherMonitoring;

/**
 * Created by weru8 on 2016. 11. 15.
 * It will be implemented by all observers
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);


}
