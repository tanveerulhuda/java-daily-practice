import java.util.Scanner;

// ==================== Student Class (OOP) ====================
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
        System.out.println("-------------------------");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("-------------------------");
    }
}

// ==================== Main Project Class ======================
public class StudentManagementSystem {

    // Method to find highest marks
    static double highestMarks(Student[] students, int count) {
        double max = -1;
        for (int i = 0; i < count; i++) {
            if (students[i].marks > max) {
                max = students[i].marks;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;

        // ==================== AUTO-FILLED SAMPLE DATA ====================
        students[count++] = new Student("Tanveer", 24, 88.5);
        students[count++] = new Student("Ayesha", 22, 91.0);
        students[count++] = new Student("Rahul", 23, 76.5);

        System.out.println("✔ Sample student data loaded automatically!\n");

        // ==================== MENU LOOP ====================
        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Show Highest Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();

                    students[count++] = new Student(name, age, marks);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students added yet!");
                    } else {
                        System.out.println("\n--- All Students ---");
                        for (int i = 0; i < count; i++) {
                            students[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].name.equalsIgnoreCase(searchName)) {
                            System.out.println("\nStudent Found:");
                            students[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No students available!");
                    } else {
                        double highest = highestMarks(students, count);
                        System.out.println("Highest Marks: " + highest);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
