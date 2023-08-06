/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.geoemetrycalculate;

/**
 *
 * @author rafah
 */
import java.util.Scanner;




public class GeometryCalculate{
    
    // método responsável pelo triângulo:
    public static void triangulo(){
    
                    Scanner input= new Scanner(System.in); // instanciando o método Scanner para usuá-lo no método triãngulo
                    /* Será solicitado os lados do triângulo e também conferido, se os lados forem incorretos(lados desproporcionais)
                    , será solicitado ao usuário que digite corretamente mais uma vez*/
                    double lado1,lado2,lado3;
                    
                    //instanciando o objeto triÂngulo
                    
                    Triangulo triangulo= new Triangulo();
                    System.out.println("\nA escolha foi um triângulo, Há três tipos de triângulo,a saber: Isósceles, Escaleno e equilátero.\nDigite os lados do triângulo e será lhe dito qual o tipo do triângulo.");
                    
                      while(true){
                        // entrada de dados informado os lados do triÂngulo
                        System.out.print("\nDigite o primeiro lado( em m): ");
                        lado1=input.nextDouble();
                        System.out.print("\nDigite o segundo lado ( em m): ");
                        lado2=input.nextDouble();
                        System.out.print("\nDigite o terceiro lado( em m): ");
                        lado3=input.nextDouble();
                        
                        //se for um triângulo válido, o programa continua
                        if(triangulo.triangulo_valido(lado1, lado2, lado3)){
                            
                            //decidir o tipo de triângulo
                            
                            int tipo= triangulo.tipo_triangulo(lado1, lado2, lado3);
                            
                            switch(tipo){
                                
                                //escaleno é 1
                                case 1:
                                    
                                    System.out.printf("\nOs lados digitados são de um triângulo escaleno.\nSua área é: %.2f m²\nSeu perímetro é: %.2f m.\n",triangulo.area(lado1, lado2, lado3),triangulo.perimetro(lado1, lado2, lado3));
                                 
                                    break;
                                    
                                    
                                //isósceles é 2
                                case 2:
                                    System.out.printf("\nOs lados digitados são de um triângulo isóceles.\nSua área é: %.2f m²\nSeu perímetro é: %.2f m.\n",triangulo.area(lado1, lado2, lado3),triangulo.perimetro(lado1, lado2, lado3));
                                    break;
                                    
                                
                                //equilátero é 3
                                case 3:
                                    
                                    System.out.printf("\nOs lados digitados são de um triângulo equilátero.\nSua área é: %.2f m²\nSeu perímetro é: %.2f m.\n",triangulo.area(lado1, lado2, lado3),triangulo.perimetro(lado1, lado2, lado3));
                                    break;
                                
                            
                                    
                            
                            
                            }
                            
                            break;
                            
                        }
                        else{
                            
                            System.out.println("\nMedidas inválidas, não correspondem aos lados de um triângulo.\nDigite-as novamente.\n");
 
                            
                        }
                      }
    
    
    }
    
    // método responsável pelo retângulo:
    public static void retangulo(){
        
            Scanner input=new Scanner(System.in);// input é um étodo Scanner dentro do método retângulo
            System.out.println("\nDigite 1 para escolher o quadrado.\nDigite 2 para escolher o retângulo.");
            int tipo=input.nextInt();
            
            //Quadrado
            if(tipo==1){
                
                //instaciando o objeto retangulo quadrado
                
                Retangulo quadrado= new Retangulo();
                System.out.println("\nA escolha digitada foi o quadrado.\nDigite o lado do quadrado (em m)\n");
                double lado=input.nextDouble();
                
                System.out.printf("\nA área do quadrado é: %.2f m²\nO perímetro é: %.2f m.",quadrado.area_quadrado(lado),quadrado.perimetro_quadrado(lado));
                
                
            }
            //Retângulo
            else{
                
                //instaciando o objeto retangulo
                
                Retangulo retangulo= new Retangulo();
                
                double base,altura;
                
                System.out.println("\nA escolha digitada foi o retângulo.\nDigite a base  do retângulo (em m).");
                base=input.nextDouble();
                System.out.println("\nDigite a altura do retângulo (em m)\n");
                altura=input.nextDouble();
                
                System.out.printf("\nA área do retângulo é: %.2f m²\nO perímetro é: %.2f m.\n",retangulo.area_retangulo(altura, base),retangulo.perimetro_retangulo(altura, base));
                
                
                
                
            }
            
            
            
    }
    
    // método responsável pelo Círculo:
    public static void circulo(){
        
        Scanner input= new Scanner(System.in);
        
        
        System.out.println("\nA escolha digitada foi o círculo.\nDigite o raio do círculo (em m)");
        double raio=input.nextDouble();
        
        //instanciando o objeto círculo[
        
        Circulo circulo= new Circulo();
        
        System.out.printf("A área do círculo é: %.2f m²\nA circunferência é: %.2f m\n",circulo.area(raio),circulo.circunferencia(raio));
    
    }
    
    // método responsável pelo Trapézio:
    public static void trapezio(){
            
            Scanner input= new Scanner(System.in);
            
            double base_maior,base_menor,altura;
            System.out.println("\nA escolha digitada foi o trapézio.\n");

            //entrada dos das dimensões do trapézio
            System.out.println("\nDigite a base maior(em m).\n");
                 base_maior=input.nextDouble();
            System.out.println("\nDigite a base menor(em m).\n");
                base_menor=input.nextDouble();
            System.out.println("\nDigite a altura(em m).\n");
                altura=input.nextDouble();
            
                
            //instanciando o objeto trapézio
            
            Trapezio trapezio= new Trapezio();
            
            
            System.out.printf("\nA área do trapézio é: %.2f m²\nO perimetro é:%.2f m\n",trapezio.area(base_menor, base_maior, altura),trapezio.perimetro(base_menor, base_maior, altura));
            
            
            
            
    
    }

    // método responsável pelo Cilindro:
    public static void cilindro(){
    
        Scanner input= new Scanner(System.in);
        //instanciando as variáveis

        double raio, altura;

        //Entrada dos dados necessa´rios para  os cálculos de volume e área
        System.out.print("\nOlá, A escolha digitada foi um cilindro\nDigite o raio do cilindro(em m):");
            raio=input.nextDouble();
        System.out.print("\nDigite a altura do cilindro(em m): ");
            altura=input.nextDouble();
            
            
        //instanciando o obejto cilindro
        
        
        Cilindro cilindro=new Cilindro();
        
        
        System.out.printf("\n\nO volume do cilindro é: %.2f m³\nA área da base é: %.2f m²\nA cirfunferência da base é: %.2f m\nA área lateral é: %.2f m²\nA área superficial total é: %.2f m²\n",cilindro.volume(raio, altura),cilindro.area_base(raio),cilindro.circunferencia(raio),cilindro.area_lateral(raio, altura),cilindro.area_superficial_total(raio, altura));
            
            
    }
    
    // método responsável pela Esfera:
    public static void esfera(){

            Scanner input= new Scanner(System.in);

            double raio;

            //entrada dos dados para efetuar os cálculos
             System.out.println("\nA escolha digitada foi uma esfera \nInsira o raio da esfera (em m)");
             raio=input.nextDouble();

             //instanciando o objeto Esfera
             
             
             Esfera esfera= new Esfera();
             
             System.out.printf("\nO volume da esfera é: %.2f m³\nA área superficial da esfera é: %.2f m2\n",esfera.volume(raio),esfera.area_superficial(raio));
    
    }
     
    // método responsável pelo Prisma:
    public static void prisma(){}
    
    // método responsável pela Piramide:
    public static void piramide(){}
    
    // método responsável pelo Cone:
    public static void cone(){}
    // Método de sumário mostrando as opções ao usuário
    public static int Sumario(){
        Scanner input= new Scanner(System.in);
        int decisao;
        //Meno com opções das figuras e sólidos geométricos
        System.out.println("\nEscolha qual figura geométrica plana ou sólidos geométricos  você deseja calcular abaixo:\n\n\n\n\nFiguras Geométricas:\n\n1-Triângulo\n2-Retângulo ou quadrado\n3-Círculo\n4.Trapézio\n\n\nSólidos Geométricos:\n\n\n5.Cilindro\n6.Esfera\n\n\nDigite o número que deseja: ");
        decisao=input.nextInt();
    
        return decisao;
    }
    //Método de repetição do programa
    public static boolean repeticao(){
        Scanner input= new Scanner(System.in);
        boolean repetir;
        
        // Estrutura de decisão para repetir o programa
            char n;
            System.out.println("\nFigura calculada com sucesso!!\nDeseja calcular novamente outra figura? Se sim. digite 's', senão, digite qualquer outra letra.");
            n=input.next().charAt(0);
            
            if(n=='s'){
                repetir=true;
            }
            else{
                repetir= false;
                }
            
        return repetir;
        
        
    }

    //Método principal
    public static void main(String[] args){
        
        
        
        //Interface inicial de apresentação ao usuário
        System.out.println("Olá, Seja bem vindo(a)!\nNossa calculadora calcula áreas, volumes e perímetros de figuras e sólidos geométricos\n");
        
        
        boolean loop= true; //Controlador do loop, podendo interrompê-lo se for igual a false
        //aaacdc
        while(loop){
            
            int choice;
            choice= Sumario(); // A variável choice receberá a decisão do prodimento Sumário
            
            switch(choice){
                
                case 1: // a opção triângulo foi escolhida
                    
                    triangulo(); // acessar a função ou método triÂngulo
                    
                break;
                

                case 2: //Opção retângulo foi escolhida
                    
                    retangulo(); // Chamada ao procedimento Retângulo
                  
                    break;
                    
                case 3: //opção  de círculo
                    circulo(); // chamada ao procedimento circulo
                    break;
                    
                case 4: // opção de trapézio
                    
                    trapezio(); // chamada ao procedimento Trapezio
                    break;
                    
                case 5: //Volume, área da face de um cilindro
                    
                    cilindro(); // chamada ao prodecimento cilindro
                    
                    break;
                    
                case 6: // Volume e área superficial de uma esfera
                    
                    esfera(); // chamada ao prodecimento esfera
                    break;
                  
                default: // caso o usuário insira um opção inválida
                    
                    System.out.println("\nOpção inválida, Por favor, insira uma opção correta.\n");
                    break;
            }
            
            loop=repeticao(); //chamada ao prodimento que decidirá se repetir ou não
            
        }
        
        System.out.println("\nAté mais!\n");
    
    }
    
}
