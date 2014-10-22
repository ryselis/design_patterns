import Strategy.AggressiveBehaviour;
import Strategy.DefensiveBehaviour;
import Strategy.Warrior;

public class Main {

    public static void main(String[] args) {
        testStategy();
    }

    public static void testStategy(){
        Warrior warrior = new Warrior();
        warrior.setBehaviour(new AggressiveBehaviour());
        warrior.fite();
        warrior.setBehaviour(new DefensiveBehaviour());
        warrior.fite();
    }
}
