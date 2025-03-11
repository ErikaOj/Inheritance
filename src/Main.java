import payment.*;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new RegularCustomer("Ava");
        Customer customer2 = new PremiumCustomer("Erika");
        Customer customer3 = new RegularCustomer("Bahar");

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9101-1121", "Avarmsh");
        PaymentStrategy paypal = new PayPalPayment("ErikaOj@gmail.com");
        PaymentStrategy bitcoin = new CryptoPayment("HEHEHEHEHE");

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        customer1.makePayment(creditCard, 99999);
        customer2.makePayment(paypal, 88888);
        customer3.makePayment(bitcoin, 989898);

        customer1.makePayment(bitcoin, 77777);
        customer2.makePayment(creditCard, 66666);
        customer3.makePayment(paypal, 767676);

        customer1.showPaymentHistory();
        customer2.showPaymentHistory();
        customer3.showPaymentHistory();
    }
}
