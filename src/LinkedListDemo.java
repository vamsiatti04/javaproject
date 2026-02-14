import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Vamsi");
        names.add("Ravi");
        names.add("Sita");
        names.add("Anil");

        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        names.set(2, "Geeta");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (String name : names) {
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(names.contains("Anil"));
        System.out.println(names.size());
    }
}
