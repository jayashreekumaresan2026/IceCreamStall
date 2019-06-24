package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IceCreamStall {
    List<String> iceCreamTypeList;
    List<String> flavorList;
    List<Integer> iceCreamTypeCost;
    List<Integer> flavorCost;

    IceCreamStall() {
        this.iceCreamTypeList = Arrays.asList("Stick", "Cone", "Cup");
        this.flavorList = Arrays.asList("Chocolate", "Strawberry", "Vanilla");
        this.iceCreamTypeCost = Arrays.asList(25, 35, 40);
        this.flavorCost = Arrays.asList(5, 15, 8);
    }
    List<IceCream> createIceCream() {
        List<IceCream> iceCreamList = new ArrayList<>();
        for (int i = 0; i < iceCreamTypeList.size(); i++) {
            for (int j = 0; j < flavorList.size(); j++) {
                IceCream iceCream = new IceCream(iceCreamTypeList.get(i), flavorList.get(j), (iceCreamTypeCost.get(i) + flavorCost.get(j)));
                iceCreamList.add(iceCream);
            }
        }
        return iceCreamList;
    }
}