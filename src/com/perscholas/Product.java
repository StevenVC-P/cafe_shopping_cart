package com.perscholas;

public abstract class Product {
    String name;
    double price;
    String description;
    int quantity = 0;

    Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    Product (){}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    abstract boolean addOptions(boolean option, String optionName);

    abstract boolean printOptions();

    abstract double calculateProductTotal(double price);

    abstract double calculateProductTotal(double price, int quantity, boolean extraShot, boolean macchiato);
}
