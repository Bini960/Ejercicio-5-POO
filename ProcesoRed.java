//Representa un proceso de red que maneja comunicación de datos.

public class ProcesoRed extends Proceso {
    public ProcesoRed(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando proceso de Red (enviando/recibiendo datos): " + getNombre());
    }

    @Override
    public String descripcion() {
        return "Proceso que maneja comunicación a través de la red.";
    }
}
