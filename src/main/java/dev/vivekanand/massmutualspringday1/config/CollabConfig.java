package dev.vivekanand.massmutualspringday1.config;

import dev.vivekanand.massmutualspringday1.collab.PaymentProcessor;
import dev.vivekanand.massmutualspringday1.collab.StripePaymentProcessor;
import dev.vivekanand.massmutualspringday1.collab.UpiPaymentProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
public class CollabConfig {
//    @Bean
//    @ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
//    public PaymentProcessor provideStripe() {
//        return new StripePaymentProcessor();
//    }
//
//    @Bean
//    @ConditionalOnProperty(name = "payment.provider", havingValue = "upi")
//    public PaymentProcessor provideUpi() {
//        return new UpiPaymentProcessor();
//    }
}
