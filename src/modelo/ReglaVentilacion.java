package modelo;

import java.util.List;

public class ReglaVentilacion implements Regla {

    @Override
    public void aplicar(List<Sensor> sensores, List<Actuador> actuadores) {
        double temperatura = 0;

        for (Sensor sensor : sensores) {
            if (sensor.getID().equals("temp")) {
                temperatura = sensor.getValor();
            }
        }

        for (Actuador actuador : actuadores) {
            if (actuador.getID().equals("fan")) {
                if (temperatura > 25) {
                    actuador.ejecutarAccion("HIGH");
                } else {
                    actuador.ejecutarAccion("OFF");
                }
            }
        }
    }
}