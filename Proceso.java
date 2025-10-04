/**
 * Andrés Castro Morales
 * 25039
 * Representa un proceso general del sistema operativo.
 * Cada proceso tiene un PID único y un nombre.
 */

public abstract class Proceso {
    private int pid;
    private String nombre;
    private static int contadorPid = 1; // Contador estático para generar PID

    public Proceso(String nombre) {
        this.pid = generarPid();
        this.nombre = nombre;
    }

    // Genera un PID único para cada proceso
    private int generarPid() {
        return contadorPid++;
    }

    // Getters y setters
    public int getPid() {
        return pid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos que cada subclase debe implementar
    public abstract void ejecutar();
    public abstract String descripcion();

    @Override
    public String toString() {
        return "[PID=" + pid + "] " + this.getClass().getSimpleName() + " - Nombre: " + nombre;
    }
}
