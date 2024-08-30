import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        boolean result = s.empty();
        System.out.println("stack empty?"+result);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(25);
        System.out.println("element in stack"+s);
        result=s.empty();
        System.out.println("is the stack empty?"+result);
    }
}
