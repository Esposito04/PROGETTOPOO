package org.example;

import java.util.ArrayList;

public class Volo {

    protected int prezzo;
    protected String codice;
    protected String origine;
    protected String destinazione;
    protected String orarioPartenza;
    protected String orarioArrivo;
    protected String dataPartenza;
    protected String dataArrivo;
    protected String durata;
    protected int ritardo;
    protected String compagniaAerea;
    protected StatoVolo stato;
    protected ArrayList<Prenotazione> prenotazioni;

    public Volo(int prezzo, String compagniaAerea, String codice, String orarioPartenza, String orarioArrivo, String dataPartenza, String dataArrivo, String durata, int ritardo, StatoVolo statoDelVolo) {

        this.prezzo = prezzo;
        this.codice = codice;
        this.orarioPartenza = orarioPartenza;
        this.orarioArrivo = orarioArrivo;
        this.dataPartenza = dataPartenza;
        this.dataArrivo = dataArrivo;
        this.durata = durata;
        this.ritardo = ritardo;
        this.compagniaAerea = compagniaAerea;
        this.stato = statoDelVolo;
        this.prenotazioni = new ArrayList<Prenotazione>();
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public String getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(String orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public String getOrarioArrivo() {
        return orarioArrivo;
    }

    public void setOrarioArrivo(String orarioArrivo) {
        this.orarioArrivo = orarioArrivo;
    }

    public String getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(String dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public String getDataArrivo() {
        return dataArrivo;
    }

    public void setDataArrivo(String dataArrivo) {
        this.dataArrivo = dataArrivo;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public int getRitardo() {
        return ritardo;
    }

    public void setRitardo(int ritardo) {
        this.ritardo = ritardo;
    }

    public StatoVolo getStatoDelVolo() {
        return stato;
    }

    public void setStatoDelVolo(StatoVolo statoDelVolo) {
        this.stato = statoDelVolo;
    }

    public String getCompagniaAerea() {
        return compagniaAerea;
    }

    public void setCompagniaAerea(String compagniaAerea) {
        this.compagniaAerea = compagniaAerea;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public StatoVolo getStato() {
        return stato;
    }

    public void setStato(StatoVolo stato) {
        this.stato = stato;
    }
}

