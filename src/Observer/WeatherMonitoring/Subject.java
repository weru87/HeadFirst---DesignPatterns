package Observer.WeatherMonitoring;

/**
 * Created by weru8 on 2016. 11. 15..
 * Objects use this interface to register as observers
 * updates all the observers when state changed
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
