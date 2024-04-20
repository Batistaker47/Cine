package menu;
import clases.Salas;
import clases.Cine;
import clases.Peliculas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Inicialización del cine
        Cine cine1 = new Cine("YELMO CINES", 10);

        //Se inicializan las salas con sus películas
        Salas sala1 = new Salas(1, new Peliculas("VENOM", 100), 10, 10);
        Salas sala2 = new Salas(2, new Peliculas("SPIDERMAN", 150), 10, 10);
        Salas sala3 = new Salas(3, new Peliculas("BATMAN", 95), 10, 10);
        Salas sala4 = new Salas(4, new Peliculas("SUPERMAN", 110), 10, 10);

        // Se añaden las salas al array del cine
        cine1.añadirSala(sala1);
        cine1.añadirSala(sala2);
        cine1.añadirSala(sala3);
        cine1.añadirSala(sala4);
        int opcion;
        //Bucle creado mientras seguir valga true, para poder realizar el proceso principal de la aplicación las veces que determine el usuario hasta que decida salir
        boolean seguir = true;
        while (seguir) {
            System.out.println("-------------------------------------------------");
            System.out.println("BIENVENIDO A " + cine1.getNombreCine() + ", SUS CINES DE CONFIANZA"
                    + "\n-------------------------------------------------\n¿Qué desea hacer?\n1) Ver cartelera para hoy.\n2) Comprar entradas.\n3) Salir.");
            opcion = entrada.nextInt();

            switch (opcion) {
                //Muestra la información de todas las salas disponibles
                case 1:
                    sala1.informacionSalas();
                    sala2.informacionSalas();
                    sala3.informacionSalas();
                    sala4.informacionSalas();
                    break;
                case 2:
                    // Reserva de entradas en función de la sala elegida
                    int salaReservar;
                    int fila;
                    int columna;
                    String email;
                    System.out.println("Por favor, introduzca un email para gestionar su reserva: ");
                    email = entrada.next();
                    System.out.println("En qué sala desea reservar entrada?");
                    salaReservar = entrada.nextInt();
                    System.out.println("Seleccione una fila: ");
                    fila = entrada.nextInt();
                    System.out.println("Seleccione un asiento: ");
                    columna = entrada.nextInt();
                    //Llamada a los métodos de reserva y de muestra de asientos disponbles en función de la sala
                    if (salaReservar == 1) {
                        sala1.reservarButaca(fila, columna, email);
                        sala1.mostrarButacas(salaReservar);
                    }
                    if (salaReservar == 2) {
                        sala2.reservarButaca(fila, columna, email);
                        sala2.mostrarButacas(salaReservar);
                    }
                    if (salaReservar == 3) {
                        sala3.reservarButaca(fila, columna, email);
                        sala3.mostrarButacas(salaReservar);
                    }
                    if (salaReservar == 4) {
                        sala4.reservarButaca(fila, columna, email);
                        sala4.mostrarButacas(salaReservar);
                    }
                    break;
                case 3:
                    System.out.println("GRACIAS POR CONFIAR EN YELMO CINES. HASTA LA PRÓXIMA!");
                    seguir = false;


            }
        }

    }
    }

