package modelo;

import java.util.Random;

public class SensorHumedad extends Sensor {

    public SensorHumedad(String id, String nombre) {
        super(id, nombre, "%");
    }

    @Override
    public void actualizarValor() {
        Random r = new Random();
        valor = 30 + r.nextInt(51);
    }
}