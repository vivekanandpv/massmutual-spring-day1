package dev.vivekanand.massmutualspringday1.collab;

public class UpiPaymentProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        return true;
    }
}
