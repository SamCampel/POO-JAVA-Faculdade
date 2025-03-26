import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int cont,multiplicador,res;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Qual taboada você quer? ");
        multiplicador=entrada.nextInt();

        System.out.println("****TABOADA DO "+multiplicador+"****");
       
        cont=0;

        while(cont<11){
        
            res=multiplicador*cont;
            System.out.println(" "+multiplicador+ " x " +cont + " = " +res);

            cont++;
        }
    }
}