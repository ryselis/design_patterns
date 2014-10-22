package Strategy;

/**
 * Created by ryselis on 14.10.22.
 */
public class Warrior {
    private Behaviour behaviour;

    public void fite(){
        behaviour.doStuff();
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }
}
