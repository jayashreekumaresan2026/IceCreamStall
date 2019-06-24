package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IceCreamStall {
    List<String> iceCreamTypeList;
    List<String> flavorList;
    List<Integer> iceCreamTypeCost;
    List<Integer> flavorCost;
    List<String> toppingsList;
    List<Integer> toppingsCost;


    IceCreamStall() {
        this.iceCreamTypeList = Arrays.asList("Stick", "Cone", "Cup");
        this.flavorList = Arrays.asList("Chocolate", "Strawberry", "Vanilla");
        this.iceCreamTypeCost = Arrays.asList(25, 35, 40);
        this.flavorCost = Arrays.asList(5, 15, 8);
        this.toppingsList = Arrays.asList("Sprinkles", "Penut", "GummyBear", "Fudge");
        this.toppingsCost = Arrays.asList(10, 20, 30,5);
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
        int calculateIceCreamCost(String userInput, String flavor, int quantity,List<IceCream> iceCreamList) {
            int Cost = 0;
            for (int i = 0; i < iceCreamList.size(); i++) {
                if (userInput.equalsIgnoreCase(iceCreamList.get(i).iceCreamType) && flavor.equalsIgnoreCase(iceCreamList.get(i).iceCreamFlavor)) {
                    Cost = (iceCreamList.get(i).iceCreamCost) * quantity;
                }
            }
            return Cost;
        }

       String iSChocolate(String userInput, String flavor,List<IceCream> iceCreamList) {
        String toppings = " ";
        for (int i = 0; i < iceCreamList.size(); i++) {
            if (userInput.equalsIgnoreCase(iceCreamList.get(i).iceCreamType) && flavor.equalsIgnoreCase("chocolate")) {
                for (int j = 0;  j< toppingsList.size()-3; j++) {
                    toppings += toppingsList.get(j) + "\t\t\t" + toppingsCost.get(j)+"\n";
                }
            }
        }
        return toppings;
    }
    int  calculateTotalCostWithToppings(String toppings){
        int Cost = 0;
        for (int i = 0; i < toppingsList.size(); i++) {
            if (toppings.equalsIgnoreCase(toppingsList.get(i)) ){
                Cost = toppingsCost.get(i);
            }
        }
        return Cost;
    }
    }
