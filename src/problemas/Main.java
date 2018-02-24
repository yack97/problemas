/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;
import ejercicio2.ejercicio_2;
/**
 *
 * @author yadir
 */
public class Main {
    private void ejercicio1(){}
    private void ejercicio2(){}
    private void ejercicio3(){}
    private void ejercicio4(){}
    private void ejercicio5(){}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int op;
        Main objMain=new Main(); 
        do{
            System.out.print("Seleccione un ejercicio: \n"
            +"1) ejercicio1\n"
            +"2) ejercicio2\n"
            +"3) ejerciocio3\n"
            +"4) ejerciocio4\n"
            +"5) ejerciocio5\n"
            +"6) SALIR \n");
            op=entrada.nextInt();
            switch(op){
                case 1:
                    objMain.ejercicio1();
                    break;
                case 2:
                    objMain.ejercicio2();
                    break;
                case 3:
                    objMain.ejercicio3();
                    break;
                case 4:
                    objMain.ejercicio4();
                    break;
                case 5:
                    objMain.ejercicio5();
                    break;
            }
        }while (op != 6);
    }
    
}
