public class Main {
    public static void main(String[] args) {
        // Creating instances of FullTimeEmployee and PartTimeEmployee
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 102, 20, 100);

        // Demonstrating the usage of calculateSalary() and its overloaded method
        System.out.println("Full Time Employee Details:");
        fullTimeEmp.displayEmployeeDetails();
        System.out.println("Base Salary: " + fullTimeEmp.calculateSalary());
        System.out.println("Salary with Bonus: " + fullTimeEmp.calculateSalary(500));

        System.out.println("\nPart Time Employee Details:");
        partTimeEmp.displayEmployeeDetails();
        System.out.println("Base Salary: " + partTimeEmp.calculateSalary());
        System.out.println("Salary with Bonus: " + partTimeEmp.calculateSalary(100));
    }
}

class Employee {
    // Base class Employee
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Base salary calculation method (to be overridden)
    public double calculateSalary() {
        return 0.0; // Default implementation, overridden by subclasses
    }

    // Overloaded salary calculation method with a bonus
    public double calculateSalary(double bonus) {
        return calculateSalary() + bonus;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}