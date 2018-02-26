/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author yadir
 */
public class Solicitud {
         Scanner entrada=new Scanner(System.in);
        public int n;
        public int n1;
        
        public void setn(int n){
            this.n=n;
        }
        
        public int getn(){ 
        return this.n; 
        } 

        public void modificar (){
        System.out.print("Cuantas consultas desea realizar: ");
        n=entrada.nextInt();
        }
        // @Override
      //   public String toString(){
         //return n;
    //};
}
