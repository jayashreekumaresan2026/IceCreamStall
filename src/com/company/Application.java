package com.company;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        IceCreamStall iceCreamStall = new IceCreamStall();
        List<IceCream> iceCreamList = iceCreamStall.createIceCream();
        System.out.printf("%10s", "\tICE CREAM MENU LIST \n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Type" + "\t" + "   Flavor\n");
        System.out.println();
        for (int i = 0; i < iceCreamList.size(); i++) {
            iceCreamList.get(i).iceCreamAndFlavor();
        }
        System.out.printf("%10s", "\t MenuList With Cost\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Type" + "\t" + "         Flavor" + "    \t" + "TotalCost\n");
        System.out.println();
        for (int i = 0; i < iceCreamList.size(); i++) {
            iceCreamList.get(i).iceCreamWithCost();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your IceIcream....");
        System.out.print("Choose your IceCream Type :");
        String userType = scanner.nextLine();
        System.out.print("Choose your flavor :");
        String userFlavor = scanner.nextLine();
        System.out.print("Quantity :");
        int quantity = Integer.parseInt(scanner.nextLine());
        int iceCreamCost=0;
        for (int i = 0; i < iceCreamList.size(); i++) {
            iceCreamCost=iceCreamStall.calculateIceCreamCost(userType, userFlavor,quantity,iceCreamList);
        }
        System.out.println("Cost of your selected IceCream :" + (iceCreamCost*quantity));
        String toppings=" ";
        for (int i = 0; i < iceCreamList.size(); i++) {
            toppings = iceCreamStall.iSChocolate(userType, userFlavor, iceCreamList);
        }
        if (!toppings.equals(" ")) {
            System.out.printf("%10s", "\tTopping \n");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Toppings" + "      \t" + "   Cost\n");
            System.out.println();
            System.out.println(toppings);
            System.out.println("Select the toppings");
            String userInputToppings = scanner.nextLine();
            int finalCost = iceCreamStall.calculateTotalCostWithToppings(userInputToppings);
            System.out.println("TotalCost for Icream :" + (finalCost + iceCreamCost));
        } else {
            System.out.println("!Toppings Not available for your flavor..... ");
        }
    }
}

