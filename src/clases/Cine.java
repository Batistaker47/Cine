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
    /**
     * Con este método se recorre el array de salas creado en el cine, y se añaden las salas creadas al array
     * @param sala se introduce como parámetro la sala que se desea añadir al cine
     */
    public void añadirSala(Salas sala) {
        for (int i = 0; i < salas.length; i++) {
            if (salas[i] == null) {
                sala = salas[i];
            }
        }
    }
}
