package Builder;

/**
 * Created by ryselis on 14.10.23.
 */
public class Director {
    public void makeBestPizzaEver(){
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.addPart("bacon");
        pizzaBuilder.addPart("moar bacon");
        pizzaBuilder.addPart("very bacon");
    }
}
