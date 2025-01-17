package org.example;

public class Riviste extends Catalogo{
 private Periodicita periodicita;

 public Riviste(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita){
     super(isbn, titolo, annoPubblicazione, numeroPagine);
     this.periodicita=periodicita;
 }
 public Periodicita getPeriodicita() {
     return periodicita;
 }
 public void setPeriodicita(Periodicita periodicita) {
     this.periodicita = periodicita;
 }

    @Override
    public void dettagli() {
     super.dettagli();
     System.out.println("Uscita: "+periodicita.toString());
    }
}
