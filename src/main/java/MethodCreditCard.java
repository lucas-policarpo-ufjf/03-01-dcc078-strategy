public class MethodCreditCard implements PaymentMethod {
  private String fullName;
  private String cardNumber;
  private String securityCode;
  private String expiration;

  public MethodCreditCard(String fullName, String cardNumber, String securityCode, String expiration) {
    this.fullName = fullName;
    this.cardNumber = cardNumber;
    this.securityCode = securityCode;
    this.expiration = expiration;
  }

  public String process(Float price, Integer installments) {
    if (installments > 12) {
      throw new IllegalArgumentException("Numero de parcelas maxima excedido!");
    }
    return "Pagamento com crédito realizado!";
  }

  public String getFullName() {
    return fullName;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public String getSecurityCode() {
    return securityCode;
  }

  public String getExpiration() {
    return expiration;
  }

}
