package Builder;

/**
 * Created by ryselis on 14.10.23.
 */
public class PizzaBuilder implements Builder {
    private Pizza pizza = new Pizza();

    @Override
    public void addPart(String part) {
        pizza.addPart(part);
    }
}
