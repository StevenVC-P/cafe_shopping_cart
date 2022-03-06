package com.perscholas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CafeApp {
    public static void main() {
//        Coffee coffee1 = new Coffee();
//        coffee1.setName("Coffee");
        double total;
        double coffeeTotal = 0;
        double espressoTotal = 0;
        double cappuccinoTotal = 0;

        Coffee coffee = new Coffee("Coffee", 2.00, "Hot mug of java");
        Espresso espresso = new Espresso("Espresso", 3.00, "For a jolt of caffeine");
        Cappuccino cappuccino = new Cappuccino("Cappuccino", 3.50, "A perfect balance of espresso, steamed milk and foam");

        Scanner select = new Scanner(System.in);

        System.out.println("Welcome to Baby Yoda's caffeine addiction!");
        System.out.println("Please select from the list below:");
        System.out.println("1: Coffee\n2: Cappuccino\n3:Espresso\n4: Check Out");

        int choice = select.nextInt();

        while ((choice < 1) || (choice > 4)) {
            System.out.println("Please select from this menu: \n1: Coffee\n2: Cappuccino\n3:Espresso\n4: Check Out");
            choice = select.nextInt();
        }

        while ((choice != 4)) {
            if (choice == 1) {
                Scanner quantities = new Scanner(System.in);

                System.out.println("How many coffees? ");
                coffee.quantity = quantities.nextInt();

                if (coffee.quantity > 0) {
                    for (int i = 0; i < coffee.quantity; i++) {
                        coffee.setMilk(coffee.addOptions(coffee.milk, "milk"));
                        coffee.setSugar(coffee.addOptions(coffee.sugar, "sugar"));

                        if ((coffee.milk) && (coffee.sugar)) {
                            System.out.println("Enjoy your " + coffee.name + ": " + coffee.description + " with milk & sugar.");
                        } else if (coffee.milk) {
                            System.out.println("Enjoy your " + coffee.name + ": " + coffee.description + " with milk.");
                        } else if (coffee.sugar) {
                            System.out.println("Enjoy your " + coffee.name + ": " + coffee.description + " with sugar.");
                        } else System.out.println(coffee.name + ": " + coffee.description);

                        double subCoffeeTotal = coffee.calculateProductTotal(coffee.price);
                        coffeeTotal += subCoffeeTotal;
                    }
                    System.out.println("subtotal: " + coffeeTotal);
                }
            }

            if (choice == 2) {
                Scanner quantities = new Scanner(System.in);
                System.out.println("\nHow many espresso? ");

                espresso.quantity = quantities.nextInt();
                if (espresso.quantity > 0) {

                    for (int i = 0; i < espresso.quantity; i++) {
                        espresso.setExtraShot(espresso.addOptions(espresso.extraShot, "extra shot"));
                        espresso.setMacchiato(espresso.addOptions(espresso.macchiato, "macchiato"));

                        if ((espresso.extraShot) && (espresso.macchiato)) {
                            System.out.println("Enjoy your " + espresso.name + ": " + espresso.description + " macchiato style with an extra shot.");
                        } else if (espresso.extraShot) {
                            System.out.println("Enjoy your " + espresso.name + ": " + espresso.description + " with an extra shot.");
                        } else if (espresso.macchiato) {
                            System.out.println("Enjoy your " + espresso.name + ": " + espresso.description + " macchiato style.");
                        } else System.out.println(espresso.name + ": " + espresso.description);
                        double subEspressoTotal = espresso.calculateProductTotal(espresso.price, espresso.quantity, espresso.extraShot, espresso.macchiato);
                        espressoTotal += subEspressoTotal;
                    }
                    System.out.println("subtotal: " + espressoTotal);
                }
            }

            if (choice == 3) {
                Scanner quantities = new Scanner(System.in);
                System.out.println("\nHow many cappuccino? ");
                cappuccino.quantity = quantities.nextInt();
                if (cappuccino.quantity > 0) {

                    for (int i = 0; i < cappuccino.quantity; i++) {
                        cappuccino.setPeppermint(cappuccino.addOptions(cappuccino.peppermint, "peppermint"));
                        cappuccino.setWhippedCream(cappuccino.addOptions(cappuccino.whippedCream, "whipped cream"));

                        if ((cappuccino.peppermint) && (cappuccino.whippedCream)) {
                            System.out.println("Enjoy your " + cappuccino.name + ": " + cappuccino.description + " with peppermint & whipped cream.");
                        } else if (cappuccino.peppermint) {
                            System.out.println("Enjoy your " + cappuccino.name + ": " + cappuccino.description + " with peppermint.");
                        } else if (cappuccino.whippedCream) {
                            System.out.println("Enjoy your " + cappuccino.name + ": " + cappuccino.description + " with whipped cream.");
                        } else System.out.println(cappuccino.name + ": " + cappuccino.description);
                        double subCappuccinoTotal = cappuccino.calculateProductTotal(espresso.price, cappuccino.quantity, cappuccino.peppermint, cappuccino.whippedCream);
                        cappuccinoTotal += subCappuccinoTotal;
                    }
                    System.out.println("subtotal: " + cappuccinoTotal);
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

        total = coffeeTotal + espressoTotal + cappuccinoTotal;
        System.out.println("\nTotal: " + total);

    }

}
