class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    final void country() {
        System.out.println("Country: USA");
    }

    void role() {
        System.out.println("Person role");
    }
}

class Employee extends Person {

    private double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    @Override
    void role() {
        System.out.println("Employee role");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Person p = new Employee("John", 50000);

        p.country();
        p.role();

        Employee e = (Employee) p;
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}

