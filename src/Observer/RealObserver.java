package Observer;

/**
 * Created by ryselis on 14.10.22.
 */
public class RealObserver implements Observer {

    @Override
    public void update() {
        System.out.println("updated");
    }
}
