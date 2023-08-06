/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
public class Cilindro {
    
    
    //Atributos da classe cilindro
    
    private double volume,area_base,area_lateral,area_superficial_total,circunferencia;
    
    
    // métodos da classe
    
    
    //método que calcula o volume do cilindro
    public double volume(double raio, double altura){
        
        this.volume=Math.PI*Math.pow(raio, 2)*altura;
    
        
        return this.volume;
    }
    
    //calcula a área da base do cilindro
    public double area_base(double raio){
    
        this.area_base=Math.PI*Math.pow(raio,2);
        
        
        return this.area_base;
    }
    
    //calcula a área lateral do cilindro
    
    public double area_lateral(double raio, double altura){
    
        this.area_lateral=altura*2*Math.PI*raio;
        
        return this.area_lateral;
    }
    
    
    //calcula a área total das superfícies do cilindro
    public double area_superficial_total(double raio, double altura){
    
        this.area_superficial_total= this.area_lateral(raio, altura)+(2*this.area_base(raio));
        
        return this.area_superficial_total;
        
    
    }
    
    //calcula o perímetro da base do cilindro
    public double circunferencia(double raio){
        
        this.circunferencia=2*Math.PI*raio;
        
        return this.circunferencia;
    }
}
