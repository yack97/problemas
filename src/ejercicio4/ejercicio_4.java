/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.*;
/**
 *
 * @author yadir
 */
public class ejercicio_4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float seg, min,hor, sem, dia;
        System.out.printf("digite el numero de segundos");
        seg=entrada.nextInt();
        
       min=seg/60;
       hor=seg/3600;
       dia=seg/86400;
       sem=seg/518400;
       
       System.out.println("los segundos en minutos= "+min+"en horas= "+hor+"en dias= "+dia+"en semanas= "+sem);
        
    }
    
}
