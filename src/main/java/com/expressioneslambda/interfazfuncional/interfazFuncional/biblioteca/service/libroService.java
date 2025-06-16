package com.expressioneslambda.interfazfuncional.interfazFuncional.biblioteca.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.expressioneslambda.interfazfuncional.interfazFuncional.biblioteca.model.Libro;

public class libroService {
    private List<Libro> biblioteca;

    public libroService() {
        this.biblioteca = new ArrayList<>();
    }

    public void LibrosAgregadas() {
        biblioteca.add(new Libro("cien años de soledad", "gabriel garcia marquez", "novela literaria", 496));
        biblioteca.add(new Libro("el señor de los anillos ", " J.R.R. tolkien", "fantasia", 1200));
        biblioteca.add(new Libro("1984", "George Orwell", "distopía", 328));
        biblioteca.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "novela clásica", 863));
        biblioteca.add(new Libro("Crónica de una muerte anunciada", "Gabriel García Márquez", "novela literaria", 122));
        biblioteca.add(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "fantasía", 309));
    }

    // metodo para filtrar peliculas
    /*
     * scribe un Predicate<Libro> para encontrar todos los libros que tengan más de
     * 500 páginas. Úsalo para filtrar la lista biblioteca.
     */
    public void filtrarLibros() {
        Predicate<Libro> librosConPaginasSuperiores = (biblioteca) -> biblioteca.getNumeroDePaginas() >= 500;

        List<Libro> librosFiltrados = biblioteca.stream()
                .filter(librosConPaginasSuperiores)
                .collect(Collectors.toList());

        librosFiltrados.forEach(libro -> System.out.println("- " + libro.getNombreLibro()));

    }

    // metodo para formatear la informacion

    /*
     * Escribe una Function<Libro, String> que tome un objeto Libro y devuelva una
     * cadena de texto con el formato "Título: [titulo], Autor: [autor]". Úsala para
     * crear una nueva lista de strings con la información formateada de cada libro
     */
    public void transformarInformacion() {
        Function<Libro, String> libroAformatear = (libro) -> {
            return "titulo " + libro.getNombreLibro() + " nombre del autor" + libro.getNombreAutor();
        };

        List<String> informacionFormateada = biblioteca.stream()
                .map(libroAformatear)
                .collect(Collectors.toList());

        System.out.println(" informacion de la biblioteca formateada ");
        informacionFormateada.forEach(info -> System.out.println("- " + info));

    }

    // metodo mostrar SOLO EL GENERO DEL LIBRO 

    public void generoLibro(){

        // version larga 

        /* la mas recomendada para aprender el paso a paso es la version larga  */

        /*
         *  Consumer <Libro> generoLibro = (Libro) -> {
           System.out.println(" el genero de libro es "+ Libro.getGeneroLiterario());
        };

        System.out.println("--- generos de los libros en la biblioteca ---");
        biblioteca.stream().forEach(generoLibro);
         * 
         */

         // version mas simplificada

        /*  System.out.println("-- genero de los libros en la biblioteca");

         biblioteca.forEach(libro-> System.out.println(" Genero"+ libro.getGeneroLiterario()));
       */
    }

}
