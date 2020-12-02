package com.carvajalossman.model.vehiculos;

public class Furgoneta extends Vehiculo{

    private int carga;
    private int volumen;

    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, boolean estaDisponible,
                     int carga, int volumen) {
        super(matricula, marca, modelo, color, tarifa, estaDisponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    public Furgoneta(String matricula) {
        super(matricula);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
