import java.util.Scanner;

public class Day3_Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) System.out.println("Grade: A");
        else if (marks >= 75) System.out.println("Grade: B");
        else if (marks >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");

        System.out.print("Enter a number (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected ONE");
                break;
            case 2:
                System.out.println("You selected TWO");
                break;
            case 3:
                System.out.println("You selected THREE");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
