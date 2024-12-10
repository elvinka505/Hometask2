package ru.itis.inf403;

public class Blush extends CosmeticProducts {
        private String type;

        public Blush(String name, double price, String type) {
            super(name, price);
            this.type = type;
        }

        public void apply() {
            System.out.println("Applying " + type + " blush: " + getName());
        }

        public String getType() {
            return type;
        }
    }

