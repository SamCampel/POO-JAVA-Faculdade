// Calculadora com Do While em Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opc;
        int soma, subtracao, cont, multiplicacao;
        opc = "x";
        soma = 0;
        subtracao = 0;
        multiplicacao = 1;
        
        System.out.print("Digite a opção: + para somar, - para subtrair, * para multiplicar: ");
        opc = entrada.nextLine(); // Capturar a linha inteira

        // Escolha da operação e execução do loop correspondente
        switch (opc) {
            case "+":
                System.out.println("******Operação Escolhida: Adição*******");
                do {
                    System.out.println("Digite o número ou = para ver o resultado: ");
                    opc = entrada.nextLine();
                    if (opc.equals("=")) {
                        System.out.println("O resultado da soma é: " + soma);
                    } else {
                        int num1 = Integer.parseInt(opc);
                        soma += num1;
                        System.out.print(" + \n");
                    }
                } while (!opc.equals("="));
                break;
            
            case "-":
                System.out.println("******Operação Escolhida: Subtração*******");
                do {
                    System.out.println("Digite o número ou = para ver o resultado: ");
                    opc = entrada.nextLine();
                    if (opc.equals("=")) {
                        System.out.println("O resultado da subtração é: " + subtracao);
                    } else {
                        int num2 = Integer.parseInt(opc);
                        if (cont == 1) {
                            subtracao = num2;
                            cont++;
                        } else {
                            subtracao -= num2;
                        }
                        System.out.print(" - \n");
                    }
                } while (!opc.equals("="));
                break;
            
            case "*":
                System.out.println("******Operação Escolhida: Multiplicação*******");
                do {
                    System.out.println("Digite o número ou = para ver o resultado: ");
                    opc = entrada.nextLine();
                    if (opc.equals("=")) {
                        System.out.println("O resultado da multiplicação é: " + multiplicacao);
                    } else {
                        int num3 = Integer.parseInt(opc);
                        multiplicacao *= num3;
                        System.out.print(" x \n");
                    }
                } while (!opc.equals("="));
                break;
            
            default:
                System.out.println("Opção inválida.");
        }
        
        entrada.close(); // Fechar o Scanner ao finalizar o programa
    }
}

