package com.perscholas;

import java.util.Scanner;

public class Cappuccino extends Product {

    boolean peppermint;
    boolean whippedCream;

    public boolean getPeppermint() {return peppermint;}

    public void setPeppermint(boolean peppermint) {
        this.option1 = peppermint;
    }

    public boolean getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.option2 = whippedCream;
    }

    Cappuccino() {
        super("Cappuccino", 3.50, "A perfect balance of espresso, steamed milk and foam");
        this.peppermint = false;
        this.whippedCream = false;
    }

    Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
        super();
        this.name = name;
        this.price = price;
        this.description = description;
        this.peppermint = option1;
        this.whippedCream = option2;
    }

    @Override
    boolean addOptions(Scanner input, boolean option, String optionName) {
        System.out.printf("Would you like to add %s? 'Yes' or 'No'\n", optionName);
        String addOption = input.nextLine();
        addOption=addOption.toLowerCase();
        addOption=addOption.trim();

        while ((!addOption.equals("yes")) && (!addOption.equals("no"))) {
            System.out.printf("Please state 'Yes' or 'No' for %s\n", optionName);
            addOption = input.nextLine();
        }
        if (addOption.equals("yes")) option = true;
        if (addOption.equals("no")) option = false;

        return option;
    }

    @Override
    boolean printOptions() {
        return false;
    }

    @Override
    double calculateProductTotal(double price) {
        return price;
    }

    @Override
    double calculateProductTotal(double price, boolean peppermint, boolean whippedCream) {
        double total = price;
        if (peppermint) total += 2;
        if (whippedCream) total += 1;
        return total;
    }

}
