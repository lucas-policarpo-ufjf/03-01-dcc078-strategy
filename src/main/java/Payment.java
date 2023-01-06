public class Payment {
  private Float price;
  private Integer installments = 1;

  public Payment(Float price, Integer installments) {
    if (price <= 0) {
      throw new IllegalArgumentException("Preço invalido!");
    }
    if (installments <= 0) {
      throw new IllegalArgumentException("Parcelas invalidas!");
    }

    this.price = price;
    this.installments = installments;

  }

  public String process(PaymentMethod method) {
    return method.process(price, installments);
  }
}
