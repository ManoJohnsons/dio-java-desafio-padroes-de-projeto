package edu.dio.padroes;

import edu.dio.padroes.facade.Facade;
import edu.dio.padroes.singleton.SingletonEager;
import edu.dio.padroes.singleton.SingletonLazy;
import edu.dio.padroes.singleton.SingletonLazyHolder;
import edu.dio.padroes.strategy.ConcretePaymentCard;
import edu.dio.padroes.strategy.ConcretePaymentOnline;
import edu.dio.padroes.strategy.PaymentService;
import edu.dio.padroes.strategy.PaymentStrategy;
import edu.dio.padroes.templatemethod.ProcessData;
import edu.dio.padroes.templatemethod.ProcessProductData;
import edu.dio.padroes.templatemethod.ProcessUserData;

public class App {
    public static void main(String[] args) throws Exception {
        // Testando o padrão de projeto Singleton
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println();

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        System.out.println();

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        System.out.println();

        // Testando o padrão de projeto Strategy
        PaymentService paymentService = new PaymentService();
        PaymentStrategy paymentViaCard = new ConcretePaymentCard();
        PaymentStrategy paymentViaOnline = new ConcretePaymentOnline();
        paymentService.setPaymentStrategy(paymentViaOnline);
        paymentService.pay();
        System.out.println();
        paymentService.setPaymentStrategy(paymentViaCard);
        paymentService.pay();
        System.out.println();

        // Testando o padrão de projeto Facade
        Facade facade = new Facade();
        facade.migrateUser("John", "01001000");
        System.out.println();

        // Testando o padrão de projeto Template Method
        ProcessData processUserData = new ProcessUserData().setName("John").setAge(22).setRole("admin");
        ProcessData processProductData = new ProcessProductData().setName("PS5").setPrice(3500.0).setProductType("Hardware");
        processUserData.execute();
        processProductData.execute();
    }
}
