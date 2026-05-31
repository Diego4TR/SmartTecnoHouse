package modelo;

public class ActuadorEnchufe extends Actuador {

    public ActuadorEnchufe(String id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void ejecutarAccion(String accion) {
        if (accion.equals("ON") || accion.equals("OFF")) {
            estado = accion;
        }
    }

    @Override
    public String[] getAccionesPosibles() {
        return new String[]{"ON", "OFF"};
    }
}