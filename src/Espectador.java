public class Espectador {
    private String nombre;
    private int edad;
    private double dinero;

    // Setters and getters
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    String getNombre(){
        return this.nombre;
    }

    void setEdad(int edad){
        this.edad = edad;
    }
    int getEdad(){
        return this.edad;
    }

    void setDinero(double dinero){
        this.dinero = dinero;
    }
    double getDinero(){
        return this.dinero;
    }


}