package ru.itis.inf403;

public class CosmeticProducts {
    private String name;
    private double price;

    public CosmeticProducts(String name, double price) {
        this.name = name;
        this.price = price;

        }

        public void apply() {
            System.out.println("Applying " + name);
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
