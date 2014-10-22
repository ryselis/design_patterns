import Builder.Director;
import Builder.PizzaBuilder;
import Factory.Factory;
import Observer.RealObserver;
import Observer.RealSubject;
import Observer.Subject;
import Strategy.AggressiveBehaviour;
import Strategy.DefensiveBehaviour;
import Strategy.Warrior;

public class Main {

    public static void main(String[] args) {
        testStategy();
        testObserver();
        testFactory();
        testBuilder();
    }

    public static void testStategy(){
        Warrior warrior = new Warrior();
        warrior.setBehaviour(new AggressiveBehaviour());
        warrior.fite();
        warrior.setBehaviour(new DefensiveBehaviour());
        warrior.fite();
    }

    public static void testObserver(){
        Subject subject = new RealSubject();
        subject.addObserver(new RealObserver());
        subject.doStuff();
    }

    public static void testFactory(){
        Factory factory = new Factory();
        factory.create(0).consume();
        factory.create(1).consume();
    }

    public static void testBuilder(){
        Director director = new Director();
        director.makeBestPizzaEver();
    }
}
