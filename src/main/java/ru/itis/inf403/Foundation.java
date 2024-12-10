package ru.itis.inf403;

public class Foundation extends CosmeticProducts {
        private String coverage;

        public Foundation(String name, double price, String coverage) {
            super(name, price);
            this.coverage = coverage;
        }

        public void apply() {
            System.out.println("Applying " + coverage + " foundation: " + getName());
        }

        public String getCoverage() {
            return coverage;
        }
    }

