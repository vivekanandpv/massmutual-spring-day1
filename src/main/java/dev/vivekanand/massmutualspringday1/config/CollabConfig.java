package dev.vivekanand.massmutualspringday1.config;

import dev.vivekanand.massmutualspringday1.collab.PaymentProcessor;
import dev.vivekanand.massmutualspringday1.collab.StripePaymentProcessor;
import dev.vivekanand.massmutualspringday1.collab.UpiPaymentProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CollabConfig {
    @Bean
    public PaymentProcessor provideStripe() {
        return new StripePaymentProcessor();
    }

    @Primary
    @Bean
    public PaymentProcessor provideUpi() {
        return new UpiPaymentProcessor();
    }
}
