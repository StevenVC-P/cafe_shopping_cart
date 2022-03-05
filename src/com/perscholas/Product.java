package com.perscholas;

public abstract class Product {
    String name;
    double price;
    String description;
    int quantity = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Product (){}

    Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    abstract Boolean addOptions(boolean option, String optionName);

    abstract Boolean printOptions();

    abstract Double calculateProductTotal(double price);

    abstract Double calculateProductTotal(double price, int quantity, boolean extraShot, boolean macchiato);
}
