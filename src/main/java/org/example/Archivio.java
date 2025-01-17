package org.example;

import java.util.ArrayList;
import java.util.List;

public class Archivio {
    //aggiungere un elemento che viene di conseguenza salvato in una lista
    //creo la lista che è un array
    List<Catalogo> archivio = new ArrayList<>();
    //ora genero il metodo per aggiungere un nuovo elemento
    public void aggiuntaElemento(Catalogo elemento) { // il primo parametro rappresenta l'oggetto che vogliamo passare
        archivio.add(elemento);
    }
}
