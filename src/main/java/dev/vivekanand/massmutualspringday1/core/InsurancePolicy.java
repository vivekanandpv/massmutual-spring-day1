package dev.vivekanand.massmutualspringday1.core;

import dev.vivekanand.massmutualspringday1.collab.PaymentProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InsurancePolicy implements FinancialInstrument {
    private static final Logger LOGGER = LoggerFactory.getLogger(InsurancePolicy.class);

    private final PaymentProcessor paymentProcessor;
    private final String regionCode;

    public InsurancePolicy(
            PaymentProcessor paymentProcessor,
            @Value("${payment.provider.region}") String region
    ) {
        this.paymentProcessor = paymentProcessor;
        this.regionCode = region;
    }

    @Override
    public void pay() {
        LOGGER.info("Processing the payment for: " + regionCode);
        paymentProcessor.processPayment(1000);
        LOGGER.info("Finished processing the payment");
    }
}
