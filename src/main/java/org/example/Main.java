package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Archivio archivio = new Archivio();
        Scanner scanner = new Scanner(System.in);
        int scelta = scanner.nextInt();
        scanner.nextLine();
//libri
        Catalogo libro1 = new Libri("00001", "Il vecchio e il mare", 1952, 127, "Ernest Hemingway", "Romanzo");
        Catalogo libro2 = new Libri("00002", "La divina commedia", 1320, 798, "Dante Alighieri", "Poema epico");
        Catalogo libro3 = new Libri("00003", "Harry Potter e la pietra filosofale", 1997, 223, "J.K. Rowling", "Fantasy");
        Catalogo libro4 = new Libri("00004", "Orgoglio e pregiudizio", 1813, 279, "Jane Austen", "Romanzo");
        Catalogo libro5 = new Libri("00005", "Il codice Da Vinci", 2003, 689, "Dan Brown", "Thriller");
//riviste
        Catalogo rivista1 = new Riviste("10001", "Nature", 2023, 120, Periodicita.MENSILE);
        Catalogo rivista2 = new Riviste("10002", "Scientific American", 2023, 95, Periodicita.SEMESTRALE);
        Catalogo rivista3 = new Riviste("10003", "National Geographic", 2023, 145, Periodicita.SETTIMANALE);
        Catalogo rivista4 = new Riviste("10004", "Forbes", 2023, 80, Periodicita.SEMESTRALE);
        Catalogo rivista5 = new Riviste("10005", "Vogue", 2023, 200, Periodicita.MENSILE);

        archivio.aggiuntaElemento(libro1);
        archivio.aggiuntaElemento(libro2);
        archivio.aggiuntaElemento(libro3);
        archivio.aggiuntaElemento(libro4);
        archivio.aggiuntaElemento(libro5);

        archivio.aggiuntaElemento(rivista1);
        archivio.aggiuntaElemento(rivista2);
        archivio.aggiuntaElemento(rivista3);
        archivio.aggiuntaElemento(rivista4);
        archivio.aggiuntaElemento(rivista5);

        switch (scelta) {
            case 1:
                System.out.println("Scegli il tipo di elemento: 1. Libro, 2. Rivista");
                int tipo = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Inserisci ISBN: ");
                String isbn = scanner.nextLine();

                System.out.print("Inserisci titolo: ");
                String titolo = scanner.nextLine();

                System.out.print("Inserisci anno di pubblicazione: ");
                int anno = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Inserisci numero di pagine: ");
                int pagine = scanner.nextInt();
                scanner.nextLine();

                if (tipo == 1) {
                    System.out.print("Inserisci autore: ");
                    String autore = scanner.nextLine();

                    System.out.print("Inserisci genere: ");
                    String genere = scanner.nextLine();

                    Catalogo libro = new Libri(isbn, titolo, anno, pagine, autore, genere);
                    archivio.aggiuntaElemento(libro);
                    System.out.println("Libro aggiunto con successo!");
                } else if (tipo == 2) {
                    System.out.print("Inserisci periodicità (Mensile, Settimanale, etc.): ");
                    String periodicita = scanner.nextLine();

                }
        }}
