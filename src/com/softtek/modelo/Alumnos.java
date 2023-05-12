package com.softtek.modelo;

public class Alumnos {
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double[] getParciales() {
        return parciales;
    }


    private String nombreCompleto;
    private double[] parciales;

    public Alumnos(String nombreCompleto, int cantidadParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[cantidadParciales];
    }

    public void setParcial(int indice, double valor) {
        this.parciales[indice] = valor;
    }

    public double calcularPromedio() {
        double suma = 0.0;
        for (double parcial : parciales) {
            suma += parcial;
        }
        return suma / parciales.length;
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificaciones del alumno " + nombreCompleto + ":");
        for (int i = 0; i < parciales.length; i++) {
            System.out.println("Parcial " + (i+1) + ": " + parciales[i]);
        }
    }
}
