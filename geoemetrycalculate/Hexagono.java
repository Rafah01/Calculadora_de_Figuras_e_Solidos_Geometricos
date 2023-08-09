/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
public class Hexagono {
    
    //atributos
    
    private double area,perimetro,apotema;
    
    
    //métodos do hexágono regular
    
    //calcula a área do hexágono regular
    
    public double area(double lado){
        
        //instanciando o objeto triângulo, pois um hexágono regular tem em sua área a soma das áreas de 6 triÂngulos equiláteros
        
        Triangulo subarea= new Triangulo();
        
        this.area= 6*subarea.area(lado, lado, lado);
        
        return this.area;
    
    }
    
    //calculando o perímetro de um hexágono regular
    
    public double perimetro(double lado){
    
        this.perimetro=6*lado;
        
        return this.perimetro;
    
    }
    
    //calculando apótema do hexágono
    
    public double apotema(double lado){
    
        this.apotema=lado*Math.sqrt(3)/2;
        
        return this.apotema;
    
    }
    
    
    
}
