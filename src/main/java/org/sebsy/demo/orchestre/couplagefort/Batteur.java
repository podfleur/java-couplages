package org.sebsy.demo.orchestre.couplagefort;

public class Batteur {
    private Violon batterie;
    private String morceau;

    public Batteur(String morceau) {
        super();
        this.batterie = new Violon();
        this.morceau = morceau;
    }

    public void jouerMorceau() {
        batterie.afficher();
        System.out.println("et je joue le morceau " + morceau);
        batterie.jouer();
    }
}
