package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UtenteGenerico extends Utente {

    public ArrayList<Prenotazione> prenotazioniEffetuate;

    public UtenteGenerico(String login, String password, String email) {

        super(login, password, email);
        this.prenotazioniEffetuate = new ArrayList<Prenotazione>();
    }

    //PRENOTA UN VOLO
    public Prenotazione prenotaVolo(Volo v, String posto, ClasseVolo classe){

        if(this.autenticato) {

            if (v.stato.equals(StatoVolo.Programmato)) {

                Prenotazione p = new Prenotazione(posto, classe);

                Passeggero passeggero = new Passeggero();

                p.passeggero=passeggero;

                System.out.println("Inserire nome: ");

                Scanner sc = new Scanner(System.in);

                p.passeggero.nome = sc.nextLine();
                sc.nextLine();

                System.out.println("Inserire cognome: ");

                p.passeggero.cognome = sc.nextLine();
                sc.nextLine();

                System.out.println("Inserire sesso: ");

                p.passeggero.sesso = sc.next().charAt(0);
                sc.nextLine();

                System.out.println("Inserire nuumero documento: ");

                p.passeggero.numDocumento = sc.nextLine();
                sc.nextLine();

                System.out.println("Inserire data di nascita: ");

                p.passeggero.dataNascita = sc.nextLine();
                sc.nextLine();

                System.out.println("Inserire numero di telefonoo: ");

                p.passeggero.numTelefono = sc.nextLine();
                sc.nextLine();


                p.volo = v;

                prenotazioniEffetuate.add(p);

                v.prenotazioni.add(p);

                return p;

            } else
                System.out.println("Volo non disponibile");
        }

        else{
            System.out.println("Eseguire log-in");
        }

        return null;
    }

    //CERCA UNA PRENOTAZIONE GIA' EFFETTUATA
    public Prenotazione cercaPrenotazione(Prenotazione prenotazione){

        boolean trovato = false;

        if (this.autenticato) {

            for(Prenotazione p : prenotazioniEffetuate) {


                if(p.equals(prenotazione)) {

                    System.out.println("Prenotazione a nome di" + p.passeggero.nome + p.passeggero.cognome + "del volo " + p.volo.codice + " in data " + p.volo.dataPartenza + " alle " + p.volo.orarioPartenza + " da " + p.volo.origine + " a " + p.volo.destinazione);
                    trovato = true;
                    return p;
                }

            }

            if(!trovato){

                System.out.println("Prenotazione non trovata");
            }

        }

        else {
            System.out.println("Eseguire log-in");
        }

        return null;

    }

    //CERCA UNA PRENOTAZIONE GIA' EFFETTUATA CON IL NOME E IL COGNOME DEL PASSEGGERO
    public Prenotazione cercaPrenotazionePerNomePasseggero(String nome, String cognome){

        boolean trovato = false;

        if (this.autenticato) {

            for(Prenotazione p : prenotazioniEffetuate) {


                if(p.passeggero.nome.equals(nome) && p.passeggero.cognome.equals(cognome)) {

                    System.out.println("Prenotazione a nome di" + p.passeggero.nome + p.passeggero.cognome + "del volo " + p.volo.codice + " in data " + p.volo.dataPartenza + " alle " + p.volo.orarioPartenza + " da " + p.volo.origine + " a " + p.volo.destinazione);
                    trovato = true;
                    return p;
                }

            }

            if(!trovato){

                System.out.println("Prenotazione non trovata");
            }

        }

        else {
            System.out.println("Eseguire log-in");
        }

        return null;

    }

    //CERCA UNA PRENOTAZIONE GIA' EFFETTUATA CON IL CODICE DEL VOLO
    public Prenotazione cercaPrenotazionePerCodiceVolo(String codiceVolo){

        boolean trovato = false;

        if (this.autenticato) {

            for(Prenotazione p : prenotazioniEffetuate) {


                if(p.volo.codice.equals(codiceVolo)) {

                    System.out.println("Prenotazione a nome di" + p.passeggero.nome + p.passeggero.cognome + "del volo " + p.volo.codice + " in data " + p.volo.dataPartenza + " alle " + p.volo.orarioPartenza + " da " + p.volo.origine + " a " + p.volo.destinazione);
                    trovato = true;
                    return p;
                }

            }

            if(!trovato){

                System.out.println("Prenotazione non trovata");
            }

        }

        else {
            System.out.println("Eseguire log-in");
        }

        return null;

    }

    //MODIFICA UNA PRENOTAZIONE GIA' EFFETTUATA
    public void modificaPrenotazione(Prenotazione prenotazione) {

        if (this.autenticato) {

            Prenotazione p = this.cercaPrenotazione(prenotazione);

            if (p != null) {

                System.out.println("Cosa si desidera modificare?\n" + "1) Posto\n" + "2) Classe del volo\n" + "3) dati passeggero\n" + "4) Cancella Prenotazione\n" + "Inserire scelta: ");

                Scanner scanner = new Scanner(System.in);

                int scelta = scanner.nextInt();

                switch (scelta) {

                    case 1:
                        System.out.println("Inserire nuovo posto: ");

                        p.posto = scanner.nextLine();

                    case 2:
                        System.out.println("Inserire nuovo classe: ");

                        p.classeVolo = ClasseVolo.valueOf(scanner.nextLine());

                    case 3:
                        System.out.println("Inserire nome: ");

                        Scanner sc = new Scanner(System.in);

                        p.passeggero.nome = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Inserire cognome: ");

                        p.passeggero.cognome = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Inserire sesso: ");

                        p.passeggero.sesso = sc.next().charAt(0);
                        sc.nextLine();

                        System.out.println("Inserire nuumero documento: ");

                        p.passeggero.numDocumento = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Inserire data di nascita: ");

                        p.passeggero.dataNascita = sc.nextLine();
                        sc.nextLine();

                        System.out.println("Inserire numero di telefonoo: ");

                        p.passeggero.numTelefono = sc.nextLine();
                        sc.nextLine();

                    break;

                    case 4:

                        p.stato = StatoPrenotazione.Cancellata;

                    default:

                        System.out.println("ERRORE");
                    break;
                }

            } else {
                System.out.println("Eseguire log-in");
            }
        }
    }

    //SEGNALA LO SMARRIMENTO DI UN BAGAGLIO
    public void segnalaSmarrimento(Bagaglio b){

        if (this.autenticato) {

            b.statoBagaglio = StatoBagaglio.Smarrito;
            System.out.println("Smarrimento segnalato");
        }
        else {
            System.out.println("Eseguire log-in");
        }

    }

    //EFFETTUAT L'OPERAZIONE DI CHECK-IN
    public void chekIn(Prenotazione prenotazione){

        if (this.autenticato) {

            Prenotazione p = this.cercaPrenotazione(prenotazione);

            if(p!=null) {

                    p.stato = StatoPrenotazione.Confermata;

                    p.bagaglio = new Bagaglio();

                    System.out.println("Prenotazione confermata. Numero biglietto: " + p.numBiglietto);
                }
        }

        else {
            System.out.println("Eseguire log-in");
        }

    }
}
