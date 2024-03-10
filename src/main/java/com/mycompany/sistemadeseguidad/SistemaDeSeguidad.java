package com.mycompany.sistemadeseguidad;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeSeguidad {

    ControlDeAcceso sistema;
    ArrayList<Empleado> empleados;

    public static void main(String[] args) {
        new SistemaDeSeguidad().iniciar();
    }

    public void iniciar() {

        int opcion = 0;
        System.out.println("hola");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarOpciones();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> ingresar();
                case 2 -> salir();
                case 3 -> mostrarUsuariosActivos();
                case 4 -> {
                    System.out.println("Saliendo del programa...");
                    return; // Salir del método y, por ende, del bucle while
                }
                default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");

            }

        }

    }

    public SistemaDeSeguidad() {
        sistema = new ControlDeAcceso();
        empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado(1, "Juan"));
        empleados.add(new Empleado(2, "María"));
        empleados.add(new Empleado(3, "Pedro"));
        empleados.add(new Empleado(4, "Ana"));
        empleados.add(new Empleado(5, "Luis"));
        empleados.add(new Empleado(6, "Carlos"));
        empleados.add(new Empleado(7, "Laura"));
        empleados.add(new Empleado(8, "Sofía"));
        empleados.add(new Empleado(9, "Jorge"));
        empleados.add(new Empleado(10, "Lucía"));
        empleados.add(new Empleado(11, "Diego"));
        empleados.add(new Empleado(12, "Elena"));
        empleados.add(new Empleado(13, "Martín"));
        empleados.add(new Empleado(14, "Valeria"));
        empleados.add(new Empleado(15, "Roberto"));
    }

    public void ingresar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingese su Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su ID");
        int id = scanner.nextInt();

        boolean empleadoEncontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id && empleado.getNombre().equals(nombre)) {
                empleado.estado = true;
                System.out.println("Registro correcto");
                sistema.registrarEntrada(id);
                empleadoEncontrado = true;
                break; // No es necesario continuar buscando si se encontró el empleado
            }
        }

        if (!empleadoEncontrado) {
            System.out.println("No se encontró un empleado con ese ID y nombre.");
        }
    }

    public void salir() {
        Scanner scanner = new Scanner(System.in);
        mostrarUsuariosActivos();

        System.out.println("Ingrese su ID");
        int id = scanner.nextInt();

        for (Empleado empleado : empleados) {
            if (empleado.getEstado() && empleado.getId() == id) {
                empleado.estado = false;
                sistema.registrarSalida(id);
            }

        }
    }

    public void mostrarUsuariosActivos() {
        for (Empleado empleado : empleados) {
            if (empleado.getEstado()) {
                System.out.println(empleado.toString());
            }
        }
    }

    public void mostrarOpciones() {
        System.out.println("1. Ingreso");
        System.out.println("2. Salida");
        System.out.println("3. Ver empleado Activos");
        System.out.println("4. Salir");
        System.out.println("--------------------------");
    }

}
