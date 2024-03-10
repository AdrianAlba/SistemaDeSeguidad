package com.mycompany.sistemadeseguidad;

public class Empleado {
    int id;
    String nombre;
    boolean estado;
    
    public Empleado(int id,String nombre){
        this.id = id;
        this.nombre = nombre;
        estado=false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String toString(){
       return id+"-"+nombre;
    }
    public boolean getEstado(){
        return estado;
    }
    
}
