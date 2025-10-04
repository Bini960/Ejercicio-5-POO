//Representa un proceso que interactúa con dispositivos de Entrada/Salida.

public class ProcesoIO extends Proceso {
    public ProcesoIO(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando proceso de Entrada/Salida (esperando dispositivo): " + getNombre());
    }

    @Override
    public String descripcion() {
        return "Proceso que interactúa con dispositivos externos.";
    }
}
