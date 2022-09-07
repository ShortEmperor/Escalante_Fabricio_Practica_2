import java.sql.Time;

public class Pelicula {
    private String titulo;
    private String director;
    private double duracion;
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

    void setDuracion(double duracion){
        this.duracion = duracion;
    }
    double getDuracion(){
        return this.duracion;
    }

    void setMinEdad(int minEdad){
        this.minEdad = minEdad;
    }
    int getMinEdad(){
        return this.minEdad;
    }

    Pelicula(){
        this.director = "John Lasseter";
        this.titulo = "Toy Story";
        this.duracion = 1.21;
        this.minEdad = 4;
    }

    Pelicula(String director, String titulo, double duracion, int minEdad){
        this.director = director;
        this.titulo = titulo;
        this.duracion = duracion;
        this.minEdad = minEdad;
    }

}
