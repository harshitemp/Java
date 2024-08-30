import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class main1 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(10);
        li.add(5);
    
        Iterator<Integer> itr = li.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

