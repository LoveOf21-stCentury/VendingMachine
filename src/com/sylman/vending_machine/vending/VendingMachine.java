package com.sylman.vending_machine.vending;

import com.sylman.vending_machine.products.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String printProductListInfo() {
        StringBuilder sb = new StringBuilder();

        for (Product product : products) {
            sb.append(product);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return printProductListInfo();
    }

}
