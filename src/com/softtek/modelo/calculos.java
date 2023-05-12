package com.softtek.modelo;

public class calculos {
    public calculos(double radio, double base, double altura) {
        this.radio = radio;
        this.base = base;
        this.altura = altura;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double radio;
    private double base;
    private double altura;


        public void calcularAreaCirculo() {
            System.out.println( "area circulo" + Math.PI * this.radio * this.radio);
        }

        public void calcularAreaRectangulo() {
            System.out.println( "area rectangulo" + this.base * this.altura);
        }
    }

