package edu.dio.padroes.subsistema1;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveUser(String name, String cep, String city, String uf) {
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println("Nome: " + name);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + city);
        System.out.println("UF: " + uf);
    }
}
