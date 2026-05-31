package modelo;

import java.util.Random;

public class SensorLuz extends Sensor {

    public SensorLuz(String id, String nombre) {
        super(id, nombre, "lux");
    }

    @Override
    public void actualizarValor() {
        Random r = new Random();
        valor = r.nextInt(101);
    }
}