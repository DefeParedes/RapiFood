/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapifood.modelo;

import rapifood.modelo.Mesa;

/**
 *
 * @author marco
 */
public class Pedido {
  
    private int id;
    private Mesa mesa;
    private Mesero mesero;
    private double monto;
    private boolean estado;

    public Pedido(Mesa mesa, Mesero mesero, double monto, boolean estado) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.monto = monto;
        this.estado = estado;
    }

    public Pedido(){}

    public int getId() {
        return id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public double getMonto() {
        return monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
