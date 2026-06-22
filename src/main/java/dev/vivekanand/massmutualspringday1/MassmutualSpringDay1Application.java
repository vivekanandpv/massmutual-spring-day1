package dev.vivekanand.massmutualspringday1;

import dev.vivekanand.massmutualspringday1.collab.PaymentProcessor;
import dev.vivekanand.massmutualspringday1.collab.StripePaymentProcessor;
import dev.vivekanand.massmutualspringday1.core.FinancialInstrument;
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

        FinancialInstrument instrument = context.getBean(FinancialInstrument.class);
        instrument.pay();
    }

}
