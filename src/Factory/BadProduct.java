package Factory;

/**
 * Created by ryselis on 14.10.22.
 */
public class BadProduct implements Product {
    @Override
    public void consume() {
        System.out.println("regular kek");
    }
}
