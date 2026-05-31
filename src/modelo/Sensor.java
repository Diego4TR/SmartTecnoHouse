package modelo;

public abstract class Sensor implements IDispositivo {
    protected String id;
    protected String nombre;
    protected String unidad;
    protected double valor;

    public Sensor(String id, String nombre, String unidad) {
        this.id = id;
        this.nombre = nombre;
        this.unidad = unidad;
        this.valor = 0;
    }

    public String getID() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    public String getEstadoActual() {
        return valor + " " + unidad;
    }

    public abstract void actualizarValor();
}