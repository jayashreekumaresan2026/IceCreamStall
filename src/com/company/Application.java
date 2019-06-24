package com.company;

import java.util.List;

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
    }
}
