package com.example.matescuadermillorubio;

public class Operacion {
    static int valor1 = 0;
   static int valor2 = 0;
    public boolean crearOperacion(int opcion){

        boolean mayorMenor = true;
       switch (opcion){
           case 0:
               this.valor1  =  valorNivel1();
               this.valor2 = valorNivel1();
               if (valor1 > valor2){
                mayorMenor = true;
               } else {
                   mayorMenor = false;
               }
               break;
           case 1:
                this.valor1 = valorNivel2();
               this.valor2 = valorNivel2();
               if (valor1 > valor2){
                   mayorMenor = true;
               } else {
                   mayorMenor = false;
               }
               break;
           case 2:
               this.valor1= valorNivel3();
               this.valor2 = valorNivel3();
               if (valor1 > valor2){
                   mayorMenor = true;
               } else {
                   mayorMenor = false;
               }
               break;
       }
return mayorMenor;
    }
    public static int valorNivel1(){
        return (int) Math.random()* 10;
    }
    public static int valorNivel2(){
        return (int) Math.random()* 100;
    }
    public static int valorNivel3(){
        return (int) Math.random()* 1000;
    }
    public  int setValor1(){
        return valor1;
    }
    public  int setValor2(){
        return valor2;
    }


}
