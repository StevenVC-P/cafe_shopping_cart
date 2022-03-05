package com.perscholas;

import java.util.Scanner;

public class Cappuccino extends Product {

    boolean peppermint;
    boolean whippedCream;

    public boolean getPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    Cappuccino(String name, double price, String description) {
        super();
        this.name = name;
        this.price = price;
        this.description = description;
        this.peppermint = false;
        this.whippedCream = false;
    }

    Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
        super();
        this.name = name;
        this.price = price;
        this.description = description;
        this.peppermint = false;
        this.whippedCream = false;
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
        if (addOption.equals("no")) option = false;

        return option;
    }

    @Override
    Boolean printOptions() {
        return null;
    }

    @Override
    Double calculateProductTotal(double price) {
        return price;
    }

    @Override
    Double calculateProductTotal(double price, int quantity, boolean peppermint, boolean whippedCream) {
        double total = price*quantity;
        if (peppermint) total += 2;
        if (whippedCream) total += 1;
        return total;
    }

}
