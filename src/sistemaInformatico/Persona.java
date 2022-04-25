package sistemaInformatico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Esta clase representa las distintas personas que tendran acceso a los libros
 * del sistema informatico.
 *
 * @author Álvaro Saavedra Calero
 * @version 1.0
 * @since 20/04/2022
 */
public class Persona {

    private String nombre;
    private int id;
    private int edad;

    public Persona(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    /**
     * @return El nombre de la Persona en cuestion.
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
     * @return El id de la Persona en cuestion.
     */
    public int getId() {
        return id;
    }

    /**
     * @param id (int)
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return La edad de la Persona en cuestion.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad (int)
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + this.id;
        hash = 71 * hash + this.edad;
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
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + '}';
    }
    
    
    
    
    /**
     * Metodo para buscar un libro en el sistema.
     * @param id del Libro para buscar.
     * @param almacenLibros donde deberia encontrarse el libro.
     * @return Libro con el id pasado por parametro.
     */
    public Libro buscarLibro(int id, ArrayList<Libro> almacenLibros){
        Libro retorno = null;
        Iterator<Libro> iterador = almacenLibros.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().getIdLibro() == id){
                retorno = iterador.next();
            }
        }
        return retorno;
    }

}
