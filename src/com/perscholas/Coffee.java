package com.perscholas;

import java.util.Scanner;

public class Coffee extends Product {

    boolean milk;
    boolean sugar;

    Coffee(String name, double price, String description, boolean milk, boolean sugar) {
        super(name, price, description);
        this.milk = milk;
        this.sugar = sugar;
    }

    public Coffee() {
        super("Coffee", 2.00, "Hot mug of java");
        this.milk = false;
        this.sugar = false;
    }

    public boolean getSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean getMilk() {return milk;}

    public void setMilk(boolean milk) {
        this.milk = milk;
    }


    Coffee(boolean milk, boolean sugar) {
        super("Coffee", 2.00, "Hot mug of java");
        this.milk = false;
        this.sugar = false;
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
        return price* 1;
    }

    @Override
    double calculateProductTotal(double price, int quantity, boolean milk, boolean sugar) {
        return price*quantity;
    }

}
