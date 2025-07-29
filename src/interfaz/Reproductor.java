package interfaz;
import java.util.List;
import modelo.Cancion;

public interface Reproductor {

    void reproducir (List<Cancion> canciones,String titulo);
    void pausar (List<Cancion> canciones,String titulo);
    void mostrarCanciones (List <Cancion> canciones);
    void agregarCanciones (List< Cancion> canciones, Cancion cancion);
    void eliminarCancion (List < Cancion> canciones, String titulo);
    void buscarCancion(List < Cancion> canciones, String titulo);

    
}
