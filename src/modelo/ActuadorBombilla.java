package modelo;

public class ActuadorBombilla extends Actuador {

    public ActuadorBombilla(String id, String nombre) {
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