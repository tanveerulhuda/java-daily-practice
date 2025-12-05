import java.util.Scanner;

// ==================== Student Class ====================
class Student {
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

// ==================== Main Program ====================
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = null; // initially no student

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  // buffer clear

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();

                    student = new Student(name, age, marks);
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (student == null) {
                        System.out.println("No student found! Please add first.");
                    } else {
                        student.display();
                    }
                    break;

                case 3:
                    if (student == null) {
                        System.out.println("No student found! Please add first.");
                    } else {
                        System.out.print("Enter new marks: ");
                        student.marks = sc.nextDouble();
                        System.out.println("Marks Updated Successfully!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}