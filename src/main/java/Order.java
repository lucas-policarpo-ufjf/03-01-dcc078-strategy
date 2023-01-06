
public class Order {
  private String productName;

  public Order(String productName) {
    this.productName = productName;
  }

  public String processPixPayment(Float price, Integer installments, String pixCode) {
    Payment payment = new Payment(price, installments);
    return payment.process(new MethodPix(pixCode));
  }

  public String processCreditCardPayment(Float price, Integer installments, String fullName, String cardNumber,
      String securityCode, String expiration) {
    Payment payment = new Payment(price, installments);
    return payment.process(new MethodCreditCard(fullName, cardNumber, securityCode, expiration));
  }

  public String getProductName() {
    return productName;
  }

}
