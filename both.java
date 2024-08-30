import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class both {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(5);
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.addFirst(1);
        li.addLast(5);
    
        Iterator<Integer> itr = li.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        al.remove(1);
        Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


