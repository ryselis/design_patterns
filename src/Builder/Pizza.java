package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryselis on 14.10.23.
 */
public class Pizza {
    private List<String> parts = new ArrayList<String>();

    public void addPart(String part){
        parts.add(part);
        System.out.println("added " + part);
    }
}
