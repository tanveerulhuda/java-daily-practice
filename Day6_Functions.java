public class Day6_Functions {

    // Method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to find factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10: " + add(5, 10));
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
