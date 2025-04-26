package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
public class StoreApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("%d | %s | $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(1, "Laptop", 999.99f));
        inventory.add(new Product(2, "Macbook", 540.99f));
        inventory.add(new Product(3, "Airpods", 600.99f));
        inventory.add(new Product(4, "Notebook", 720.99f));
        inventory.add(new Product(5, "Car note", 820.99f));

        return inventory;
    }
}