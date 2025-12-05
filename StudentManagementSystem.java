import java.io.*;
import java.util.*;

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

public class StudentManagementSystem {

    static double highestMarks(Student[] students, int count) {
        double max = -1;
        for (int i = 0; i < count; i++) {
            if (students[i].marks > max) {
                max = students[i].marks;
            }
        }
        return max;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Student[] students = new Student[100];
        int count = 0;

        students[count++] = new Student("Tanveer", 24, 88.5);
        students[count++] = new Student("Ayesha", 22, 91.0);
        students[count++] = new Student("Rahul", 23, 76.5);

        System.out.println("✔ Sample student data loaded automatically!\n");

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Show Highest Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String input = br.readLine();

            if (!input.matches("\\d+")) {
                System.out.println("Invalid input! Enter a number.");
                continue;
            }

            int choice = Integer.parseInt(input);

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = br.readLine();

                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(br.readLine());

                    System.out.print("Enter marks: ");
                    double marks = Double.parseDouble(br.readLine());

                    students[count++] = new Student(name, age, marks);
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    System.out.println("\n--- All Students ---");
                    for (int i = 0; i < count; i++) {
                        students[i].display();
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = br.readLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].name.equalsIgnoreCase(searchName)) {
                            System.out.println("\nStudent Found:");
                            students[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
                    break;

                case 4:
                    double highest = highestMarks(students, count);
                    System.out.println("Highest Marks: " + highest);
                    break;

                case 5:
                    System.out.println("Exiting program... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
