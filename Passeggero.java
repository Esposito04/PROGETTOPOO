package org.example;

import java.util.ArrayList;

public class Passeggero {

    //DATI PERSONALI
    protected String nome;
    protected String cognome;
    protected String numTelefono;
    protected String numDocumento;
    protected char sesso;
    protected String dataNascita;

    //COSTRUTTORE SENZA DATI
    public Passeggero() {}

    //COSTRUTTORE CON DATI
    public Passeggero(String nome, String cognome, String numTelefono, String numDocumento, char sesso, String dataNascita) {

        this.nome = nome;
        this.cognome = cognome;
        this.numTelefono = numTelefono;
        this.numDocumento = numDocumento;
        this.sesso = sesso;
        this.dataNascita = dataNascita;
    }

    //SETTERS E GETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public char getSesso() {
        return sesso;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

}
