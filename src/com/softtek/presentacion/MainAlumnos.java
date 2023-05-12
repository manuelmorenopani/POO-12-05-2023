package com.softtek.presentacion;

import com.softtek.modelo.Alumnos;

public class MainAlumnos {
    public static void main(String[] args) {
        Alumnos n = new Alumnos("Manuel", 2);
        n.setParcial(0, 6);
        n.setParcial(1, 7);
        System.out.println("la media es = "+ n.calcularPromedio());
        n.mostrarCalificaciones();
    }
}
