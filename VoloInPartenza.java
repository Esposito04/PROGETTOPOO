package org.example;

public class VoloInPartenza extends Volo {

    private int numGate;

    public VoloInPartenza(int prezzo, String compagniaAerea, String codice, String destinazione, String orarioPartenza, String orarioArrivo, String dataPartenza, String dataArrivo, String durata, int ritardo, StatoVolo statoDelVolo, int numGate) {

        super(prezzo, compagniaAerea, codice, orarioPartenza, orarioArrivo, dataPartenza, dataArrivo, durata, ritardo, statoDelVolo);

        this.origine = "Napoli";
        this.numGate = numGate;
        this.destinazione = destinazione;
    }

    public int getNumGate() {
        return numGate;
    }

    public void setNumGate(int numGate) {
        this.numGate = numGate;
    }
}
