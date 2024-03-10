package com.mycompany.sistemadeseguidad;

import java.time.LocalTime;

public class RegistoEntrada {
    int id;
    LocalTime registro;
    
    public RegistoEntrada(int id){
        this.id= id;
        registro= LocalTime.now();
    }
    
    @Override
    public String toString(){
        return "Empleado "+id+" entro a las: "+registro;
    }
}
