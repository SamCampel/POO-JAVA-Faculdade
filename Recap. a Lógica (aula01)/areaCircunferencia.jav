/*
Crie um programa que calcula e exibe a área da circunferência.Sendo que o usuário deve informar o valor do raio e o valor de PI.
Caso o valor do raio seja inferior a 3, o programa deve
informar que se trata de um círculo, caso contrário o
programa deve informar que se trata de uma elípse.

A saber:

Fórmula do cálculo da área da circunferência

area=2PIR

Valor de PI:3,14

Use variáveis do tipo double

*/ 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuapp;
import java.util.Scanner;
/**
 *
 * @author 051968
 */
public class MeuApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada =new Scanner(System.in);
        double pi,raio;
        
        pi=3.14;
        System.out.print("Digite o valor do raio da circunferencia :");
        raio=entrada.nextDouble();
                
        System.out.println("O raio da circunferencia tem: "+raio);
        System.out.printf("A area da circunferencia tem:%.2f",(2*pi*raio));
        
    }
    
}