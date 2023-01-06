public interface PaymentMethod {
  String process(Float price, Integer installments);
}
