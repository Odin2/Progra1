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
public class Cliente {

    private int id;

    public Cliente(int id, String nombre, String correo, int telefono, String direccion, boolean sexo, String fechanacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechanacimiento = fechanacimiento;
    }
    private String nombre; 
    private String correo;
    private int telefono;
    private String direccion; 
    private boolean sexo/*1 para hombre, 0 para mujer?*/;
    private String fechanacimiento;
    private String estado = "N";
    private int paquetes = 10; //paquetes para pasar de nivel
    

    public int getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(int paquetes) {
        this.paquetes = paquetes;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    
}
