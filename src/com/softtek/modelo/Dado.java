package com.softtek.modelo;
public class Dado {
    public int getNum() {
        return num;
    }

    public void setNum() {
        this.num = num;
    }

    public Dado() {
        this.num = num;
    }

    int num;

        public void lanzardados(){
            num = (int) (Math.random() * 6) + 1;

            if (num== 1){
                System.out.println("El número es 1 \n * ");
            }
            if (num == 2){
                System.out.println("El número es 2 \n * * ");
            } if (num == 3){
                System.out.println("El número es 3 \n * \n * \n * ");

            } if (num == 4){
                System.out.println("El número es 4 \n * * \n * * ");
            } if (num == 5){
                System.out.println("El número es 5 \n * * \n * \n * *");
            }
            if (num == 6){
                System.out.println("El número es 6 \n * * \n * * \n * *");
            }
        }

    }


