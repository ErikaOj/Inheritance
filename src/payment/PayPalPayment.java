package payment;

import java.util.*;

public class PayPalPayment implements PaymentStrategy {
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid " + amount + " with paypal");
    }

    @Override
    public String getPaymentDetails() {
        return "paid with this paypal email : " + email;
    }
}