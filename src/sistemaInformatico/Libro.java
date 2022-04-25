package sistemaInformatico;

import java.util.Objects;

/**
 * Esta clase representa cada uno de los libros que se encuentran en la
 * biblioteca
 *
 * @author Álvaro Saavedra Calero
 * @version 1.0
 * @since 20/04/2022
 */
public class Libro {

    private String nombre;
    private int idLibro;
    private String titulo;
    private int edicionLibro;

    public Libro(String nombre, int id, String titulo, int edicion) {
        this.nombre = nombre;
        this.idLibro = id;
        this.titulo = titulo;
        this.edicionLibro = edicion;
    }

    /**
     * @return El nombre del Libro en cuestion
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre (String)
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return El idLibro del Libro en cuestion
     */
    public int getIdLibro() {
        return idLibro;
    }

    /**
     * @param idLibro (int)
     */
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * @return El titulo del Libro en cuestion
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo (String)
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return La edicionLibro del Libro en cuestion
     */
    public int getEdicionLibro() {
        return edicionLibro;
    }

    /**
     * @param edicionLibro (int)
     */
    public void setEdicionLibro(int edicionLibro) {
        this.edicionLibro = edicionLibro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.idLibro;
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + this.edicionLibro;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.idLibro != other.idLibro) {
            return false;
        }
        if (this.edicionLibro != other.edicionLibro) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", idLibro=" + idLibro + ", titulo=" + titulo + ", edicionLibro=" + edicionLibro + '}';
    }

}
