//Representa un proceso que corre en segundo plano.

public class Daemon extends Proceso {
    public Daemon(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando proceso Daemon (segundo plano): " + getNombre());
    }

    @Override
    public String descripcion() {
        return "Proceso que corre en segundo plano brindando servicios.";
    }
}
