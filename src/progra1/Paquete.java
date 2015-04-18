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
public class Paquete extends Articulo{

    public Paquete(boolean electronico, boolean fragil, int peso, int id, String descripcion, String remitente) {
        super(id, descripcion, remitente);
        this.electronico = electronico;
        this.fragil = fragil;
        this.peso = peso;
    }
    private boolean electronico; 
    private boolean fragil;
    private int peso;

    public boolean isElectronico() {
        return electronico;
    }

    public void setElectronico(boolean electronico) {
        this.electronico = electronico;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
