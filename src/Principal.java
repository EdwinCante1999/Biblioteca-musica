import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import interfaz.Reproductor;
import modelo.Cancion;
import servicio.ReproductorCancion;

public class Principal {
    public static void main(String[] args) {

       Scanner sc = new Scanner (System.in);
       List <Cancion> canciones = new ArrayList<>();
       Reproductor reproductor = new ReproductorCancion();
       boolean continuar = true;
       while (continuar){
        System.out.println("***MENU BIBLIOTECA***");
        System.out.println("1. Agregar cancion");
        System.out.println("2. Mostrar canciones");
        System.out.println("3. Eliminar  cancion");
        System.out.println("4. Reproducir cancion");
        System.out.println("5. Pausar cancion");
        System.out.println("6. Buscar cancion");
        System.out.println("7. Salir");
        System.out.println("Seleccione una opcion");

        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
               System.out.print("Titulo");
               String titulo = sc.nextLine();
               System.out.print("Artista");
               String artista = sc.nextLine();
               System.out.print("Duracion");
               int duracion = sc.nextInt();
               reproductor.agregarCanciones(canciones, new Cancion(titulo, artista, duracion));
               break;
            case 2:
               reproductor.mostrarCanciones(canciones);
               break;
            case 3:
               System.out.println("Titulo de la cancion que desea eliminar");
               String buscar = sc.nextLine();
               reproductor.eliminarCancion(canciones,buscar);
               break;
            case 4:
               System.out.println("Digite el titulo de la cancion que desea Reproducir"); 
               String escuchar = sc.nextLine();
               reproductor.reproducir(canciones,escuchar);
               break;
            case 5:
               System.out.println("Digite el titulo de la cancion que desea Pausar"); 
               String pausar = sc.nextLine();
               reproductor.pausar(canciones, pausar);
               break;
            case 6:
               System.out.println("Titulo de la cancion que desea buscar");
               String busqueda = sc.nextLine();
               reproductor.buscarCancion(canciones,busqueda);
               break;
            case 7: 
               continuar = false;         
        
            default:
            System.out.println("OPcion invalida");
                break;
            }

        }
        sc.close();
        System.out.println("¡Gracias por usar la biblioteca musical! ");
    }
}
