package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Archivio {
    //aggiungere un elemento che viene di conseguenza salvato in una lista
    //creo la lista che è un array usando Hashset per evitare duplicati
    Set<Catalogo> archivio = new HashSet<>();
    //ora genero il metodo per aggiungere un nuovo elemento
    public boolean aggiuntaElemento(Catalogo elemento) { // il primo parametro rappresenta l'oggetto che vogliamo passare
      return  archivio.add(elemento);//se l'elemento è nuovo restituisce true e viene aggiunto
    }
    public class ElementoNonTrovatoException extends Exception{
        public ElementoNonTrovatoException(String msg) {
            super(msg);
        }

    }
    public Catalogo ricercaElemento(String isbn) throws ElementoNonTrovatoException { //string isbn è il parametro che il metodo deve avere
      for (Catalogo elemento : archivio) {
          if (elemento.getIsbn().equals(isbn)) {
              return elemento;
          }
      }
        throw new ElementoNonTrovatoException ("Elemento non trovato");
    }
    public boolean rimuoviElemento(String isbn) throws ElementoNonTrovatoException {
        return archivio.removeIf(catalogo -> catalogo.getIsbn().equals(isbn));
    }
    public List<Catalogo> ricercaAnnoPubblicazione(int anno) {
        return archivio .stream().filter(p -> p.getAnnoPubblicazione() == anno).toList();
    }
    public List<Catalogo> ricercaPerAutore (String autore){
        return archivio .stream()
                .filter(p -> p instanceof Libri && ((Libri) p).getAutore().toLowerCase().contains(autore.toLowerCase()))
                .collect(Collectors.toList());

  }




}
