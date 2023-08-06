/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
public class Trapezio {
    
    
    //atributos da classe trapézio
    
    private double area,perimetro;
    
    
    
    //métodos 
    
    //calcula área do trapézio
    
    //calcula área do trapézio
    public double area(double base_menor,double base_maior, double altura){
    
        this.area= (base_maior+base_menor)*altura/2.0;
        
        return this.area;
    
    
    }
    
    //calcula o perímetro do trapézio
    public double perimetro(double base_menor,double base_maior, double altura){
        
        this.perimetro= (2*base_menor)+(2*(base_maior-base_menor)/2+(2*Math.sqrt((Math.pow(altura,2)+Math.pow((base_maior-base_menor)/2, 2)))));
        
        return this.perimetro;
    
    
    }
}
