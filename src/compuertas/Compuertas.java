/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compuertas;

import java.util.Scanner;

/**
 *
 * @author Marco Tulio
 */
public class Compuertas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String continuar = "Si";
        int compuerta1;
        int compuerta2;
        int tipocompuerta;
        int compuerta;
        int negacion;
        while(continuar.equalsIgnoreCase("Si")){
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese solo numero 1 o 0: ");
        compuerta1 = ing.nextInt();
        System.out.println("Ingrese solo numero 1 o 0: ");
        compuerta2 = ing.nextInt();
        System.out.println("Ingrese 1 si quiere que sea AND, 2 OR y 3 NOT");
        tipocompuerta = ing.nextInt();
        if(tipocompuerta == 1){
        if(compuerta1 == 0 || compuerta2 == 0){
            compuerta = 0;
            System.out.println("Compuerta logica AND = "+ compuerta);
        }else{
            compuerta = 1; 
            System.out.println("Compuerta logica AND = "+ compuerta);
        }
        }
        if(tipocompuerta == 2){
           if(compuerta1 == 1 || compuerta2 == 1){
           compuerta = 1;
           System.out.println("Compuerta logica OR = "+ compuerta); 
        }else{
             compuerta = 0;
           System.out.println("Compuerta logica OR = "+ compuerta);  
           }
        }
        if(tipocompuerta == 3){
           if(compuerta1 == 1 && compuerta2 == 1){
               compuerta = 0;
               negacion = 0;
               System.out.println("la negacion del primero= "+ compuerta+ "  la negacion del segundo= "+ negacion);
           }else if(compuerta1 == 0 && compuerta2 == 0){
              compuerta = 1;
              negacion = 1;
              System.out.println("la negacion del primero= "+ compuerta+ "  la negacion del segundo= "+ negacion);
           } else if(compuerta1 == 1 && compuerta2 == 0){
              compuerta = 0;
              negacion = 1;
              System.out.println("la negacion del primero= "+ compuerta+ "  la negacion del segundo= "+ negacion);
           }else if(compuerta1 == 0 && compuerta2 == 1){
              compuerta = 1;
              negacion = 0;
              System.out.println("la negacion del primero= "+ compuerta+ "  la negacion del segundo= "+ negacion);
           }  
        }
           /*else if(compuerta1 == 1 || compuerta2 == 1 && tipocompuerta == 3){
              compuerta = 0;
              negacion = 0;
              System.out.println("la negacion del primero= "+ compuerta+ "  la negacion del segundo= "+ negacion);
        }else if (compuerta1 == 0 || compuerta2 == 0 && tipocompuerta == 3){
               compuerta = 1;
              negacion = 1;
              System.out.println("la negacion del primero= "+ compuerta+ "  la negacion del segundo= "+ negacion);
           }*/
        Scanner ingcon = new Scanner(System.in);
        System.out.println("Desea continuar Si/No");
        continuar = ingcon.nextLine();
        }
        }
    
}
