package edu.dio.padroes.templatemethod;

public class ProcessUserData extends ProcessData {
    private String name;
    private int age;
    private String role;

    @Override
    protected void showProcessedData() {
        System.out.println("=== DADOS EXTRAIDOS ===");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Função: " + role);
        System.out.println();
    }

    public ProcessUserData setName(String name) {
        this.name = name;
        return this;
    }

    public ProcessUserData setAge(int age) {
        this.age = age;
        return this;
    }

    public ProcessUserData setRole(String role) {
        this.role = role;
        return this;
    }
}
