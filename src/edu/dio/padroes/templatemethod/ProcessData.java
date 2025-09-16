package edu.dio.padroes.templatemethod;

public abstract class ProcessData {
    public void execute() {
        miningData();
        showProcessedData();
    }

    protected abstract void showProcessedData();

    private void miningData() {
        System.out.println("Minerando dados...");
    }
}
