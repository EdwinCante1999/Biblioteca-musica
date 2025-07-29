package servicio;
import java.util.List;

import interfaz.Reproductor;
import modelo.Cancion;
import servicio.ReproductorCancion;

public class ReproductorCancion implements Reproductor {

    @Override
    public void reproducir(List<Cancion> canciones,String titulo) {
       for(Cancion c : canciones){
            if(c.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Reproduciendo cancion " + titulo);
                return;
            }    
        }
        System.out.println("Cancion no encontrada con el titulo " + titulo);
    }

    @Override
    public void pausar(List<Cancion> canciones,String titulo) {
        for(Cancion c : canciones){
            if(c.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Pausando cancion cancion " + titulo);
                return;
            }    
        }
        System.out.println("Cancion no encontrada con el titulo" + titulo);
       
    }

    @Override
    public void mostrarCanciones(List<Cancion> canciones) { // se crea una lista para agregar las canciones
       
        if (canciones.isEmpty()){  // isEmpty metodo clase List, valida si hay canciones,si hay es true y si no false
             System.out.println("No hay canciones ");
        }else {
            for (int i = 0; i < canciones.size(); i++){
                System.out.print((i + 1) + " . ");  // muestra el numero de la cancion en la lista
                System.out.println(canciones.get(i).mostrarInfo());  // get (i) se accede al objeto,
                                                 // luego se llama el metodo que muestra la informacion
            }
        }
    }

    @Override
    public void agregarCanciones(List<Cancion> canciones, Cancion cancion) {
        
        canciones.add(cancion); // agrega una cancion a la lista canciones
        System.out.println("Cancion agregada exitosamente ");
    }

    @Override
    public void eliminarCancion(List<Cancion> canciones, String titulo) {
        canciones.removeIf(c -> c.getTitulo().equalsIgnoreCase(titulo));// antes de eliminar valida el titulo que esta en la lista
                                                                        // es igual al titulo que mandamos por parametro si es asi lo elimina
        System.out.println("Cancion eliminada exitosamente");                                                                
    }

    @Override
    public void buscarCancion(List<Cancion> canciones, String titulo) {
        for(Cancion c : canciones){
            if(c.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Cancion encontrada ");
                System.out.println(c.mostrarInfo());
                return;
            }
        }
        System.out.println("Cancion no encontrada ");
    }



    
}
