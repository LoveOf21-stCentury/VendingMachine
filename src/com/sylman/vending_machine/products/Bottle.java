package com.sylman.vending_machine.products;

public class Bottle extends Product {
    private double volume;

    public Bottle(int id, String name, double price, double volume) {
        super(id, name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume;
    }
}
