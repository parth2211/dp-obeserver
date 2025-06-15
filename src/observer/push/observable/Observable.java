package observer.push.observable;

import observer.push.observer.Observer;

public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
