package com.carvajalossman.model;

import com.carvajalossman.model.vehiculos.Vehiculo;

public class EmpresaAlquierVehiculos {

    private String cif;
    private String nombre;
    private String paginaWeb;
    private int totalClientes;
    private Cliente[] clientes;
    private int totalVehiculos;
    private Vehiculo[] vehiculos;
    private int totalAlquileres;
    private AlquilerVehiculo[] alquieresVehiculos;

    public void registrarCliente(Cliente cliente){
        //TODO
    }

    public void registrarVehiculo(Vehiculo vehiculo){
        //TODO
    }

    public void imprimirClientes(){
        //TODO
    }

    public void imprimirVehiculos() {
        //TODO
    }

    public void getCliente(String nif){
        //TODO
    }

    public void getVehiculo(String matricula){
        //TODO
    }

    public void recibirVehiculo(String matricula){
        //TODO
    }

    public EmpresaAlquierVehiculos(String cif, String nombre, String paginaWeb, int totalClientes, Cliente[] clientes,
                                   int totalVehiculos, Vehiculo[] vehiculos, int totalAlquileres,
                                   AlquilerVehiculo[] alquieresVehiculos) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.totalClientes = totalClientes;
        this.clientes = clientes;
        this.totalVehiculos = totalVehiculos;
        this.vehiculos = vehiculos;
        this.totalAlquileres = totalAlquileres;
        this.alquieresVehiculos = alquieresVehiculos;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public AlquilerVehiculo[] getAlquieresVehiculos() {
        return alquieresVehiculos;
    }

    public void setAlquieresVehiculos(AlquilerVehiculo[] alquieresVehiculos) {
        this.alquieresVehiculos = alquieresVehiculos;
    }
}
