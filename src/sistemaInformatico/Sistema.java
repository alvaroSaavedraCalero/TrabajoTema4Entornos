package sistemaInformatico;

/**
 * En esta clase se creara el menu y sera al aplicacion inicial
 *
 * @author Álvaro Saavedra Calero
 * @version 1.0
 * @since 20/04/2022
 */
public class Sistema {

    /**
     * Este sera el menu principal de la aplicacion
     *
     * @param persona la cual trabajara con el menu
     */
    public static void menu(Persona persona) {
        System.out.println("Bienvenido/a " + persona.getNombre() + ", ¿que te apetece hacer?");
        System.out.println("1. Consultar un libro por nombre");
        System.out.println("2. Consultar un libro por id");
        System.out.println("3. Eliminar un libro por id");
        System.out.println("Proximamente mas");
        
        Scanner entrada = new Scanner(System.in);
        int respuesta;
        try {
            System.out.println("Elija una opcion: ");
            respuesta = Integer.parseInt(entrada.nextLine);
        } catch (NumberFormatException error){
            System.out.println("Eso no es un numero");
        }
    }
    
    
}
