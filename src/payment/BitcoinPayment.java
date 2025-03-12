package payment;

import java.util.*;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid " + amount + " with bitcoin");
    }

    @Override
    public String getPaymentDetails() {
        return "paid with bitcoin. wallet address : " + walletAddress;
    }
}
