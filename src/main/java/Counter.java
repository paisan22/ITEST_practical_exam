import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by paisanrietbroek on 24/01/2018.
 */
public class Counter {

    private int value = 0;
    private List<Observer> observerList = new ArrayList<Observer>();

    public int getValue() {
        return this.value;
    }

    public void addOne() {
        this.value++;
    }

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public List<Observer> getObserverList() {
        return observerList;
    }
}
