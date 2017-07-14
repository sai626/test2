package XE;

import XE.Client.Observer;
import XE.Client.TestObserver;
import XE.Observable.Euro;
import XE.Observable.GBP;
import XE.Observable.USD;
import XE.Server.Server;

/**
 * Created by saisri on 7/14/17.
 */
public class Main {

    public static void main(String[] args) {

        Server server=new Server();

        USD usd=new USD();
        GBP gbp=new GBP();
        Euro euro=new Euro();

        server.addObservable(usd);
        server.addObservable(gbp);
        server.addObservable(euro);



        Observer observer1=new TestObserver();
        server.addObserver(observer1);

        server.change(usd,80);
        server.change(gbp,90);

        Observer observer2=new TestObserver();
        server.addObserver(observer2);

        server.change(euro,50);

        server.removeObserver(observer1);

        server.change(usd,70);
    }
}
