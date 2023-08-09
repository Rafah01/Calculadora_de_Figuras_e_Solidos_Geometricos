/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
public class Losango {
    
    
    //atributos do losango
    
    private double area,diagonal_maior,diagonal_menor,perimetro;
    
    //métodos do losango
    
    //calculando o perimetro
    
    public double perimetro(double lado){
    
        this.perimetro=4*lado;
        
        return  this.perimetro;
    
    }
    //cslculando a diagonal maior
    //o ângulo alfa do losango é o ângulo que é cortado pela diagonal maior
    public double diagonal_maior(double lado,double angulo_alfa){
        
        this.diagonal_maior=Math.sin(Math.toRadians(angulo_alfa/2))*2*lado;
        
        return this.diagonal_maior;
        
    
    }
    
    //calculando a diagonal menor
    //o ângulo beta do losango é o ângulo que é cortado pela diagonal menor
    public double diagonal_menor(double lado , double angulo_beta){
        
         this.diagonal_menor=Math.sin(Math.toRadians(angulo_beta/2))*2*lado;
        
        return this.diagonal_menor;
    
    }
    
    //calculando a área do losango
    // a área do losango é a metade do produto entre suas duas diagonais, a maior e a menor.
    
    public double area(double lado,double angulo_alfa,double angulo_beta){
        
    
        this.area=(this.diagonal_maior(lado,angulo_alfa))*(this.diagonal_menor(lado,angulo_beta))/2;
    
        return this.area;
    }
}
