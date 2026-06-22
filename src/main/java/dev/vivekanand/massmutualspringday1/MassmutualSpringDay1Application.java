package dev.vivekanand.massmutualspringday1;

import dev.vivekanand.massmutualspringday1.collab.PaymentProcessor;
import dev.vivekanand.massmutualspringday1.collab.StripePaymentProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class MassmutualSpringDay1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MassmutualSpringDay1Application.class, args);

        List<PaymentProcessor> beans = new ArrayList<>(context.getBeansOfType(PaymentProcessor.class).values());
        PaymentProcessor paymentProcessor = beans.get(0);
        boolean paymentStatus = paymentProcessor.processPayment(100.0);
        System.out.println("Payment status: " + paymentStatus);
    }

}
