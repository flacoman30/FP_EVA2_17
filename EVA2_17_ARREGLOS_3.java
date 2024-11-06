/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos_3;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_17_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int canti;
        int califas[];
        String nombre[];
        Scanner captu = new Scanner(System.in);
        System.out.println("cantidad de calificaciones a capturar");
        canti = captu.nextInt();
        califas = new int [canti];
        nombre= new String [canti];
        for (int i = 0; i< califas.length;i++){
           System.out.println("nombre del estudiantes#"+ i);
           nombre[i] = captu.nextLine();
           captu.nextLine();
    }for (int i = 0; i< califas.length;i++){
           System.out.println("calificaciones del estudiantes #"+ i);
           califas[i]=captu.nextInt();
           captu.nextLine();
    }
        for(int i = 0; i<califas.length;i++){
            System.out.print(nombre[i]+":"+califas[i]+"-");
        }
           
    
    }
    
}
