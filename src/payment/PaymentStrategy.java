package payment;

import java.util.*;

public interface PaymentStrategy {
    void pay(double amount);
    String getPaymentDetails();
}