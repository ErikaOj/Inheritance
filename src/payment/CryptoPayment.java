package payment;

import java.util.*;

public class CryptoPayment implements PaymentStrategy {
    String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid " + amount + " with crypto currency");
    }

    @Override
    public String getPaymentDetails() {
        return "paid with crypto. wallet address : " + walletAddress;
    }
}
