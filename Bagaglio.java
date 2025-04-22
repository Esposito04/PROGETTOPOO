package org.example;

import java.util.Random;

public class Bagaglio {

    protected int codice;
    protected StatoBagaglio statoBagaglio;

    public Bagaglio(int codice, StatoBagaglio statoBagaglio) {

        this.codice = codice;
        this.statoBagaglio = statoBagaglio;
    }

    public Bagaglio(){

        Random r = new Random();

        this.codice = r.nextInt(100)+1;

        this.statoBagaglio = StatoBagaglio.Caricato;

    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setStato(StatoBagaglio stato) {
        this.statoBagaglio = stato;
    }

    public int getCodice() {
        return codice;
    }

    public StatoBagaglio getStato() {
        return statoBagaglio;
    }

    public StatoBagaglio getStatoBagaglio() {
        return statoBagaglio;
    }

    public void setStatoBagaglio(StatoBagaglio statoBagaglio) {
        this.statoBagaglio = statoBagaglio;
    }
}
