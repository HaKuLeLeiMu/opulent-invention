import java.util.ArrayList;

public class WeatherSystem implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Information> infor;

    public WeatherSystem() {
        observers = new ArrayList<Observer>();
        infor = new ArrayList<Information>();
    }

    public void addInformation(Information target) {
        infor.add(target);
        notifyObserver();
    }

    public void removeInformation(Information target) {
        infor.remove(target);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer target) {
        observers.add(target);
    }

    @Override
    public void removeObserver(Observer target) {
        observers.remove(target);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = observers.get(i);
            o.update(infor);
        }
    }

}