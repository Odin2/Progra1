/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class Counter {

    public Counter(String nombre, String Cedula, String direccion, int cantcasilleros) {
        this.nombre = nombre;
        this.Cedula = Cedula;
        this.direccion = direccion;
        this.cantcasilleros = cantcasilleros;
    }


    private final List<Casillero> casilleros = new ArrayList<>();


    private String nombre; 
    private String Cedula; 
    private String direccion;
    private int cantcasilleros;
    private final List<Cliente> Clientes = new ArrayList<>();
    
    public List<Casillero> getCasilleros() {
        return casilleros;
    }
    public int getCantcasilleros() {
        return cantcasilleros;
    }

    public void setCantcasilleros(int cantcasilleros) {
        this.cantcasilleros = cantcasilleros;
    }


    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Cliente> getClientes() {
        return Clientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
