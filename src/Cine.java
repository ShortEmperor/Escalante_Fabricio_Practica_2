import java.util.Arrays;

public class Cine {
    static private String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
    static private String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private String[] ocupados = new String[10];

    // Atributos


    private Pelicula[] pelicula = new Pelicula[10];
    private double precio;

    void setPrecio(double precio){
        this.precio = precio;
    }
    double getPrecio(){
        return this.precio;
    }
    static public String[][] sala = new String[8][9];

    public static void hacerSala(){
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < numbers.length; j++){
                sala[j][i] = letters[i] + numbers[j];
            }
        }
    }

    public static void printSala(){
        System.out.println("       PANTALLA      ");
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 8; j++){
                System.out.print(sala[j][i] + " ");
            }
            System.out.print("\n");
        }
    }
}
