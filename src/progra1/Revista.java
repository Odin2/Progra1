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
public class Revista extends Articulo{

    public Revista(String nombre, boolean catalogo, String tema, int id, String descripcion, String remitente) {
        super(id, descripcion, remitente);
        this.nombre = nombre;
        this.catalogo = catalogo;
        this.tema = tema;
    }
    private String nombre;
    private boolean catalogo;
    private String tema;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCatalogo() {
        return catalogo;
    }

    public void setCatalogo(boolean catalogo) {
        this.catalogo = catalogo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    
}
