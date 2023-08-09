/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
public class Pentagono {
    
    
    //atributos da classe pentágono
    
    private double area,perimetro,apotema;
    
    
    //métodos do pentágono
    
    
    //calculo do perimetro do pentagono
    
    public double perimetro(double lado){
        
        this.perimetro=5*lado;
        
        return this.perimetro;
    
    
    }
    
    //cálculo do apótema do pentágono
    
    
    public double apotema(double lado){
        
        this.apotema=(lado)/2*Math.tan(Math.toRadians(36));
        
        return  this.apotema;
        
        
    }
    
    //cálculo da área do pentágono
    
    
    public double area(double lado){
        
        //a área de um pentágono é igual ao produto de seu apótema pelo seu perímetro
        this.area=(this.perimetro(lado))*(this.apotema(lado));
        
        return this.area;
    }
}
