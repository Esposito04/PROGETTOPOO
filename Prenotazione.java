package org.example;

import java.util.Random;

public class Prenotazione {

    protected int numBiglietto;
    protected String posto;
    protected StatoPrenotazione stato;
    protected ClasseVolo classeVolo;
    protected Passeggero passeggero;
    protected Volo volo;
    protected Bagaglio bagaglio;

    //COSTRUTTORE MANUALE
    public Prenotazione(int numBiglietto, String posto, StatoPrenotazione stato, ClasseVolo classeVolo) {

        this.numBiglietto = numBiglietto;
        this.posto = posto;
        this.stato = stato;
        this.classeVolo = classeVolo;
    }

    //COSTRUTTORE AUTOMATICO
    public Prenotazione(String posto, ClasseVolo classe){

        Random r = new Random();

        this.numBiglietto = r.nextInt(100)+1;

        this.stato = StatoPrenotazione.InAttesa;

        this.posto = posto;

        this.classeVolo = classe;
    }

    //GETTERS E SETTERS
    public int getNumBiglietto() {
        return numBiglietto;
    }

    public void setNumBiglietto(int numBiglietto) {
        this.numBiglietto = numBiglietto;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public StatoPrenotazione getStatoPrenotazione() {
        return stato;
    }

    public void setStatoVolo(StatoPrenotazione stato) {
        this.stato = stato;
    }

    public ClasseVolo getClasseVolo() {
        return classeVolo;
    }

    public void setClasseVolo(ClasseVolo classeVolo) {
        this.classeVolo = classeVolo;
    }
}
