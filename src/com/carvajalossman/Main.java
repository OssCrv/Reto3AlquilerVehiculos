package com.carvajalossman;

import com.carvajalossman.model.Cliente;
import com.carvajalossman.model.EmpresaAlquilerVehiculos;
import com.carvajalossman.model.vehiculos.Deportivo;
import com.carvajalossman.model.vehiculos.Furgoneta;
import com.carvajalossman.model.vehiculos.Turismo;

public class Main {

    public static void main(String[] args) {
        EmpresaAlquilerVehiculos easydrive = new EmpresaAlquilerVehiculos("A-28-187189", "easy drive",
                "www.easydrive.com");

        easydrive.registrarCliente(new Cliente("X53636C", "Juan", "González López"));
        easydrive.registrarCliente(new Cliente ("Z25255X", "Luis", "Ramírez Ruiz"));
        easydrive.registrarVehiculo(new Turismo("4060 TUR", "Skoda", "Fabia", "Blanco",
                90.0, 2, false));
        easydrive.registrarVehiculo(new Deportivo("4070 DEP", "Ford", "Mustang", "Rojo",
                150.0, 2000));
        easydrive.registrarVehiculo(new Turismo("4080 TUR", "VW", "GTI", "Azul",
                110.0,2, false));
        easydrive.registrarVehiculo(new Turismo("4090 TUR", "SEAT", "Ibiza", "Blanco",
                90.0, 4, false));
        easydrive.registrarVehiculo(new Furgoneta("4010 FUR", "Fiat", "Ducato", "Negro",
                80.0, 1200, 8));
        
        easydrive.imprimirClientes();
        
        easydrive.imprimirVehiculos();
    }
}