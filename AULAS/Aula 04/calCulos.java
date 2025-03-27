/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holerite;

import java.util.Scanner;

/**
 *
 * @author 00354887
 */
public class calCulos {

    Scanner entrada = new Scanner(System.in);
    String nome;
    double salario, taxaINSS, taxaAumento, valorAumento, salAumento, salarioTxInss, valorDescINSS, descIR, txIR, vlrDescIR;

    
    public void entrarNome() {
        System.out.println("Digite o nome do funcionário: ");
        nome = entrada.nextLine();
    }

    public void entrarSalarioAtual() {
        System.out.println("Informe o salário atual: ");
        salario = entrada.nextDouble();
    }
    
    public void entrarTaxaINSS() {
        System.out.println("Informe a taxa do INSS : ");
        taxaINSS = entrada.nextDouble();
    }
    
    public void entrarTaxaAumento() {
        System.out.println("Informe a taxa de aumento : ");
        taxaAumento = entrada.nextDouble();
    }
    
    public void exibirHolerite() {
        System.out.println("*******HOLERITE*******");
        System.out.println(" ");
        System.out.println("Holerite do funcionário: " + nome);
        System.out.println("Salário atual: " + salario);
        
        //aumento salario
        System.out.println("Taxas de aumento: " + taxaAumento +"%");
        
        valorAumento = salario * taxaAumento/100;
        System.out.println("Valor do aumento: " + valorAumento);
        
        salAumento = salario * taxaAumento/100 + salario;
        System.out.println("Salário com taxa de aumento: " + salAumento);
        
        //salario Inss
        System.out.println("Taxas do INSS: " + taxaINSS +"%");
        
        valorDescINSS = salAumento * taxaINSS/100 ;
        System.out.println("Valor do deconto do INSS: " + valorDescINSS);
        
        salarioTxInss = salAumento - valorDescINSS;
        System.out.println("Novo salário com taxas do inss: " + salarioTxInss);
        System.out.println(" ");
        System.out.println("***********IMPOSTO DE RENDA***********");
        System.out.println(" ");
    
    double baseIR = salarioTxInss;
        
	if(descIR <=1900){
            txIR=0;
        }
        else if(descIR>1900 && descIR<=3000){
            txIR=15;
        }
        else if(descIR>3000 && descIR<11000){
            txIR=27.5;
        }
        else {
            txIR=35;
        } 
        
        System.out.println("Taxa de IR: " + txIR);
        vlrDescIR =(descIR * txIR/100);
        System.out.println("Valor Desconto IR: " + vlrDescIR);
        descIR = descIR - vlrDescIR;
        System.out.println("Salário Líquido:" + descIR);
    }
}