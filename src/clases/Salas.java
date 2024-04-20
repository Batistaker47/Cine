package clases;
public class Salas {
    private int numero;
    private Peliculas pelicula;
    private String[][] butacas;

    public Salas(int numero, Peliculas pelicula, int filas, int columnas) {
        this.numero = numero;
        this.pelicula = pelicula;
        this.butacas = new String[filas][columnas];
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacas[i][j] = "O";
            }

        }
    }
}