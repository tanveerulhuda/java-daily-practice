class Car {
    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Day8_Constructor {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2020);
        Car c2 = new Car("Honda", 2022);
        c1.display();
        c2.display();
    }
}
