public class Day5_Arrays {
    public static void main(String[] args) {
        int[] marks = {85, 92, 76, 88, 90};

        System.out.println("--- Student Marks ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        int total = 0;
        for (int m : marks) {
            total += m;
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + (total / marks.length));
    }
}
