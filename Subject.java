public interface Subject {
    public void registerObserver(Observer target);

    public void removeObserver(Observer target);

    public void notifyObserver();
}