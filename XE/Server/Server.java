package XE.Server;

import XE.Client.Observer;
import XE.Observable.Observable;

import java.util.ArrayList;
import java.util.List;

public class Server implements Subject {

    List<Observer> observerList;
    List<Observable> observableList;

    public Server(){
        observerList=new ArrayList<>();
        observableList=new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer:observerList){
            observer.update(observableList);
        }
    }

    @Override
    public void addObservable(Observable observable) {
        observableList.add(observable);
    }

    @Override
    public void removeObservable(Observable observable) {
        observableList.remove(observable);
    }

    public void change(Observable observable, double value){
        int index=observableList.indexOf(observable);
        observableList.get(index).setValue(value);
        notifyAllObservers();
    }
}
