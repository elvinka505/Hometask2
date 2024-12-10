package ru.itis.inf403;

public class Lipstick extends CosmeticProducts {
        private String shade;

        public Lipstick(String name, double price, String shade) {
            super(name, price);
            this.shade = shade;
        }

        public void apply() {
            System.out.println("Applying " + getShade() + " lipstick: " + getName());
        }

        public String getShade() {
            return shade;
        }
    }

