package Factory;

/**
 * Created by ryselis on 14.10.22.
 */
public class Factory {
    public Product create(int i){
        if (i == 0){
            return new GoodProduct();
        }
        return new BadProduct();
    }
}
