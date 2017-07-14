package XE.Client;

import XE.Observable.Observable;

import java.util.List;

/**
 * Created by saisri on 7/14/17.
 */
public interface Observer {

    public void update(List<Observable> list);
}
