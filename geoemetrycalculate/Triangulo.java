/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
public class Triangulo {
    
    //atributos
    
    
    private double area,perimetro;
    
    
    

    //métodos
    
    // método que certifica se o triângulo é válido
    public boolean triangulo_valido(double lado1,double lado2, double lado3){

        // condição de existência de um triângulo,se os valores não obdecerem às regras, eles estão incorretos. 
        if(lado1< lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2){
            
            return true;
            
        }
        else{
        
            return false;
        }
    }
    
    //decide se o triângulo é escaleno,retornando 1, isósceles, retornando 2 ou equilátero, retornando 3
    
    public int tipo_triangulo(double lado1,double lado2, double lado3){
        
        //variável que retornará o tipo de triangulo
        int tipo;
        
        // triângulo isósceles
        if((lado1==lado2 && lado1!=lado3) || (lado2==lado3 && lado2!=lado1) || (lado1==lado3 && lado1!=lado2) ){
            
            tipo=2;
        
        }
        //triângulo equilátero
        else if(lado1==lado2 && lado2==lado3){
        
            tipo=3;
        }
        
        //triangulo escaleno
        else{
        
            tipo=1;
        }
    
    
        return tipo;
    }
    
    // calcula área do triângulo
    public double area(double lado1,double lado2, double lado3){
        
        //será utilizada a fórmula de heron, para calcular a área em função dos lados do triângulo
        double semi_perimetro;
        
        semi_perimetro=(lado1+lado2+lado3)/2.0;
        
        this.area=Math.sqrt(( semi_perimetro*( semi_perimetro-lado1)*( semi_perimetro-lado2)*( semi_perimetro-lado3)));
                
        return this.area;
    }
    
    //calcula o perimetro do triângulo
    
    public double perimetro(double lado1,double lado2, double lado3){
        
        this.perimetro=lado1+lado2+lado3;
    
        return this.perimetro;
    }
    
}
