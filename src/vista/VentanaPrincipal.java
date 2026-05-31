package vista;

import modelo.Actuador;
import modelo.Sensor;
import modelo.SmartTecnoHouse;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private SmartTecnoHouse casa;
    private JTextArea areaTexto;

    public VentanaPrincipal() {
        casa = new SmartTecnoHouse();

        setTitle("SmartTecnoHouse");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);

        JButton btnSimular = new JButton("Actualizar sistema");
        btnSimular.addActionListener(e -> {
            casa.simularPaso();
            mostrarDatos();
        });

        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
        add(btnSimular, BorderLayout.SOUTH);

        mostrarDatos();
    }

    private void mostrarDatos() {
        String texto = "Sensores:\n";

        for (Sensor sensor : casa.getSensores()) {
            texto += sensor.getNombre() + ": " + sensor.getEstadoActual() + "\n";
        }

        texto += "\nActuadores:\n";

        for (Actuador actuador : casa.getActuadores()) {
            texto += actuador.getNombre() + ": " + actuador.getEstadoActual() + "\n";
        }

        areaTexto.setText(texto);
    }
}