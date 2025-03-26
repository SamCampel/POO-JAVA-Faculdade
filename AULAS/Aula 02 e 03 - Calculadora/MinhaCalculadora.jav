/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhacalculadora;

/**
 *
 * @author 051968
 */
public class MinhaCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        oPeracoes obj = new oPeracoes();
        
        obj.exibirMenu();
        obj.escolherOpc();
        if(obj.opc>=1 && obj.opc<=4){
            obj.entrarNumeros();
            if(obj.opc==1){
                obj.Somar(obj.n1, obj.n2);
            }
            if(obj.opc==2){
                obj.Subtrair(obj.n1, obj.n2);
            }
            if(obj.opc==3){
                obj.Multi(obj.n1, obj.n2);
            }
            if(obj.opc==4){
                obj.Divisao(obj.n1, obj.n2);
            }
        }
        if(obj.opc<1 || obj.opc>5){
            obj.exibirOpcInval();
        }
        if(obj.opc == 5){
            obj.exibirSair();
        }           
    }
}
