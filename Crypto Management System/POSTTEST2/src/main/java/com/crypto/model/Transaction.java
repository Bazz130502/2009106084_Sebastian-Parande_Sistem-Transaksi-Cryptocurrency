package com.crypto.model;

public class Transaction {
    private String transactionId; // private access modifier
    protected String cryptoId; // protected access modifier
    double amount; // default (package-private) access modifier
    public String type; // public access modifier

    // Constructor
    public Transaction(String transactionId, String cryptoId, double amount, String type) {
        this.transactionId = transactionId;
        this.cryptoId = cryptoId;
        this.amount = amount;
        this.type = type;
    }

    // Getter dan Setter
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCryptoId() {
        return cryptoId;
    }

    public void setCryptoId(String cryptoId) {
        this.cryptoId = cryptoId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", cryptoId='" + cryptoId + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}