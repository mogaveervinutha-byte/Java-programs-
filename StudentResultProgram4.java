class ResultSummary {
    private String usn;
    private String name;
    private int total;
    private double average;

    ResultSummary(String usn, String name, int total, double average) {
        this.usn = usn;
        this.name = name;
        this.total = total;
        this.average = average;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

class StudentResult {
    private String usn;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;
    private static int studentCount = 0;
    private final int MAX_MARKS = 100;

    StudentResult(String usn, String name, int marks1, int marks2, int marks3) {
        if (!validMarks(marks1) || !validMarks(marks2) || !validMarks(marks3)) {
            throw new IllegalArgumentException("Marks must be between 0 and " + MAX_MARKS);
        }
        this.usn = usn;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        studentCount++;
    }

    private boolean validMarks(int marks) {
        return marks >= 0 && marks <= MAX_MARKS;
    }

    String getUsn() {
        return usn;
    }

    String getName() {
        return name;
    }

    int getMarks1() {
        return marks1;
    }

    int getMarks2() {
        return marks2;
    }

    int getMarks3() {
        return marks3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    void display(boolean showResult) {
        display();
        if (showResult) {
            System.out.println("Total: " + calculateTotal());
            System.out.println("Average: " + calculateAverage());
        }
    }

    ResultSummary getResultSummary() {
        return new ResultSummary(usn, name, calculateTotal(), calculateAverage());
    }

    static int getStudentCount() {
        return studentCount;
    }
}

public class StudentResultProgram4 {
    public static void main(String[] args) {
        StudentResult s1 = new StudentResult("1CI23CS001", "Asha", 85, 90, 88);
        StudentResult s2 = new StudentResult("1CI23CS002", "Ravi", 78, 82, 91);

        s1.display();
        System.out.println();
        s2.display(true);

        System.out.println("Student count: " + StudentResult.getStudentCount());
        System.out.println("Result summary:");
        s1.getResultSummary().display();
    }
}
