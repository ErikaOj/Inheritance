import payment.*;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new RegularCustomer("Yasi");
        Customer customer2 = new PremiumCustomer("Erika");
        Customer customer3 = new RegularCustomer("Hana");

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9123-4567", "yaC");
        PaymentStrategy paypal = new PayPalPayment("ErikaOj@gmail.com");
        PaymentStrategy bitcoin = new BitcoinPayment("HanasWallet123");

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        customer1.makePayment(paypal, 99999);
        customer2.makePayment(bitcoin, 88888);
        customer3.makePayment(creditCard, 989898);

        customer1.makePayment(bitcoin, 77777);
        customer2.makePayment(creditCard, 66666);
        customer3.makePayment(paypal, 767676);

        customer1.showPaymentHistory();
        customer2.showPaymentHistory();
        customer3.showPaymentHistory();
    }
}
