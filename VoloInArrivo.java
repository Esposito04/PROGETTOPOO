package org.example;

public class VoloInArrivo extends Volo {

    public VoloInArrivo(int prezzo, String compagniaAerea, String codice, String origine, String orarioPartenza, String orarioArrivo, String dataPartenza, String dataArrivo, String durata, int ritardo, StatoVolo statoDelVolo) {

        super(prezzo, compagniaAerea, codice, orarioPartenza, orarioArrivo, dataPartenza, dataArrivo, durata, ritardo, statoDelVolo);

        this.destinazione = "Napoli";
        this.origine = origine;
    }
}
