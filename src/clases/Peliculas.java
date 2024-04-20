package clases;
public class Peliculas {
    private String titulo;
    private int duracion;
    public Peliculas(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
}
