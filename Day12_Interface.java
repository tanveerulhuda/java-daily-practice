interface Payment {
    void pay(); // abstract method
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment done via UPI.");
    }
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment done via Credit Card.");
    }
}

public class Day12_Interface {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        p1.pay();
        p2.pay();
    }
}
