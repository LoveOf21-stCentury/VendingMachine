package com.sylman.vending_machine;

import com.sylman.vending_machine.products.Bottle;
import com.sylman.vending_machine.products.Product;
import com.sylman.vending_machine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        int id = 1;
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product(id++, "Twix", 34.99);
        Product product2 = new Bottle(id++, "Pepsi", 90.99, 0.9);
        Product product3 = new Product(id++, "Lays", 24.10);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        System.out.println(vendingMachine.printProductListInfo());
    }
}