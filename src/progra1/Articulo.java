/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1;

/**
 *
 * @author Alejandro
 */
public class Articulo {

    public Articulo(int id, String descripcion, String remitente) {
        this.id = id;
        this.descripcion = descripcion;
        this.remitente = remitente;
        this.entregado = false;
    }
    protected int id;
    protected boolean entregado;
    protected String descripcion;
    protected String remitente;
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    
    
}
