package dev.vivekanand.massmutualspringday1.core;

import dev.vivekanand.massmutualspringday1.collab.PaymentProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InsurancePolicy implements FinancialInstrument {
    private static final Logger LOGGER = LoggerFactory.getLogger(InsurancePolicy.class);
    private final PaymentProcessor paymentProcessor;

    public InsurancePolicy(@Qualifier("upi") PaymentProcessor paymentProcessor) {

        this.paymentProcessor = paymentProcessor;
    }

    @Override
    public void pay() {
        LOGGER.info("Processing the payment");
        paymentProcessor.processPayment(1000);
        LOGGER.info("Finished processing the payment");
    }
}
