package com.perscholas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CafeApp {
    public static void main() {
//        Coffee coffee1 = new Coffee();
//        coffee1.setName("Coffee");
        //initialing cart variables
        final double salesTax = 2.01;
        List<Product> orderList = new ArrayList<>();

        double total;
        double coffeeTotal = 0;
        double espressoTotal = 0;
        double cappuccinoTotal = 0;

        //initializing product classes
        //Espresso espresso = new Espresso("Espresso", 3.00, "For a jolt of caffeine");
        //Cappuccino cappuccino = new Cappuccino("Cappuccino", 3.50, "A perfect balance of espresso, steamed milk and foam");

        //opening message for user
        Scanner select = new Scanner(System.in);
        System.out.println("Welcome to Baby Yoda's caffeine addiction!");
        System.out.println("Please select from the list below:");
        System.out.println("1: Coffee\n2: Cappuccino\n3:Espresso\n4: Check Out");

        int choice = select.nextInt();
        Product p;
        //ensure any number chosen is between 1 and 4
        while ((choice < 1) || (choice > 4)) {
            System.out.println("Please select from this menu: \n1: Coffee\n2: Cappuccino\n3:Espresso\n4: Check Out");
            choice = select.nextInt();
        }

        // for any choice besides 4, we go into the menu options for the selected product class
        while ((choice != 4)) {
            if (choice == 1) {
                System.out.println("How many coffees? ");
                Scanner quantities = new Scanner(System.in);
                byte quantity = quantities.nextByte();
                if (quantity > 0) {
                    for (int i = 0; i < quantity; i++) {
                        Coffee coffee = new Coffee();
                        coffee.setMilk(coffee.addOptions(coffee.milk, "milk"));
                        coffee.setSugar(coffee.addOptions(coffee.sugar, "sugar"));

                        if ((coffee.milk) && (coffee.sugar)) {
                            System.out.println("Enjoy your " + coffee.name + ": " + coffee.description + " with milk & sugar.");
                        } else if (coffee.milk) {
                            System.out.println("Enjoy your " + coffee.name + ": " + coffee.description + " with milk.");
                        } else if (coffee.sugar) {
                            System.out.println("Enjoy your " + coffee.name + ": " + coffee.description + " with sugar.");
                        } else
                            System.out.println(coffee.name + ": " + coffee.description);
                        orderList.add(coffee);
                    }
                }
            }

            if (choice == 2) {
                Scanner quantities = new Scanner(System.in);
                System.out.println("\nHow many espresso? ");

                byte quantity = quantities.nextByte();
                if (quantity > 0) {

                    for (int i = 0; i < quantity; i++) {
                        Espresso espresso = new Espresso();
                        espresso.setExtraShot(espresso.addOptions(espresso.extraShot, "extra shot"));
                        espresso.setMacchiato(espresso.addOptions(espresso.macchiato, "macchiato"));

                        if ((espresso.extraShot) && (espresso.macchiato)) {
                            System.out.println("Enjoy your " + espresso.name + ": " + espresso.description + " macchiato style with an extra shot.");
                        } else if (espresso.extraShot) {
                            System.out.println("Enjoy your " + espresso.name + ": " + espresso.description + " with an extra shot.");
                        } else if (espresso.macchiato) {
                            System.out.println("Enjoy your " + espresso.name + ": " + espresso.description + " macchiato style.");
                        } else System.out.println(espresso.name + ": " + espresso.description);
//                        double subEspressoTotal = espresso.calculateProductTotal(espresso.price, espresso.quantity, espresso.extraShot, espresso.macchiato);
//                        espressoTotal += subEspressoTotal;
                        orderList.add(espresso);
                    }
//                    System.out.println("subtotal: " + espressoTotal);
                }
            }

            if (choice == 3) {
                Scanner quantities = new Scanner(System.in);
                System.out.println("\nHow many cappuccino? ");
                byte quantity = quantities.nextByte();
                if (quantity > 0) {

                    for (int i = 0; i < quantity; i++) {
                        Cappuccino cappuccino = new Cappuccino();
                        cappuccino.setPeppermint(cappuccino.addOptions(cappuccino.peppermint, "peppermint"));
                        cappuccino.setWhippedCream(cappuccino.addOptions(cappuccino.whippedCream, "whipped cream"));

                        if ((cappuccino.peppermint) && (cappuccino.whippedCream)) {
                            System.out.println("Enjoy your " + cappuccino.name + ": " + cappuccino.description + " with peppermint & whipped cream.");
                        } else if (cappuccino.peppermint) {
                            System.out.println("Enjoy your " + cappuccino.name + ": " + cappuccino.description + " with peppermint.");
                        } else if (cappuccino.whippedCream) {
                            System.out.println("Enjoy your " + cappuccino.name + ": " + cappuccino.description + " with whipped cream.");
                        } else System.out.println(cappuccino.name + ": " + cappuccino.description);
                        orderList.add(cappuccino);
//                        double subCappuccinoTotal = cappuccino.calculateProductTotal(cappuccino.price, cappuccino.quantity, cappuccino.peppermint, cappuccino.whippedCream);
//                        cappuccinoTotal += subCappuccinoTotal;
                    }
//                    System.out.println("subtotal: " + cappuccinoTotal);
                }
            }

            System.out.println("Please select from the list below:");
            System.out.println("1: Coffee\n2: Cappuccino\n3:Espresso\n4: Check Out");

            choice = select.nextInt();
            while ((choice < 1) || (choice > 4)) {
                System.out.println("\nPlease select from this menu: \n1: Coffee\n2: Cappuccino\n3:Espresso\n4: Check Out");
                choice = select.nextInt();
            }

        }
        System.out.println(orderList);
        total = coffeeTotal + espressoTotal + cappuccinoTotal;
        System.out.println("\nTotal: " + total);

    }
}

