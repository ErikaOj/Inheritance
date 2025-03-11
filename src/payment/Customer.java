package payment;

import java.util.*;

public abstract class Customer {
     String name;
     ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String paymentInfo = "amount : " + amount + "  /  " + paymentStrategy.getPaymentDetails();
        paymentHistory.add(paymentInfo);
    }

    public void showPaymentHistory() {
        System.out.println("Payment history of " + name + " :");
        for (String payment : paymentHistory) {
            System.out.println(payment);
        }
    }
}
