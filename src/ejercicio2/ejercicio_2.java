/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.*;
/**
 *
 * @author yadir
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner entrada=new Scanner(System.in);
        int n, numero;
        System.out.print("Cuantas consultas desea realizar: ");
        n=entrada.nextInt();
        for (int  i=1; i<=n; i++){
            System.out.println("Digite un numero: ");
            numero=entrada.nextInt();
        switch (numero){
            case 1:
                System.out.println("INVIERNO");
                break;
            case 2:
                System.out.println("INVIERNO");
                break;
            case 3:
                System.out.println("INVIERNO");
                break;
            case 4:
                System.out.println("VERANO");
                break;
            case 5:
                System.out.println("VERANO");
                break;
            case 6:
                System.out.println("VERANO");
                break;
            case 7:
                System.out.println("OTOÑO");
                break;
            case 8:
                System.out.println("OTOÑO");
                break;
            case 9:
                System.out.println("OTOÑO");
                break;
            case 10:
                System.out.println("PRIMAVERA");
                break;
            case 11:
                System.out.println("PRIMAVERA");
                break;
            case 12:
                System.out.println("PRIMAVERA");
                break;
        }
        }
    }
    
}
