package com.softtek.modelo;

public class tabla_multiplicar {
    int tabla;
    public tabla_multiplicar(int tabla) {
        this.tabla = tabla;
    }
    public int getTabla() {
        return tabla;
    }

    public void setTabla(int tabla) {
        this.tabla = tabla;
    }

    public void tablademultiplicar(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.tabla + " x " + i + " = " + (this.tabla * i));


        }

}
