package ru.itis.inf403;

public class LiquidFoundation extends Foundation {
        private String hydrationLevel;

        public LiquidFoundation(String name, double price, String coverage, String hydrationLevel) {
            super(name, price, coverage);
            this.hydrationLevel = hydrationLevel;
        }

        public void apply() {
            System.out.println("Applying " + getCoverage() + " liquid foundation with " + hydrationLevel + " hydration: " + getName());
        }

        public String getHydrationLevel() {
            return hydrationLevel;
        }
    }

