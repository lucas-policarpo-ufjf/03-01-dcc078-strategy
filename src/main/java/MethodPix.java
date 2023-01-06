public class MethodPix implements PaymentMethod {
  private String code;

  public MethodPix(String code) {
    this.code = code;
  }

  public String process(Float price, Integer installments) {
    if (installments > 1) {
      throw new IllegalArgumentException("Pix não pode ser parcelado!");
    }
    return "Pagamento com pix realizado!";
  }

  public String getCode() {
    return code;
  }

}
