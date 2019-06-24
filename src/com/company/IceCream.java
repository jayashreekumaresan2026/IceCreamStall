package com.company;

public class IceCream {
    String iceCreamType;
    String iceCreamFlavor;
    int iceCreamCost;

    public IceCream(String iceCreamType, String iceCreamFlavor, int iceCreamCost) {
        this.iceCreamType = iceCreamType;
        this.iceCreamFlavor = iceCreamFlavor;
        this.iceCreamCost = iceCreamCost;
    }

    void iceCreamAndFlavor() {

        System.out.println(iceCreamType + "  \t" + iceCreamFlavor + "\t");
    }

    void iceCreamWithCost() {
        System.out.println(iceCreamType + "  \t" + "    \t" + iceCreamFlavor + "     \t" + iceCreamCost);
    }
}


