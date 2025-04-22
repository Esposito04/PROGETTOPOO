package org.example;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        UtenteGenerico u = new UtenteGenerico("ciro20", "ciro4657", "ciro@gmail.com");

        ArrayList<Volo> voli = new ArrayList<Volo>();

        VoloInPartenza volo = new VoloInPartenza(300, "Rayan Air", "RA4758", "Francoforte", "20:89", "56:89", "45/6/5678", "56//8/67", "2 ore e 34 minuti", 89, StatoVolo.Programmato, 23);

        voli.add(volo);

        u.login();

        u.prenotaVolo(volo, "A4", ClasseVolo.Business);

    }
}