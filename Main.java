/**
 * Andrés Castro Morales
 * 25039
 * Aquí se inicializan Vista, SistemaOperativo y Controlador.
 */
public class Main {
    public static void main(String[] args) {
        SistemaOperativo sistema = new SistemaOperativo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(sistema, vista);

        // Inicia la ejecución del programa
        controlador.iniciar();
    }
}
