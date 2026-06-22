package dev.vivekanand.massmutualspringday1.config;

import dev.vivekanand.massmutualspringday1.collab.PaymentProcessor;
import dev.vivekanand.massmutualspringday1.collab.StripePaymentProcessor;
import dev.vivekanand.massmutualspringday1.collab.UpiPaymentProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
public class CollabConfig {
    @Bean(name = "stripe")
    public PaymentProcessor provideStripe() {
        return new StripePaymentProcessor();
    }

    @Bean(name = "upi")
    public PaymentProcessor provideUpi() {
        return new UpiPaymentProcessor();
    }
}
