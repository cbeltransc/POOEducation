/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio5 {
    
     public static void main(String[] args) {
    
    Scanner teclado= new Scanner(System.in);
    City bogota = new City();
    Robot karel = new Robot(bogota, 0, 0, Direction.EAST,0);
    System.out.println("Cuantas columnas quiere llenar?");
    int a=teclado.nextInt();
    int j[]=new int [a];
     
    
    for (int m = 0; m < a; m++) {
       System.out.println("Cuantos objetos hay en la columna "+m+" ?");
        j[m]=teclado.nextInt();
        
        } 
    for (int n = 0; n < a; n++) {
        for (int m = 0; m < j[n]; m++) {
        Thing parcel = new Thing(bogota, m,n);     
            }  
    }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        for (int p = 0; p < j[0]; p++) {
        karel.pickThing();
        karel.move();
        }
        karel.turnLeft();
        karel.turnLeft();
        for (int q = 0; q <j[0]; q++) {
        karel.move();
        }
        for (int b = 1; b < a; b++) {
        for (int m = 0; m < j[b]; m++) {
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        for (int o = 0; o < j[b]; o++) {
        karel.pickThing();
        karel.move();
            }  
        karel.turnLeft();
        karel.turnLeft();
        for (int i = 0; i <j[b]; i++) {
        karel.move();
                }
        
        
        }
        
    
        
        

}

     }
}