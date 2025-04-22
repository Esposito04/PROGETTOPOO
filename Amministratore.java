package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Amministratore extends Utente {

    private String nome;
    private String cognome;
    private ArrayList<Volo> voliGestiti;

    //DATI PERSONALI
    private String codiceFiscale;
    private String dataDiNascita;
    private int stipendio;
    private char sesso;
    private String numTelefono;
    private String dataAssunzione;
    private String indirizzo;

    //COSTRUTTORE SEMPLICE
    public Amministratore(String login, String password, String email, String nome, String cognome){

        super(login, password, email);
        this.nome = nome;
        this.cognome = cognome;
        this.autenticato = false;
        this.voliGestiti = new ArrayList<Volo>();
    }

    //COSTRUTTORE CON DATI PERSONALI
    public Amministratore(String login, String password, String email, String nome, String cognome, int stipendio, char sesso, String codiceFiscale, String dataDiNascita, String numTelefono, String dataAssunzione, String indirizzo){

        super(login, email, password);
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
        this.sesso = sesso;
        this.codiceFiscale = codiceFiscale;
        this.dataDiNascita = dataDiNascita;
        this.numTelefono = numTelefono;
        this.dataAssunzione = dataAssunzione;
        this.indirizzo = indirizzo;
        this.autenticato = false;
    }

    //INSERISCE UN NUOVO VOLO NELLA LISTA DEI VOLI
    public void inserisciVolo(ArrayList<Volo> voli, int prezzo, String compagniaAerea, String codice, String orarioPartenza, String orarioArrivo, String dataPartenza, String dataArrivo, String durata, int ritardo, StatoVolo statoDelVolo){

        if(this.autenticato) {

            Volo v = new Volo(prezzo, compagniaAerea, codice, orarioPartenza, orarioArrivo, dataPartenza, dataArrivo, durata, ritardo, statoDelVolo);

            voli.add(v);

            voliGestiti.add(v);
        }

        else{
            System.out.println("Eseguire log-in");
        }
    }

    //MODIFICA UN VOLO
    public void aggiornaVolo(){

        if(this.autenticato) {

            Volo volo;

            volo = this.ricercaVoloPerCriterio(voliGestiti);

            if (volo != null) {

                System.out.println("Cosa si desidera modificare:");

                System.out.println("1) origine\n" + "2) destinazione\n" + "3) compagnia aerea\n" + "4) codice\n" + "5) orario partenza\n" + "6) orario arrivo\n" + "7) data partenza\n" + "8) data arrivo\n" + "9) durata\n" + "10) ritardo\n" + "11) stato del volo\n" + "12) prezzo\n" + "Inserire modifica: ");

                Scanner scanner = new Scanner(System.in);

                int criterio = scanner.nextInt();

                System.out.println("Inserire modifica: ");

                switch (criterio) {

                    case 1:

                        String o = scanner.next();
                        scanner.nextLine();

                        volo.setOrigine(o);

                        break;

                    case 2:

                        String d = scanner.next();
                        scanner.nextLine();

                        volo.setDestinazione(d);

                        break;

                    case 3:

                        String c = scanner.next();
                        scanner.nextLine();

                        volo.setCompagniaAerea(c);

                        break;

                    case 4:

                        String cod = scanner.next();
                        scanner.nextLine();

                        volo.setCodice(cod);

                        break;

                    case 5:

                        String op = scanner.next();
                        scanner.nextLine();

                        volo.setOrarioPartenza(op);

                        break;

                    case 6:

                        String oa = scanner.next();
                        scanner.nextLine();

                        volo.setOrarioArrivo(oa);

                        break;

                    case 7:

                        String dp = scanner.next();
                        scanner.nextLine();

                        volo.setDataPartenza(dp);

                        break;

                    case 8:

                        String da = scanner.next();
                        scanner.nextLine();

                        volo.setDataArrivo(da);

                        break;

                    case 9:

                        String du = scanner.next();
                        scanner.nextLine();

                        volo.setDurata(du);

                        break;

                    case 10:

                        int r = scanner.nextInt();
                        scanner.nextLine();

                        volo.setRitardo(r);

                        break;

                    case 11:

                        StatoVolo sv = StatoVolo.valueOf(scanner.next());
                        scanner.nextLine();

                        volo.setStatoDelVolo(sv);

                    case 12:

                        int p = scanner.nextInt();
                        scanner.nextLine();

                        volo.setPrezzo(p);

                        break;

                    default:

                        System.out.println("Modifica non valida");
                }
            }
        }

        else{
            System.out.println("Eseguire log-in");
        }
    }

    //ASSEGNA UN GATE AD UN VOLO IN PARTENZA
    public void assegnaGate(int gate, VoloInPartenza v){

        if (this.autenticato) {

            VoloInPartenza volo;

            volo = (VoloInPartenza) this.ricercaVolo(voliGestiti, v);

            if (volo != null) {

                volo.setNumGate(gate);
            }
        }
        else{
            System.out.println("Eseguire log-in");
        }
    }

    //AGGIORNA LO STATO DI UN BAGAGLIO
    public void aggiornaStatoBagaglio(ArrayList<Bagaglio> bagagli, String codice, StatoBagaglio stato){

        if (this.autenticato) {
            for (Bagaglio b : bagagli) {

                if (codice.equals(b.getCodice()))
                    b.setStato(stato);

                else
                    System.out.println("Bagaglio non trovato");
            }
        }
        else{
            System.out.println("Eseguire log-in");
        }
    }

    //VISUALIZZA LA LISTA DEI BAGAGLI SMARRITI
    public void visualizzaSmarrimenti(ArrayList<Bagaglio> bagagli){

        if (this.autenticato) {
            for (Bagaglio b : bagagli) {

                if (b.statoBagaglio == StatoBagaglio.Smarrito) {

                    System.out.println(b.codice + "smarrito");
                }
            }
        }
        else{
            System.out.println("Eseguire log-in");
        }
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public int getStipendio() {
        return stipendio;
    }

    public char getSesso() {
        return sesso;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String getDataAssunzione() {
        return dataAssunzione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setDataAssunzione(String dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
