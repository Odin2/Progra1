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
public class Sobre extends Articulo{

    /**
     *
     * @param tipo
     * @param contenido
     * @param peso
     * @param id
     * @param descripcion
     * @param remitente
     */
    public 
        Sobre(int id, String descripcion, String remitente,boolean tipo, boolean contenido, int peso) {
        super(id,descripcion,remitente);
        this.tipo = tipo;
        this.contenido = contenido;
        this.peso = peso;
    }
    private boolean tipo /*1 aereo, 0 manila*/; 
    private boolean contenido /* 0 documentacion, 1 otros*/; 
    private int peso;

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isContenido() {
        return contenido;
    }

    public void setContenido(boolean contenido) {
        this.contenido = contenido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
