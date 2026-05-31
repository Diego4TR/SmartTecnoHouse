package modelo;

import java.util.List;

public class ReglaIluminacion implements Regla {

    @Override
    public void aplicar(List<Sensor> sensores, List<Actuador> actuadores) {
        double presencia = 0;
        double luz = 100;

        for (Sensor sensor : sensores) {
            if (sensor.getID().equals("pir")) {
                presencia = sensor.getValor();
            }

            if (sensor.getID().equals("light")) {
                luz = sensor.getValor();
            }
        }

        for (Actuador actuador : actuadores) {
            if (actuador.getID().equals("bulb")) {
                if (presencia == 1 && luz < 40) {
                    actuador.ejecutarAccion("ON");
                } else {
                    actuador.ejecutarAccion("OFF");
                }
            }
        }
    }
}