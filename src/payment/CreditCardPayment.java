package payment;

import java.util.*;

public class CreditCardPayment implements PaymentStrategy {
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid " + amount + " with credit card");
    }

    @Override
    public String getPaymentDetails() {
        return "paid with card number : " + cardNumber + " name : " + cardHolderName;
    }
}

