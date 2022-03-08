package com.perscholas;

import java.util.Scanner;

public class Espresso extends Product {

    boolean extraShot;
    boolean macchiato;

    public boolean getExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean getMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }

    Espresso(String name, double price, String description) {
        super();
        this.name = name;
        this.price = price;
        this.description = description;
        this.extraShot = false;
        this.macchiato = false;
    }

    Espresso() {
        super("Espresso", 3.00, "For a jolt of caffeine");
        this.extraShot = false;
        this.macchiato = false;
    }

    @Override
    boolean addOptions(boolean option, String optionName) {
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
    boolean printOptions() {
        return false;
    }

    @Override
    double calculateProductTotal(double price) {
        return price;
    }

    @Override
    double calculateProductTotal(double price, int quantity, boolean extraShot, boolean macchiato) {
        double total = price*quantity;
        if (extraShot) total += 2;
        if (macchiato) total += 1;
        return total;
    }

}
