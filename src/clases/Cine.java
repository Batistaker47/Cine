package clases;
public class Cine {
    private String nombre;
    private int aforo;
    private Salas[] salas;

    public Cine(String nombre, int numeroSalas) {
        this.nombre = nombre;
        this.salas = new Salas[numeroSalas];
    }
    public String getNombreCine() {
        return nombre;
    }

}
