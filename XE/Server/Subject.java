package XE.Server;

import XE.Client.Observer;
import XE.Observable.Observable;

public interface Subject {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();

    public void addObservable(Observable observable);
    public void removeObservable(Observable observable);
}
