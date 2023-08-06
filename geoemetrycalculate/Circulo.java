/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
public class Circulo {
    
    // atributos da classe
    
    private double area,circunferencia;
    
    
    // métodos 
    
    public double area(double raio){
        
        this.area=Math.PI*Math.pow(raio,2);
    
    return this.area;
    }
    
    public double circunferencia(double raio){
        
        this.circunferencia=2*Math.PI*raio;
        
        return this.circunferencia;
    
    }
}
