package observer.pull.observable;

import observer.pull.observer.Observer;

public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
