package modelo;
public class Cancion {

    // Atributos
    private String titulo;
    private String artista;
    private Integer duracion;
    
    // Constructor
    public Cancion (){}

    public Cancion (String titulo, String artista, Integer duracion) {
        this.titulo = titulo;         // this se pone para diferenciar entre el atributo y lo que se ingresa 
                                      // por parametro
        this.artista = artista;
        this.duracion = duracion;                              

    }

    // Getters y setters

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getArtista () {
        return artista;
    }

    public void setArtista (String artista) {
        this.artista = artista;
    }

    public Integer getDuracion () {
        return duracion;
    }

    public void setDuracion (Integer duracion) {
        this.duracion = duracion;
    }

    public String mostrarInfo () {
        return titulo + " - " + artista + " ( " + duracion + " )" + " seg ";
    }
}
