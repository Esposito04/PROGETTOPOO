package org.example;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Utente {

        protected String login;
        protected String password;
        protected String email;
        protected boolean autenticato;

        //COSTRUTTORE
        public Utente(String login, String password, String email){

                this.login = login;
                this.password = password;
                this.email = email;
                this.autenticato = false;
        }

        //COSTRUTTORE DA INPUT
        public Utente(){

                Scanner scanner = new Scanner(System.in);

                System.out.println("Inserire nome utente: ");

                this.login = scanner.nextLine();

                System.out.println("Inserire email: ");

                this.email = scanner.nextLine();

                System.out.println("Inserire password: ");

                this.password = scanner.nextLine();

                this.autenticato = false;
        }

        //LOG-IN
        public boolean login() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Inserire email o nome utente: ");

                String login = scanner.nextLine();

                if ((login.equals(this.login)) || (this.email.equals(this.login))) {

                        System.out.println("Inserire password: ");

                        String password = scanner.nextLine();

                        if (password.equals(this.password)) {

                                this.autenticato = true;

                                System.out.println("Log-in effettuato");
                        } else
                                System.out.println("Password errata");

                } else {

                        System.out.println("Nome utente o email errati");
                }

                return this.autenticato;
        }

        //VISUALIZZA TUTTI I VOLI
        public void visualizzaVolo(ArrayList<Volo> voli){

                for (Volo v : voli) {

                        System.out.print("Volo " + v.codice + " da " + v.origine + " a " + v.destinazione + " del " + v.dataPartenza);

                        switch (v.stato) {

                                case Decollato:

                                        System.out.println(" è decollato alle " + v.orarioPartenza);

                                        break;

                                case InRitardo:

                                        System.out.println(" è in ritardo di: " + v.ritardo + " minuti");

                                        break;

                                case Atterrato:

                                        System.out.println(" è atterrato alle " + v.orarioArrivo);

                                        break;

                                case Cancellato:

                                        System.out.println(" è stato cancellato");

                                        break;

                                default:

                                        System.out.println(" è in orario");

                                        break;
                        }
                }
        }

        //RICERCA DELL'OGGETTO VOLO
        public Volo ricercaVolo(ArrayList<Volo> voli, Volo v){

                for (Volo volo : voli) {

                        if (volo.equals(v))
                                return volo;

                        else
                                System.out.println("Volo non trovato");
                }

                return null;
        }

        //RICERCA VOLO PER UN CRITERIO (ATTRIBUTO DI VOLO)
        public Volo ricercaVoloPerCriterio(ArrayList<Volo> voli){

                boolean trovato = false;

                System.out.println("Ricerca volo per:");

                System.out.println("1) Codice\n" + "2) Compagnia aerea\n" + "3) Data\n" + "4) Destinazione\n" + "5) Origine\n" + "6) Prezzo\n" + "Inserire criterio: ");

                Scanner scanner = new Scanner(System.in);

                int criterio = scanner.nextInt();

                scanner.nextLine();

                switch (criterio) {

                        case 1:
                                System.out.println("Inserire codice: ");

                                String codice = scanner.nextLine();
                                scanner.nextLine();

                                for(Volo volo : voli) {

                                        if (volo.codice.equals(codice)) {

                                                trovato = true;
                                                return volo;
                                        }
                                }

                                        if(!trovato)
                                                System.out.println("Volo non trovato");
                        break;

                        case 2:

                                System.out.println("Inserire copmagnia aerea: ");

                                String compagniaAerea = scanner.nextLine();
                                scanner.nextLine();

                                for(Volo volo : voli){

                                        if(compagniaAerea == volo.compagniaAerea){

                                                trovato = true;
                                                return volo;
                                        }
                                }

                                if(!trovato)
                                        System.out.println("Volo non trovato");
                        break;

                        case 3:

                                System.out.println("Inserire data: ");

                                String data = scanner.nextLine();
                                scanner.nextLine();

                                for(Volo volo : voli){

                                        if(data == volo.dataPartenza){

                                                trovato = true;
                                                return volo;
                                        }
                                }

                                if(!trovato)
                                        System.out.println("Volo non trovato");
                        break;

                        case 4:

                                System.out.println("Inserire destinazione: ");

                                String destinazione = scanner.nextLine();
                                scanner.nextLine();

                                for(Volo volo : voli){

                                        if(destinazione == volo.destinazione){

                                                trovato = true;
                                                return volo;
                                        }
                                }

                                if(!trovato)
                                        System.out.println("Volo non trovato");

                        break;

                        case 5:

                                System.out.println("Inserire origine: ");

                                String origine = scanner.nextLine();
                                scanner.nextLine();

                                for(Volo volo : voli){

                                        if(origine == volo.origine){

                                                trovato = true;
                                                return volo;
                                        }
                                }

                                if(!trovato)
                                        System.out.println("Volo non trovato");

                        break;

                        case 6:

                                System.out.println("Inserire prezzo: ");

                                int prezzo = scanner.nextInt();
                                scanner.nextLine();

                                for(Volo volo : voli){

                                        if(prezzo == volo.prezzo){

                                                trovato = true;
                                                return volo;
                                        }

                                }

                                if(!trovato)
                                        System.out.println("Volo non trovato");
                        break;

                        default:

                                System.out.println("Criterio non valido");
                }
                return null;
        }

        //MONITORA LO STATO DEL BAGAGLIO
        public Bagaglio monitoraBagaglio(ArrayList<Bagaglio> bagagli, int codice){

                for(Bagaglio b : bagagli){

                        if(b.codice == codice){

                                System.out.println("Stato bagaglio: " + b.statoBagaglio);
                                return b;
                        }

                        else{
                                System.out.println("Bagaglio non trovato");
                        }
                }

                return null;
        }

        //CERCA PASSEGGERO PER NOME
        public Passeggero cercaPasseggeroPerNomeECognome(ArrayList<Volo> voli, String nome, String cognome){

                boolean trovato = false;

                for(Volo volo : voli){

                        for(Prenotazione p : volo.prenotazioni){

                                if(p.passeggero.nome.equals(nome) && p.passeggero.cognome.equals(cognome)){

                                        System.out.println("Passeggero trovato: " + p.passeggero);

                                        trovato = true;

                                        return p.passeggero;
                                }
                        }
                }

                if(!trovato){

                        System.out.println("Passeggero non trovato");
                }

                return null;
        }

        //CERCA PASSEGGERO PER NUMERO DI TELEFONO
        public Passeggero cercaPasseggeroPerNumTel(ArrayList<Volo> voli, String numTel){

                boolean trovato = false;

                for(Volo volo : voli){

                        for(Prenotazione p : volo.prenotazioni){

                                if(p.passeggero.numTelefono.equals(numTel)){

                                        System.out.println("Passeggero trovato: " + p.passeggero);

                                        trovato = true;

                                        return p.passeggero;
                                }
                        }
                }

                if(!trovato){

                        System.out.println("Passeggero non trovato");
                }

                return null;
        }

        //CERCA PASSEGERO PER NUMERO DOCUMENTO
        public Passeggero cercaPasseggeroPerNumDocumento(ArrayList<Volo> voli, String numDocumento){

                boolean trovato = false;

                for(Volo volo : voli){

                        for(Prenotazione p : volo.prenotazioni){

                                if(p.passeggero.numDocumento.equals(numDocumento)){

                                        System.out.println("Passeggero trovato: " + p.passeggero);

                                        trovato = true;

                                        return p.passeggero;
                                }
                        }
                }

                if(!trovato){

                        System.out.println("Passeggero non trovato");
                }

                return null;
        }

        //SETTERS E GETTERS
        public void setEmail(String email) {
                this.email = email;
        }

        public void setLogin(String login) {
                this.login = login;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getEmail() {
                return email;
        }

        public String getPassword() {
                return password;
        }

        public String getLogin() {
                return login;
        }

        public boolean isAutenticato() {
                return autenticato;
        }

        public void setAutenticato(boolean autenticato) {
                this.autenticato = autenticato;
        }
}

