package org.sebsy.demo.orchestre.couplagefaible;

public class Batterie implements Instrument {
    public void afficher() {
        System.out.println("Je suis une batterie...");
    }

    public void jouer() {
        System.out.println("BADUM TSSSSSSSS");
    }
}