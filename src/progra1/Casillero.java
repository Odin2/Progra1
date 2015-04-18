/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class Casillero {

    public Casillero(int numero,int id) {
        this.numero = numero;
        this.id = id;
    }
    private int id;
    private int numero; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private boolean ocupado = false;
    private final List<Articulo> Articulos = new ArrayList<>();
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
}
