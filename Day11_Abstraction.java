abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started with kick.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started with key.");
    }
}

public class Day11_Abstraction {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        v1.start();
        v2.start();
        v2.stop();
    }
}
