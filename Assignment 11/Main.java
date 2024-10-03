import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Creating a Vector of String objects
        Vector<String> names = new Vector<>();

        // Adding five names to the Vector
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eva");

        // Using an Iterator to print each name
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
