import java.sql.Time;

public class Pelicula {
    private String titulo;
    private String director;
    private Time duracion;
    private int minEdad;

    // Setters and getters
    void setTitulo(String titulo){
        this.titulo = titulo;
    }
    String getTitulo(){
        return this.titulo;
    }

    void setDirector(String director){
        this.director = director;
    }
    String getDirector(){
        return this.director;
    }

    void setDuracion(Time duracion){
        this.duracion = duracion;
    }
    Time getDuracion(){
        return this.duracion;
    }

    void setMinEdad(int minEdad){
        this.minEdad = minEdad;
    }
    int getMinEdad(){
        return this.minEdad;
    }

}
