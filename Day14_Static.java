class MathUtil {
    static int square(int x) {
        return x * x;
    }

    int cube(int x) {
        return x * x * x;
    }
}

public class Day14_Static {
    public static void main(String[] args) {
        System.out.println("Square of 5: " + MathUtil.square(5)); // static

        MathUtil obj = new MathUtil();
        System.out.println("Cube of 5: " + obj.cube(5)); // non-static
    }
}
