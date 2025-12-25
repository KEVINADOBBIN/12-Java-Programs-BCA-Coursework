import java.util.*;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("C");
        v.add("C++");
        v.add("Java");
        v.add("J2EE");

        System.out.println("Initially the Vector contents: " + v);

        System.out.println("The last element: " + v.lastElement());
        System.out.println("The element at 2nd position: " + v.elementAt(2));

        v.insertElementAt("VB", 1);
        v.insertElementAt("C#", 0);

        System.out.println("After inserting elements, the Vector contents: " + v);

        v.removeElementAt(3);
        System.out.println("After removing element at index 3, the Vector contents: " + v);

        v.setElementAt("C++", 1);

        v.remove("VB");
        System.out.println("After removing 'VB', the Vector contents: " + v);
    }
}
