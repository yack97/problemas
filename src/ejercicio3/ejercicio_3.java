/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.*;
/**
 *
 * @author yadir
 */
public class ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int n, numero;
        System.out.print("Cuantas consultas desea realizar: ");
        n=entrada.nextInt();
        for (int  i=1; i<=n; i++){
            System.out.println("Digite una edad: ");
            numero=entrada.nextInt();
        switch (numero){
            case 1:
                if (numero>=0 || numero <= 6){
                System.out.println("PRE-INFANTIL");
                }
                break;
            case 2:
                if (numero>=7 || numero <= 17){
                System.out.println("INFANTIL");
                }
                break;
            case 3:
                if (numero>=18 || numero <= 25){
                System.out.println("JUVENIL");
                }
                break;
            case 4:
                if (numero>=26 || numero <= 60){
                System.out.println("MAYORES");
                }
                break;
            case 5:
                if (numero>60){
                System.out.println("VETERANOS");
                }
                break;
        }
        }
    }
    
}
