//Se encarga de administrar los procesos: registro, listado y ejecución.

import java.util.ArrayList;

public class SistemaOperativo {
    private ArrayList<Proceso> procesos;

    public SistemaOperativo() {
        procesos = new ArrayList<>();

        procesos.add(new ProcesoCPU("Compilador"));
        procesos.add(new ProcesoIO("Teclado"));
        procesos.add(new Daemon("MonitorSistema"));
        procesos.add(new ProcesoRed("ServidorHTTP"));
        procesos.add(new ProcesoCPU("RenderizadoVideo"));
        procesos.add(new ProcesoIO("DiscoDuro"));
        procesos.add(new Daemon("LoggerEventos"));
        procesos.add(new ProcesoRed("ClienteFTP"));
        procesos.add(new ProcesoCPU("SimulacionMatematica"));
        procesos.add(new ProcesoIO("Impresora"));
    }

    // Registro de procesos recibiendo objeto
    public void registrarProceso(Proceso proceso) {
        procesos.add(proceso);
    }

    // Sobrecarga para registrar a partir de nombre y tipo
    public void registrarProceso(String nombre, String tipo) {
        switch (tipo.toLowerCase()) {
            case "cpu":
                procesos.add(new ProcesoCPU(nombre));
                break;
            case "io":
                procesos.add(new ProcesoIO(nombre));
                break;
            case "daemon":
                procesos.add(new Daemon(nombre));
                break;
            case "red":
                procesos.add(new ProcesoRed(nombre));
                break;
            default:
                System.out.println("Tipo de proceso no válido.");
        }
    }

    // Devuelve la lista de procesos
    public ArrayList<Proceso> listarProcesos() {
        return procesos;
    }

    // Ejecuta polimórficamente todos los procesos
    public void ejecutarProcesos() {
        for (Proceso p : procesos) {
            p.ejecutar();
        }
    }

    public ArrayList<Proceso> getProcesos() {
        return procesos;
    }
}
