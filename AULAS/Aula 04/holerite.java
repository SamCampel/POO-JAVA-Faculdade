/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holerite;

/**
 *
 * @author 00354887
 */
public class Holerite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        calCulos obj = new calCulos();
               
        obj.entrarNome();
        obj.entrarSalarioAtual();
        obj.entrarTaxaAumento();
        obj.entrarTaxaINSS();
        obj.exibirHolerite();
    
    }
    
}