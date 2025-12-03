class Student {
    String name;
    int age;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
	
public class Day7_OOP_ClassObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tanveer";
        s1.age = 24;
        s1.marks = 88.5;

        System.out.println("--- Student Details ---");
        s1.display();
    }
}
