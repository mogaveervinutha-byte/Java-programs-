class Payment {
    double calculateAmount(double amount) {
        return amount;
    }

    double calculateAmount(double amount, double discountPercentage) {
        return amount - amount * discountPercentage / 100;
    }
}

class CardPayment extends Payment {
    @Override
    double calculateAmount(double amount) {
        return amount + amount * 0.02;
    }
}

class UPIPayment extends Payment {
    @Override
    double calculateAmount(double amount) {
        return amount + amount * 0.005;
    }
}

public class PaymentProgram13 {
    public static void main(String[] args) {
        Payment p1 = new CardPayment();
        Payment p2 = new UPIPayment();

        System.out.println("Card Payment: " + p1.calculateAmount(1000));
        System.out.println("UPI Payment: " + p2.calculateAmount(1000));
        System.out.println("Discounted Amount: " + p1.calculateAmount(1000, 10));
    }
}
