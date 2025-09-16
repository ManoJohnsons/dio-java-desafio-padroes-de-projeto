package edu.dio.padroes.subsistema2;

public class CepApiService {

    private static CepApiService instance = new CepApiService();

    private CepApiService() {
        super();
    }

    public static CepApiService getInstance() {
        return instance;
    }

    public String getCity(String cep) {
        return "São Paulo";
    }

    public String getUf(String cep) {
        return "SP";
    }
}
