/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
public class Retangulo {
    
    
    //atributos da classe
    
    private double area, perimetro;
    
    
    // métodos da classe
    
    
    //calcula a área do retângulo
    public double area_retangulo(double altura,double base){
        
        this.area=altura*base;
        
        return this.area;
          
    }
    
    //calcula o perímetro do retângulo
    public double perimetro_retangulo(double altura, double base){
        
        this.perimetro=2*(altura+base);
        
        return this.perimetro;
    }
    
    //calcula a área do quadrado
    public double area_quadrado(double lado){
        
        this.area=Math.pow(lado,2);
        
        return this.area;
    }
    
    //calcula o perímetro do quadrado
    public double perimetro_quadrado(double lado){
    
        this.perimetro=4*lado;
        
        return this.perimetro;
    
    }
}
