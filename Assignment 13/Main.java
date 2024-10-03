import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// Defining an Employee record
record Employee(int id, String name, String department) {
}

// Main class to manage Employee records
public class Main {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    // Method to add an employee to the map
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.id(), employee);
    }

    // Method to find an employee by ID
    public Optional<Employee> findEmployeeById(int id) {
        return Optional.ofNullable(employeeMap.get(id));
    }

    // Method to update the department of an employee
    public boolean updateEmployeeDepartment(int id, String newDepartment) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            employeeMap.put(id, new Employee(employee.id(), employee.name(), newDepartment));
            return true;
        }
        return false;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        // Adding employees
        management.addEmployee(new Employee(1, "Alice", "Engineering"));
        management.addEmployee(new Employee(2, "Bob", "Marketing"));
        management.addEmployee(new Employee(3, "Charlie", "Finance"));

        // Finding and displaying an employee by ID
        int searchId = 2;
        Optional<Employee> employeeOpt = management.findEmployeeById(searchId);
        employeeOpt.ifPresentOrElse(
                employee -> System.out.println("Found Employee: " + employee),
                () -> System.out.println("Employee not found with ID: " + searchId));

        // Updating the department of an employee
        boolean isUpdated = management.updateEmployeeDepartment(2, "Sales");
        if (isUpdated) {
            System.out.println("Employee's department updated successfully.");
            System.out.println("Updated Employee: " + management.findEmployeeById(2).get());
        } else {
            System.out.println("Failed to update department. Employee not found.");
        }
    }
}
