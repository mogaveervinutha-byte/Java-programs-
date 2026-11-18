import java.util.Scanner;

class Student {
    String USN, Name, Branch;
    long Phone;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        USN = sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Branch: ");
        Branch = sc.nextLine();

        System.out.print("Enter Phone: ");
        Phone = sc.nextLong();
        sc.nextLine();
    }

    void display() {
        System.out.println(USN + "\t" + Name + "\t" + Branch + "\t" + Phone);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student s[] = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("Enter details of Student " + (i + 1));
            s[i].getDetails();
        }

        System.out.println("\nUSN\tName\tBranch\tPhone");

        for (int i = 0; i < n; i++) {
            s[i].display();
        }
    }
}
