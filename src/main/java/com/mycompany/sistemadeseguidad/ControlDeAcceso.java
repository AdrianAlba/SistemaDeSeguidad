package com.mycompany.sistemadeseguidad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ControlDeAcceso {

    public void registrarEntrada(int id) {
        RegistoEntrada registro = new RegistoEntrada(id);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("RegistroEntrada.txt", true));
            writer.write(registro.toString()+'\n');
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }

    public void registrarSalida(int id) {
        RegistroSalida registro = new RegistroSalida(id);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("RegistroSalida.txt", true));
            writer.write(registro.toString()+'\n');
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

}
