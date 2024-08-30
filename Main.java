import java.util.LinkedList;
import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.addFirst(1);
        li.addLast(5);
    
        Iterator<Integer> itr = li.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
