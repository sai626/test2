package XE.Client;

import XE.Observable.Observable;

import java.util.List;

/**
 * Created by saisri on 7/14/17.
 */
public class TestObserver implements Observer {

    public static int Observer_Count=0;
    public int currentObserver;

    public TestObserver(){
        currentObserver=++Observer_Count;
    }

    @Override
    public void update(List<Observable> list) {
        System.out.println("Observer : "+currentObserver);
        for (Observable observable: list){
            System.out.println("1"+observable.getName()+" = "+observable.getValue()+" INR");
        }
        System.out.println();
    }
}
