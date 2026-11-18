class Employee {
    protected int employeeId;
    protected String name;
    protected double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {
    private double allowance;
    private double bonus;

    PermanentEmployee(int employeeId, String name, double basicSalary, double allowance, double bonus) {
        super(employeeId, name, basicSalary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    ContractEmployee(int employeeId, String name, double basicSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeProgram8 {
    public static void main(String[] args) {
        Employee[] employees = {
            new PermanentEmployee(101, "Asha", 30000, 5000, 3000),
            new ContractEmployee(102, "Ravi", 0, 160, 250)
        };

        for (Employee employee : employees) {
            employee.display();
            System.out.println();
        }
    }
}
