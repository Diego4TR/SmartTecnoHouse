package modelo;

import java.util.ArrayList;
import java.util.List;

public class SmartTecnoHouse {
    private List<Sensor> sensores;
    private List<Actuador> actuadores;
    private List<Regla> reglas;

    public SmartTecnoHouse() {
        sensores = new ArrayList<>();
        actuadores = new ArrayList<>();
        reglas = new ArrayList<>();

        sensores.add(new SensorTemperatura("temp", "Sensor de temperatura"));
        sensores.add(new SensorLuz("light", "Sensor de luz"));
        sensores.add(new SensorPresencia("pir", "Sensor de presencia"));
        sensores.add(new SensorHumedad("hum", "Sensor de humedad"));

        actuadores.add(new ActuadorBombilla("bulb", "Bombilla inteligente"));
        actuadores.add(new ActuadorVentilador("fan", "Ventilador"));
        actuadores.add(new ActuadorEnchufe("plug", "Enchufe inteligente"));

        reglas.add(new ReglaVentilacion());
        reglas.add(new ReglaIluminacion());
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public List<Actuador> getActuadores() {
        return actuadores;
    }

    public void actualizarSensores() {
        for (Sensor sensor : sensores) {
            sensor.actualizarValor();
        }
    }

    public void aplicarReglas() {
        for (Regla regla : reglas) {
            regla.aplicar(sensores, actuadores);
        }
    }

    public void simularPaso() {
        actualizarSensores();
        aplicarReglas();
    }
}