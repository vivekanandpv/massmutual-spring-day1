package dev.vivekanand.massmutualspringday1.collab;

public class StripePaymentProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        return true;
    }
}
