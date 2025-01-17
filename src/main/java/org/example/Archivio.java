package org.example;

import java.util.HashSet;
import java.util.Set;

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
    public Catalogo ricercaElemento(String isbn) throws ElementoNonTrovatoException {
      for (Catalogo elemento : archivio) {
          if (elemento.getIsbn().equals(isbn)) {
              return elemento;
          }
      }
        throw new ElementoNonTrovatoException ("Elemento non trovato");
    }
}
