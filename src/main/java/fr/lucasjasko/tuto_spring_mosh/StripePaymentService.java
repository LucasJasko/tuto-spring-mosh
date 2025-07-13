package fr.lucasjasko.tuto_spring_mosh;

public class StripePaymentService implements PaymentService {

  public void processPayment(double amount) {
    System.out.println("STRIPE");
    System.out.println("Amount: " + amount);
  }

}
