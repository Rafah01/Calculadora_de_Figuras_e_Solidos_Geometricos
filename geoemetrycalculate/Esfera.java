/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
public class Esfera {

   //atributos da classe esfera
    
    private double area_superficial,volume;
    
    
    
    //métodos da classe
    
    //calcula o volume da esfera
    
    public double volume(double raio){
        
        this.volume= (4*Math.PI*Math.pow(raio,3)/3);
        
        
        return this.volume;
    }
    
    //calcula a área da superfície da esfera
    public double area_superficial(double raio){
    
        this.area_superficial=4*Math.PI*Math.pow(raio, 2);
        
        return this.area_superficial;
    
    
    }
    
}
