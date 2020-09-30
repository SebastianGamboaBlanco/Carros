package com.sebastian.carros;

public class Carros {
    private String marca,placa, modelo;

    public Carros(String placa, String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "carros{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
