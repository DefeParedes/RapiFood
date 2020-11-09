/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.modelo;

import java.sql.Date;

/**
 *
 * @author Fedep
 */
public class Reserva {
    private int id;
    private String nombre_cliente;
    private String apellido_cliente;
    private Date turno_reserva;
    private boolean estado;
    private Mesa mesa;

    public Reserva(String nombre_cliente, String apellido_cliente, Date turno_reserva, boolean estado, Mesa mesa) {
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.turno_reserva = turno_reserva;
        this.estado = estado;
        this.mesa = mesa;
    }

    public Reserva() {}

    public int getId() {
        return id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public Date getTurno_reserva() {
        return turno_reserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public void setTurno_reserva(Date turno_reserva) {
        this.turno_reserva = turno_reserva;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    } 
}
