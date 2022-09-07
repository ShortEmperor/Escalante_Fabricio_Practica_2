public class Espectador {
    private String nombre;
    private int edad;
    private double dinero;

    private String asignado;

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
    void setAsignado(String asignado){
        this.asignado = asignado;
    }
    String getAsignado(){
        return this.asignado;
    }

    Espectador(){
        this.nombre = "Juan Perez";
        this.edad = (int) (Math.random()*90) + 3;
        this.dinero = (double) (Math.random()*3000);
    }


}
