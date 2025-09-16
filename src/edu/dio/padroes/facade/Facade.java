package edu.dio.padroes.facade;

import edu.dio.padroes.subsistema1.CrmService;
import edu.dio.padroes.subsistema2.CepApiService;

public class Facade {
    public void migrateUser(String name, String cep) {
        String city = CepApiService.getInstance().getCity(cep);
        String uf = CepApiService.getInstance().getUf(cep);

        CrmService.saveUser(name, cep, city, uf);
    }
}
