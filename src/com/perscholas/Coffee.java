package com.perscholas;

import java.util.Scanner;

public class Coffee extends Product {

    boolean milk;
    boolean sugar;

    public boolean getMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean getSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    Coffee(String name, double price, String description) {
        super();
        this.name = name;
        this.price = price;
        this.description = description;
        this.milk = false;
        this.sugar = false;
    }

    Coffee(String name, double price, String description, boolean milk, boolean sugar) {
        super();
        this.name = name;
        this.price = price;
        this.description = description;
        this.milk = false;
        this.sugar = false;
    }

    public Coffee() {

    }

    @Override
    Boolean addOptions(boolean option, String optionName) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Would you like to add %s? 'Yes' or 'No'\n", optionName);
        String addOption = input.nextLine();
        addOption=addOption.toLowerCase();
        addOption=addOption.trim();

        while ((!addOption.equals("yes")) && (!addOption.equals("no"))) {
            System.out.printf("Please state 'Yes' or 'No' for %s\n", optionName);
            addOption = input.nextLine();
        }
        if (addOption.equals("yes")) option = true;

        return option;
    }

    @Override
    Boolean printOptions() {
        return null;
    }

    @Override
    Double calculateProductTotal(double price) {
        return price* 1;
    }

    @Override
    Double calculateProductTotal(double price, int quantity, boolean milk, boolean sugar) {
        return price*quantity;
    }

}
