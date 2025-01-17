package org.example;
//origino prima una classe con attributi e metodi comuni per le classi figlie
public  class Catalogo {
    //assegno attributi comuni e creo il costruttore
   private String isbn;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;

    public Catalogo(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = annoPubblicazione;
    }
    //creo i metodi SET e GET che verranno utilizzati nelle classi figlie
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }
    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }
    public int getNumeroPagine() {
        return numeroPagine;
    }
    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
    //metodo astratto da implementare
    public  void dettagli(){
        System.out.println("Isbn:"+isbn + " titolo:"+titolo + " annoPubblicazione:"+annoPubblicazione + " numeroPagine:"+numeroPagine);
    };

}


