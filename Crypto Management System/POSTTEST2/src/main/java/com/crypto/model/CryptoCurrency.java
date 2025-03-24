package com.crypto.model;

public class CryptoCurrency {
    private String id; // private access modifier
    protected String name; // protected access modifier
    double price; // default (package-private) access modifier

    // Constructor
    public CryptoCurrency(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CryptoCurrency{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}