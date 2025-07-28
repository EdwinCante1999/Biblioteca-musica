import java.util.ArrayList;
import java.util.List;
import interfaz.Reproductor;
import modelo.Cancion;
import servicio.ReproductorCancion;

public class Principal {
    public static void main(String[] args) {

        Reproductor reproductor = new ReproductorCancion();

        Cancion cancion1 = new Cancion("perreo intenso" , "wisin y yandel " , 240);
        Cancion cancion2 = new Cancion("propuesta indecente" , "Romeo " , 360);
        Cancion cancion3 = new Cancion("La rebelion" , "Joe " , 199);
        Cancion cancion4 = new Cancion("Diabla" , " wisin " , 360);
     
        List < Cancion> canciones = new ArrayList<>();
        reproductor.agregarCanciones(canciones, cancion1);
        reproductor.agregarCanciones(canciones, cancion2);
        reproductor.agregarCanciones(canciones, cancion3);
        reproductor.agregarCanciones(canciones, cancion4);

        System.out.println("Canciones antes de eliminar ");
        reproductor.mostrarCanciones(canciones);

        System.out.println("Canciones despues de eliminar ");
        reproductor.eliminarCancion(canciones, "perreo intenso");
        reproductor.mostrarCanciones(canciones);
        reproductor.buscarCancion(canciones,"diabla");

       
       
    }
}
