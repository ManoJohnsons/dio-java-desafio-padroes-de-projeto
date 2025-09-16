package edu.dio.padroes.strategy;

public class ConcretePaymentCard implements PaymentStrategy {

    @Override
    public void payment() {
        System.out.println("Pagamento por cartão.");
    }
}
