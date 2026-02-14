import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate will be ignored
        fruits.add("Orange");

        System.out.println(fruits);

        fruits.remove("Mango");
        System.out.println(fruits);

        System.out.println(fruits.contains("Banana"));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(fruits.size());
        fruits.clear();
        System.out.println(fruits);
    }
}
