class Person {
    private String name;
    private int age;
    private static int peopleCount = 0;
    static final String COLLEGE_NAME = "Cambridge Institute of Technology";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        peopleCount++;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + COLLEGE_NAME);
    }

    void displayDetails(boolean showCollege) {
        displayDetails();
        if (showCollege) {
            System.out.println("Total People: " + peopleCount);
        }
    }

    static int getPeopleCount() {
        return peopleCount;
    }

    static class Department {
        private String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }
}

class Student extends Person {
    private String usn;
    private String branch;

    Student(String name, int age, String usn, String branch) {
        super(name, age);
        this.usn = usn;
        this.branch = branch;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("USN: " + usn);
        System.out.println("Branch: " + branch);
    }
}

class Faculty extends Person {
    private String employeeId;
    private String designation;

    Faculty(String name, int age, String employeeId, String designation) {
        super(name, age);
        this.employeeId = employeeId;
        this.designation = designation;
    }

    @Override
    void displayDetails() {
        System.out.println("Faculty Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + designation);
    }
}

class Administrator extends Person {
    private String administratorId;
    private String role;

    Administrator(String name, int age, String administratorId, String role) {
        super(name, age);
        this.administratorId = administratorId;
        this.role = role;
    }

    @Override
    void displayDetails() {
        System.out.println("Administrator Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Administrator ID: " + administratorId);
        System.out.println("Role: " + role);
    }
}

public class CollegeManagementProgram14 {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Asha", 20, "1CI23CS001", "CSE"),
            new Faculty("Ravi", 40, "F101", "Professor"),
            new Administrator("Meena", 35, "A201", "Office Administrator")
        };

        for (Person person : people) {
            person.displayDetails();
            System.out.println();
        }

        Person.Department department = new Person.Department("Computer Science");
        department.displayDepartment();
        System.out.println("Total People: " + Person.getPeopleCount());
    }
}
