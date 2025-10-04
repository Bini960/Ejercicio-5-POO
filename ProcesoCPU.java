//Representa un proceso que consume muchos recursos de CPU.

public class ProcesoCPU extends Proceso {
    public ProcesoCPU(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando proceso de CPU (cálculo intensivo): " + getNombre());
    }

    @Override
    public String descripcion() {
        return "Proceso que realiza tareas intensivas de cálculo.";
    }
}
