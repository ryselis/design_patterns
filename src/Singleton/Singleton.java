package Singleton;

/**
 * Created by ryselis on 14.10.22.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }

    public synchronized static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
