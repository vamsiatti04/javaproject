import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Vamsi");
        students.add("Ravi");
        students.add("Sita");
        students.add("Anil");

        System.out.println(students);
        System.out.println(students.get(0));

        students.set(2, "Geeta");
        System.out.println(students);

        students.remove(1);
        System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        for (String student : students) {
            System.out.println(student);
        }

        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(students.contains("Anil"));
        System.out.println(students.size());
    }
}

