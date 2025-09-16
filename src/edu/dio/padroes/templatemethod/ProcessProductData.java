package edu.dio.padroes.templatemethod;

public class ProcessProductData extends ProcessData {
    private String name;
    private double price;
    private String productType;

    @Override
    protected void showProcessedData() {
        System.out.println("=== DADOS EXTRAIDOS ===");
        System.out.println("Nome: " + name);
        System.out.println("Preço: R$" + price);
        System.out.println("Tipo do produto: " + productType);
        System.out.println();
    }

    public ProcessProductData setName(String name) {
        this.name = name;
        return this;
    }

    public ProcessProductData setPrice(double price) {
        this.price = price;
        return this;
    }

    public ProcessProductData setProductType(String productType) {
        this.productType = productType;
        return this;
    }
}
