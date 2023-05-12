package com.softtek.presentacion;

import com.softtek.modelo.Dado;

import java.util.Scanner;

public class MainDado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dado dado = new Dado();

        String respuesta;
        do {
            dado.lanzardados();
            System.out.print("¿Quieres lanzar el dado de nuevo? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        scanner.close();
        //do {
         //   System.out.println("¿Quieres lanzar el dado de nuevo? (s/n)");
          //  continuar = teclado.next();

           // if (continuar.equals("s")) {
               // dados.lanzardados();
           // }
      //  } while (continuar.equals("s"));
      //  teclado.close();
   // }
    }
}

