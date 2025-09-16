package edu.dio.padroes.strategy;

public class ConcretePaymentOnline implements PaymentStrategy {

    @Override
    public void payment() {
        System.out.println("Pagamento via Internet.");
    }
    
}
