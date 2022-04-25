package sistemaInformatico;

import java.util.ArrayList;

/**
 * Esta clase sera el almacen de libros y personas las cuales estaran dentro del
 * sistema.
 *
 * @author Álvaro Saavedra Calero
 * @version 1.0
 * @since 20/04/2022
 */
public class Almacen {

    private ArrayList<Libro> almacenLibros;
    private ArrayList<Persona> almacenPersonas;

    public Almacen() {
        this.almacenLibros = new ArrayList<>();
        this.almacenPersonas = new ArrayList<>();

        almacenLibros.add(new Libro("Libro1", 0, "tituloLibro1", 3));
        almacenLibros.add(new Libro("Libro2", 1, "tituloLibro2", 7));
        almacenLibros.add(new Libro("Libro3", 2, "tituloLibro3", 389));
        almacenLibros.add(new Libro("Libro4", 3, "tituloLibro4", 8));
        almacenLibros.add(new Libro("Libro5", 4, "tituloLibro4", 45));
        almacenLibros.add(new Libro("Libro6", 5, "tituloLibro5", 56));
        almacenLibros.add(new Libro("Libro7", 6, "tituloLibro6", 4567));

        almacenPersonas.add(new Persona("Persona1", 0, 5));
        almacenPersonas.add(new Persona("Persona2", 1, 15));
        almacenPersonas.add(new Persona("Persona3", 2, 70));
        almacenPersonas.add(new Persona("Persona4", 3, 45));
        almacenPersonas.add(new Persona("Persona5", 4, 18));
    }

    /**
     * @return El almacen de libros
     */
    public ArrayList<Libro> getAlmacenLibros() {
        return almacenLibros;
    }

    /**
     * @param almacenLibros 
     */
    public void setAlmacenLibros(ArrayList<Libro> almacenLibros) {
        this.almacenLibros = almacenLibros;
    }

    /**
     * @return El almacen de personas
     */
    public ArrayList<Persona> getAlmacenPersonas() {
        return almacenPersonas;
    }

    /**
     * @param almacenPersonas 
     */
    public void setAlmacenPersonas(ArrayList<Persona> almacenPersonas) {
        this.almacenPersonas = almacenPersonas;
    }

}
