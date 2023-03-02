package com.mycompany.ejercicio2;
public class Ejercicio2 {//E12

    public static void main(String[] args) {
        double net,bru,imp;
        bru=48*5000;
        imp=bru*0.125;
        net=bru-imp;

            System.out.println("El salario bruto es:" + bru);
            System.out.println("La retención en la fuente es:" + imp);
            System.out.println("El salario neto es:" + net);
    }
}
