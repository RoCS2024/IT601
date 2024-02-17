package com.tshirt.inventory.application;

import java.util.ArrayList;


class Inventory {
    private ArrayList<TShirt> tshirts;
    private int countOnHand;

    public Inventory() {
        tshirts = new ArrayList<>();
        countOnHand = 100;
    }

    public void addTShirt(TShirt tshirt) {
        tshirts.add(tshirt);
        System.out.println("Added Successfully");
    }

    public void sellTShirt() {
        if (countOnHand > 0) {
            tshirts.remove(0);
            countOnHand--;
            System.out.println("T-shirt sold!");
        } else {
            System.out.println("No more T-shirts in stock.");
        }
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (TShirt tshirt : tshirts) {
            tshirt.display();
        }
        System.out.println("Remaining items: " + countOnHand);
    }
}
