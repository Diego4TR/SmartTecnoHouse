package modelo;

import java.util.Random;

public class SensorPresencia extends Sensor {

    public SensorPresencia(String id, String nombre) {
        super(id, nombre, "");
    }

    @Override
    public void actualizarValor() {
        Random r = new Random();
        valor = r.nextBoolean() ? 1 : 0;
    }

    @Override
    public String getEstadoActual() {
        if (valor == 1) {
            return "Movimiento detectado";
        } else {
            return "Sin movimiento";
        }
    }
}