/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.modelo;

/**
 *
 * @author Fedep
 */
public class Mesero {
    private int id;
    private String apellido;
    private String nombre;
    private int cuit;
    private boolean estado;

    public Mesero(String apellido, String nombre, int cuit, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuit = cuit;
        this.estado = estado;
    }

    public Mesero() {
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
