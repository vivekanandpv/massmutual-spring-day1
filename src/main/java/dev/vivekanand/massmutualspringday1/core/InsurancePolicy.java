package dev.vivekanand.massmutualspringday1.core;

import dev.vivekanand.massmutualspringday1.collab.PaymentProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InsurancePolicy implements FinancialInstrument {
    private static final Logger LOGGER = LoggerFactory.getLogger(InsurancePolicy.class);

    private PaymentProcessor paymentProcessor;

    @Override
    public void pay() {
        LOGGER.info("Processing the payment");
        paymentProcessor.processPayment(1000);
        LOGGER.info("Finished processing the payment");
    }

    @Autowired
    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
}
