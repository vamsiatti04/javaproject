class Emp {
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Emp {
    double monthlySalary = 5000;

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Emp {
    int hoursWorked = 80;
    double hourlyRate = 20;

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Emp emp1 = new FullTimeEmployee();
        Emp emp2 = new PartTimeEmployee();

        System.out.println(emp1.calculateSalary());
        System.out.println(emp2.calculateSalary());
    }
}

