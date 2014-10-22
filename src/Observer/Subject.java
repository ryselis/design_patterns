package Observer;

/**
 * Created by ryselis on 14.10.22.
 */
public interface Subject {
    public void doStuff();
    public void addObserver(Observer observer);
}
