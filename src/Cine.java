import java.util.ArrayList;

public class Cine {
    static private String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
    static private String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};

    static private ArrayList<String> ocupados = new ArrayList<String>();

    // Atributos


    static private Pelicula peli = new Pelicula();
    static private double precio;

    private Espectador especta = new Espectador();

    void setPrecio(double precio){
        this.precio = precio;
    }
    double getPrecio(){
        return this.precio;
    }
    static public String[][] sala = new String[8][9];

    Cine(){
        precio = 60;

    }

    public static void makeSala(){
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < numbers.length; j++){
                sala[j][i] = letters[i] + numbers[j];
            }
        }
    }

    public static void printSala(){
        System.out.println("       ~PANTALLA~      ");
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 8; j++){
                System.out.print(sala[j][i] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void sentarEspectador(Espectador espectador){
        String asiento = new String();
        if (espectador.getDinero() > precio & espectador.getEdad() > peli.getMinEdad() ){
            asiento = sala[(int)(Math.random()*9)][(int)(Math.random()*8)];
            if (!ocupados.contains(asiento)){
                espectador.setAsignado(asiento);
            }else{
                System.out.println("Ese asiento ya esta ocupado!");
            }
        }else{
            System.out.println("No tienes el suficiente dinero (POBRE!!!!) o eres demasiado joven!");
        }
    }

}
