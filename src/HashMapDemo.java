import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Vamsi");
        students.put(102, "Ravi");
        students.put(103, "Sita");
        students.put(104, "Anil");

        System.out.println(students);

        System.out.println("Student with ID 102: " + students.get(102));

        students.put(103, "Geeta");
        System.out.println("After updating ID 103: " + students);

        students.remove(104);
        System.out.println("After removing ID 104: " + students);

        System.out.println("Contains key 101? " + students.containsKey(101));
        System.out.println("Contains value 'Sita'? " + students.containsValue("Sita"));

        System.out.println("Iterating using entrySet:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Size of HashMap: " + students.size());
        students.clear();
        System.out.println("After clearing: " + students);
    }
}

