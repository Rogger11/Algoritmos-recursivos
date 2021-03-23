package com.mycompany.algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos {
    /*
    Elaborado por:
    - Juan Diego López Botero
    - Hamilton Andrés Echeverri Guzmán
    */
    private String recursivo (int a) {
        String orden = "";

        for(int i = 0; i<a; i++){
            orden += Fibonacci(i) + ", " ;
        }
        return orden;
    }
     
    private static int Fibonacci (int Numero){
        if( Numero==1|| Numero == 0)
            return Numero;
        else
            return Fibonacci(Numero-1) + Fibonacci(Numero-2);
    }
    
    private String iterativo(int a) {
        long am1 = 1; 
        long am2 = 0;
        long am3 = 0;
        String respuesta = "";
        
        for(long i = 1; i <= a; i++){
            respuesta += am2 + ", ";
            am3 = am2;
            am2 = am1;
            am1 = am1 + am3;
        }
        return respuesta;
    }
    
    private int recursivo2(int a) {
        int respuesta;
        if(a == 1){
            return 1;
        }else{
            respuesta = a * recursivo2(a-1);
        }
        return respuesta;
    }
    
    private int factorial(int numero){
        int fact = 1;
        while ( numero!=0) {
            fact=fact*numero;
            numero--;
        }
        return fact;
    }
    
    private int f1(int n){
        int respuesta;
        if (n == 0 || n == 1){
            respuesta = 1;
        }else{
            respuesta = (3 * f1(n - 2) + 2 * f1(n - 1));
        }
        return respuesta;
    }
    
    private int f2(int n){
        if(n == 0||n ==1){
            return 1;
        }else if (n % 2 == 0){
            return 2 + f2(n - 1);
        }else{
            return 3 + f2(n - 2);
        }
    }
    
    public void respuesta1(){
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el número de elementos de la serie"));
        String it = iterativo(op);
        String re = recursivo(op);
        JOptionPane.showMessageDialog(null, "Iterativo: "+it+"\nRecursivo: "+re);
    }
    
    public void respuesta2(){
        int a = 9;
        int resultado = recursivo2(a);
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public void respuesta3(){
        int numero = 10;
        String respuesta = "";
        if (numero == 0 || numero == 1){
            respuesta += 1;
        }else{
            respuesta += numero*factorial(numero--);
        }
        JOptionPane.showMessageDialog(null, "Resultado: "+respuesta+"\nEl resultado es incorrecto porque el -- está modificando el número.");
    }
    
    public void respuesta4(){
        JOptionPane.showMessageDialog(null, "El resultado es: "+(f1(5))+"\nValor 1 = 5\nValor 2 = 13\nValor 3 = 5\nValor 4 = 5\nValor 5 = 13\nValor 6 = 41\nValor 7 = 121");
    }
    
    public void respuesta5(){
        JOptionPane.showMessageDialog(null, "El resultado es: "+(f2(8))+"\nValor 1 = 3\nValor 2 = 3\nValor 3 = 5\nValor 4 = 7\nValor 5 = 7\nValor 6 = 9\nValor 7 = 11\nValor 8 = 11\nValor 9 = 13\nValor 10 = 15\nValor 11 = 15");
    }
}
/*
Elaborado por:
- Juan Diego López Botero
- Hamilton Andrés Echeverri Guzmán
*/