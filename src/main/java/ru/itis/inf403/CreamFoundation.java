package ru.itis.inf403;

public class CreamFoundation extends Foundation {
        private String oilLevel;

        public CreamFoundation(String name, double price, String coverage, String oilLevel) {
            super(name, price, coverage);
            this.oilLevel = oilLevel;
        }

        public void apply() {
            System.out.println("Applying " + getCoverage() + " cream foundation with " + oilLevel + " oil level: " + getName());
        }

        public String getOilLevel() {
            return oilLevel;
        }
    }


