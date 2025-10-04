/**
 * Andrés Castro Morales
 * 25039
 * Coordina la interacción entre el sistema (modelo) y la vista.
 */

import java.util.Scanner;

public class Controlador {
    private SistemaOperativo sistema;
    private Vista vista;

    public Controlador(SistemaOperativo sistema, Vista vista) {
        this.sistema = sistema;
        this.vista = vista;
    }

    // Ciclo principal del programa
    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            vista.mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            manejarOpcion(opcion, sc);
        } while (opcion != 4);
    }

    // Manejo de opciones del menú
    public void manejarOpcion(int opcion, Scanner sc) {
        switch (opcion) {
            case 1:
                vista.mostrarMensaje("Ingrese el nombre del proceso:");
                String nombre = sc.nextLine();
                vista.mostrarMensaje("Ingrese el tipo de proceso (CPU, IO, Daemon, Red):");
                String tipo = sc.nextLine();
                sistema.registrarProceso(nombre, tipo);
                vista.mostrarMensaje("Proceso registrado correctamente.");
                break;
            case 2:
                vista.mostrarProcesos(sistema.listarProcesos());
                break;
            case 3:
                sistema.ejecutarProcesos();
                break;
            case 4:
                vista.mostrarMensaje("Saliendo del sistema...");
                break;
            default:
                vista.mostrarMensaje("Opción inválida.");
        }
    }
}
