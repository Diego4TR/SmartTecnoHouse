package modelo;

public abstract class Actuador implements IDispositivo {
    protected String id;
    protected String nombre;
    protected String estado;

    public Actuador(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.estado = "OFF";
    }

    public String getID() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadoActual() {
        return estado;
    }

    public abstract void ejecutarAccion(String accion);

    public abstract String[] getAccionesPosibles();
}