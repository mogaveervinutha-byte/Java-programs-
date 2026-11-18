class University {
    private String universityName;

    University(String universityName) {
        this.universityName = universityName;
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
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

    class Faculty {
        private String facultyName;
        private String designation;

        Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        void displayFaculty() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);
            System.out.println("University: " + universityName);
        }
    }
}

public class UniversityProgram6 {
    public static void main(String[] args) {
        University.Department department = new University.Department("Computer Science");
        University university = new University("Cambridge Institute of Technology");
        University.Faculty faculty = university.new Faculty("Anita", "Professor");

        university.displayUniversity();
        department.displayDepartment();
        faculty.displayFaculty();
    }
}
