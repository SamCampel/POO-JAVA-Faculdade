/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author 00354887
 */
public class NewClassTriAngulo {

    Scanner entrada = new Scanner(System.in);
    int lado1, lado2, lado3;

    public void entrarLados() {
        System.out.println("Digite o comprimento do 1° lado do triângulo: ");
        lado1 = entrada.nextInt();

        System.out.println("Digite o comprimento do 2° lado do triângulo: ");
        lado2 = entrada.nextInt();

        System.out.println("Digite o comprimento do 3° lado do triângulo: ");
        lado3 = entrada.nextInt();
    }
   
    public void validarLado() {
        System.out.println("Informe apenas números inteiros. Sistema encerrado");
    }
   
    public void exibirDadosTriangulo() {
        System.out.println("*******DADOS DO TRÂNGULO******");
        System.out.println("");
        System.out.println("Comprimento do 1º lado = " + lado1);
        System.out.println("Comprimento do 2º lado = " + lado2);
        System.out.println("Comprimento do 3º lado = " + lado3);
        System.out.println("");
        System.out.println("Tipo do triângulo: ");
    }
   
    public void validarTipo() {
        if(lado1 == lado2 && lado1 == lado3 ){
            System.out.println("É um triângulo Equilátero.");
        }
        else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1 ){
            System.out.println("É um triângulo Isósceles.");
        }
        else {
            System.out.println("É um triângulo Escaleno.");
        }
    }  
}