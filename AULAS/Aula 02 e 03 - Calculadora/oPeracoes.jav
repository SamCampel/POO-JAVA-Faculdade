/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhacalculadora;
import java.util.Scanner;
/**
 *
 * @author 051968
 */
public class oPeracoes {
    Scanner entrada =new Scanner(System.in);
    int opc;
    double n1,n2;
    
    public void entrarNumeros(){
        System.out.println("Digite o primeiro número:");
        n1=entrada.nextDouble();
        System.out.println("Digite o segundo número:");
        n2=entrada.nextDouble();
               
    }
    
    public void Somar(double n1, double n2){
        System.out.println(n1 + " + "+ n2+ " = "+(n1+n2));
    }
    public void Subtrair(double n1, double n2){
        System.out.println(n1 + " - "+ n2+ " = "+(n1-n2));
    }
    public void Multi(double n1, double n2){
        System.out.println(n1 + " * "+ n2+ " = "+(n1*n2));
    }
    public void Divisao(double n1, double n2){
        System.out.println(n1 + " / "+ n2+ " = "+(n1/n2));
    }
    
    public void escolherOpc(){
        System.out.println("Digite a opção desejada:");
        opc=entrada.nextInt();
    }
    
    
    public void exibirOpcInval(){
        System.out.println("Opção Inválida");
    }
    
    public void exibirSair(){
        System.out.println("Saindo do Sistema");
    }
    
    
    public void exibirMenu(){
        System.out.println("*******MENU CALCULADORA*****");
        System.out.println("*1 - ADIÇÃO                *");
        System.out.println("*2 - SUBTRAÇÃO             *");
        System.out.println("*3 - MULTIPLICAÇÃO        *");
        System.out.println("*4 - DIVISÃO              *");
        System.out.println("*5 - SAIR                 *");
          
        
    }
    
    
}