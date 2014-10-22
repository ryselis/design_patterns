package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryselis on 14.10.22.
 */
public class RealSubject implements Subject {
    List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void doStuff() {
        for (Observer observer: observers){
            System.out.println("trololo");
            observer.update();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}
