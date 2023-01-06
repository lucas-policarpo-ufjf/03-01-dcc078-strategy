import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

  @Test
  void shouldPayWithPix() {
    Order order = new Order("Pendrive 32GB");
    assertEquals("Pagamento com pix realizado!", order.processPixPayment(74.3f, 1, "code"));
  }

  @Test
  void shouldThrowsWhenPayingWithPixAndInvalidInstallments() {
    try {
      Order order = new Order("Pendrive 32GB");
      assertEquals("Pagamento com pix realizado!", order.processPixPayment(74.3f, 2, "code"));
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Pix não pode ser parcelado!", e.getMessage());
    }
  }

  @Test
  void shouldPayWithCreditCard() {
    Order order = new Order("Pendrive 32GB");
    assertEquals("Pagamento com crédito realizado!",
        order.processCreditCardPayment(74.3f, 3, "Lucas S.", "5456", "156", "2027"));
  }

  @Test
  void shouldThrowsWhenPayingWithCreditCardAndInvalidInstallments() {
    try {
      Order order = new Order("Pendrive 32GB");
      assertEquals("Pagamento com crédito realizado!",
          order.processCreditCardPayment(74.3f, 13, "Lucas S.", "5456", "156", "2027"));
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Numero de parcelas maxima excedido!", e.getMessage());
    }
  }
}
