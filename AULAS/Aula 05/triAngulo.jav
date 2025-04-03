/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author 00354887
 */
public class TriAngulo {

    /**
     * @param args the command line argumenats
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClassTriAngulo obj = new NewClassTriAngulo();
       
        obj.entrarLados();
        if(obj.lado1<=0 || obj.lado2 <=0 || obj.lado3 <= 0){
            obj.validarLado();          
        }else {
            obj.exibirDadosTriangulo();
            obj.validarTipo();
        }
       
    }
   
}