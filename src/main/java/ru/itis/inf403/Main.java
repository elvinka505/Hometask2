package ru.itis.inf403;

import ru.itis.inf403.Lipstick;
import ru.itis.inf403.Foundation;
import ru.itis.inf403.Blush;
import ru.itis.inf403.LiquidFoundation;
import ru.itis.inf403.CreamFoundation;

    public class Main {
        public static void main(String[] args) {
            Lipstick lipstick = new Lipstick("Classic Red", 1200, "Red");
            Foundation foundation = new Foundation("Matte Finish", 3000, "Full Coverage");
            LiquidFoundation liquidFoundation = new LiquidFoundation("Hydrating Liquid", 2650, "Medium Coverage", "High");
            CreamFoundation creamFoundation = new CreamFoundation("Silky Cream", 2500, "Light Coverage", "Low");
            Blush blush = new Blush("Peachy Glo", 800, "Powder");

            lipstick.apply();
            foundation.apply();
            liquidFoundation.apply();
            creamFoundation.apply();
            blush.apply();
        }
    }

