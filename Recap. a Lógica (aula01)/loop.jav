import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome;
        int cont;
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome=entrada.nextLine();
        
        cont=1;
        while(cont<=5){
            System.out.println("Nome: "+nome +" - Posicao do contador: " +cont);


            cont++;
        }
    }
}