package com.softtek.presentacion;
import com.softtek.modelo.campos;
public class Main {
    public static void main(String[] args) {
        campos cam = new campos();
        System.out.println(cam.muestra());
        cam.incrementa();
        cam.incrementa();
        cam.incrementa();
        System.out.println(cam.muestra());
    }
}
