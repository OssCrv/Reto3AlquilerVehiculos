package com.carvajalossman.model.vehiculos;

public class Deportivo extends Vehiculo {

    private int cilindrada;


    public Deportivo(String matricula, String marca, String modelo, String color, double tarifa, boolean estaDisponible,
                     int cilindrada) {
        super(matricula, marca, modelo, color, tarifa, estaDisponible);
        this.cilindrada = cilindrada;
    }

    public Deportivo(String matricula) {
        super(matricula);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
