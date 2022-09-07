public class Main {
    public static void main(String[] args) {
        Cine.makeSala();
        Cine.printSala();

        Cine cinepolis = new Cine();
        Espectador[] espectadores = new Espectador[10];
        for (int i = 0; i < espectadores.length; i++){
            espectadores[i] = new Espectador();
        }
        Pelicula peli = new Pelicula("Christopher Nolan", "The Dark Knight", 2.32, 12);

        for (int i = 0; i < espectadores.length; i ++){
            System.out.println("Persona numero : " + (i + 1));
            Cine.printOcupados();
            cinepolis.sentarEspectador(espectadores[i], peli);
        }

        System.out.println("Final de asientos ocupados: " + cinepolis.getOcupados());




    }
}
