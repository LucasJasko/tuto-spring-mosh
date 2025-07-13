package fr.lucasjasko.tuto_spring_mosh;

public class OrderService {

  private PaymentService paymentService;

  public OrderService(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  public void placeOrder() {
    paymentService.processPayment(10);
  }

}
