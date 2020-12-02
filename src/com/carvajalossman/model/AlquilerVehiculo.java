package com.carvajalossman.model;

import com.carvajalossman.model.vehiculos.Vehiculo;

public class AlquilerVehiculo {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquier;
    private int mesAlquier;
    private int añoAlquier;

    public AlquilerVehiculo() {
        //TODO
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiaAlquier() {
        return diaAlquier;
    }

    public void setDiaAlquier(int diaAlquier) {
        this.diaAlquier = diaAlquier;
    }

    public int getMesAlquier() {
        return mesAlquier;
    }

    public void setMesAlquier(int mesAlquier) {
        this.mesAlquier = mesAlquier;
    }

    public int getAñoAlquier() {
        return añoAlquier;
    }

    public void setAñoAlquier(int añoAlquier) {
        this.añoAlquier = añoAlquier;
    }
}
