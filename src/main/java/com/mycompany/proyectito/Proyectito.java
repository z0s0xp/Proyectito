/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectito;

import java.util.Scanner;

/**
 *
 * @author z0s0xp
 */
public class Proyectito {

    public static void main(String[] args) {
  String nombre;
  int id;
  double precio;
  boolean envioGratuito=true;
        
  
        Scanner consola=new Scanner(System.in);
        
        
    System.out.println("Proporciona el nombre:");    
    nombre=consola.nextLine();
    System.out.println("Proporciona el id:"); 
    id=consola.nextInt();
    System.out.println("Proporciona el precio:"); 
    precio=consola.nextDouble();
    System.out.println("Proporciona el envio gratuito:");
    envioGratuito=consola.nextBoolean();
    
        System.out.println(nombre+ " #" +id);
        System.out.println("Precio $"+precio);
        System.out.println("Envio Gratuito"+envioGratuito);
        

    }
}
