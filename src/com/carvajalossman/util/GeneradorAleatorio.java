package com.carvajalossman.util;

import com.carvajalossman.model.Cliente;
import com.carvajalossman.model.vehiculos.Deportivo;
import com.carvajalossman.model.vehiculos.Furgoneta;
import com.carvajalossman.model.vehiculos.Turismo;

public class GeneradorAleatorio {

    public static Cliente cliente(){
        return new Cliente(codigo(10_000_000d, 99_999_999d), nombre(), apellidos());
    }

    public static Deportivo vehiculoDeportivo(){
        return new Deportivo(matricula(), marca(), modelo(), color(), numeroDouble(10_000d, 99_999_999d),
                true, entero(100));
    }


    public static Furgoneta vehiculoFurgoneta(){
        return new Furgoneta(matricula(), marca(), modelo(), color(), numeroDouble(10_000d, 99_999_999d),
                true, entero(500), entero(1000));
    }


    public static Turismo vehiculoTurismo(){
        return new Turismo(matricula(), marca(), modelo(), color(), numeroDouble(10_000d, 99_999_999d),
                true, entero(10), booleano());
    }


    public static String nombre() {
        String nombreAleatorio;

        String[] nombresFemeninos = { "Andrea", "Luciana", "Isabella", "Salomé", "Antonella", "Mariana", "Gabriela",
                "Mariangel", "Celeste", "Samantha", "Victoria", "Sofía", "Dulce", "María", "Maria", "Sara", "Fernanda",
                "Valentina", "Luz", "Dary", "Luisa", "Daniela", "Tatiana"};

        String[] nombresMasculinos = {"Juan", "José", "Miguel", "Ángel", "Sebastian", "Samuel", "David", "Pablo",
                "Angel", "Esteban", "Felipe", "Santiago", "Emiliano", "Emmanuel", "Mathias", "Martín"};


        if(Math.random()>0.5){
            nombreAleatorio = nombresFemeninos[entero(nombresFemeninos.length - 1)] + " " +
                    nombresFemeninos[entero(nombresFemeninos.length - 1)];
        }else{
            nombreAleatorio = nombresMasculinos[entero(nombresMasculinos.length - 1)] + " " +
                    nombresMasculinos[entero(nombresMasculinos.length - 1)];
        }
        return nombreAleatorio;
    }

    public static String apellidos() {
        String apellidosAleatorios = "";


        String[] apellidos = { "Sánchez", "Guerrero", "Cardenas", "Rodríguez", "Cardona", "Gonzalez", "Martínez",
                "García", "Pérez", "López", "Castro", "Hernández", "Gómez", "Díaz", "Alvarez", "Rojas", "Mejía"};

        apellidosAleatorios += apellidos[entero(apellidos.length - 1)] +
                " " + apellidos[entero(apellidos.length - 1)];

        return apellidosAleatorios;
    }

    public static String[] fecha() {

        int annio = entero(1950,2020);

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre"};
        String mes = meses[entero(meses.length - 1)];

        String dia;

        if (mes.equals("febrero")) {
            if(annio % 4 == 0){
                dia = String.valueOf(entero(1, 29));
            }else {
                dia = String.valueOf(entero(1, 28));
            }
        }
        else if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            dia = String.valueOf(entero(1, 30));
        }else{
            dia = String.valueOf(entero(1, 31));
        }

        return new String[]{String.valueOf(annio), mes, dia};
    }

    public static String matricula(){
        String matricula;
        int numeros = entero(100,999);
        String letras = letras(3);
        matricula = letras + " " + numeros;
        return matricula;
    }

    public static String letras(int numeroLetras){
        StringBuilder letrasAleatorias = new StringBuilder();
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S" , "T", "V", "W", "X", "Y", "Z"};

        for(int i = 0; i < numeroLetras; i++){
            letrasAleatorias.append(letras[entero(letras.length - 1)]);
        }
        return letrasAleatorias.toString();
    }

    public static String color(){
        String[] colores = {"negro", "azul", "marrón", "gris", "verde", "naranja", "rosa", "púrpura", "rojo",
                "blanco", "amarillo"};
        return colores[entero(colores.length - 1)];
    }

    public static String marca(){
        String[] colores = {"Abarth", "Alfa Romeo", "Aston Martin", "Audi", "Bentley", "BMW", "Cadillac", "Caterham",
                "Chevrolet", "Citroen", "Dacia", "Ferrari", "Fiat", "Ford", "Honda", "Infiniti", "Isuzu", "Iveco",
                "Jaguar", "Jeep", "Kia", "KTM", "Lada", "Lamborghini", "Lancia", "Land Rover", "Lexus", "Lotus",
                "Maserati", "Mazda", "Mercedes-Benz", "Mini", "Mitsubishi", "Morgan", "Nissan", "Opel", "Peugeot",
                "Piaggio", "Porsche", "Renault", "Rolls-Royce", "Seat", "Skoda", "Smart", "SsangYong", "Subaru",
                "Suzuki", "Tata", "Tesla", "Toyota", "Volkswagen", "Volvo"};
        return colores[entero(colores.length - 1)];
    }


    public static String modelo(){
        return "Modelo" + letras(2) + entero(10,99);
    }

    public static String codigo(Double min, Double max) {
        double range = max - min + 1;
        return String.format("%.0f",Math.random() * range + min);
    }

    public static double numeroDouble(double min, double max) {
        double range = max - min + 1;
        return (double)(Math.random() * range) + min;
    }

    public static int entero(int min, int max) {
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }


    public static int entero(int max) {
        int range = max + 1;
        return (int)(Math.random() * range);
    }


    public static boolean booleano(){
        return Math.random() > 0.5;
    }
}