package modelo;

import java.util.Random;

public class SensorTemperatura extends Sensor {

    public SensorTemperatura(String id, String nombre) {
        super(id, nombre, "°C");
    }

    @Override
    public void actualizarValor() {
        Random r = new Random();
        valor = 18 + r.nextInt(13);
    }
}