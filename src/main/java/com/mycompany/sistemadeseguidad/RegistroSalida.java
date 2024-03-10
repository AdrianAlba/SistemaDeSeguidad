package com.mycompany.sistemadeseguidad;

import java.time.LocalTime;

public class RegistroSalida {
    int id;
    LocalTime registro;
    
    public RegistroSalida(int id){
        this.id= id;
        registro= LocalTime.now();
    }
    
    @Override
    public String toString(){
        return "Empleado "+id+" salio a las: "+registro;
    }
}