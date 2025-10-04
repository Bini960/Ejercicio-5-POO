//Encargada de mostrar menús, procesos y mensajes al usuario.

import java.util.ArrayList;

public class Vista {
    public void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Registrar Proceso");
        System.out.println("2. Listar Procesos");
        System.out.println("3. Ejecutar Procesos");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarProcesos(ArrayList<Proceso> procesos) {
        System.out.println("\n--- LISTA DE PROCESOS ---");
        if (procesos.isEmpty()) {
            System.out.println("No hay procesos registrados.");
        } else {
            for (Proceso p : procesos) {
                System.out.println(p.toString() + " | " + p.descripcion());
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
