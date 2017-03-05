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
    Robot karel = new Robot(bogota, 0, 0, Direction.NORTH,0);
    System.out.println("Cuantas columnas quiere llenar?");
    int a=teclado.nextInt();
    int j[]=new int [a];
     
    
    for (int m = 0; m < a; m++) {
       System.out.println("Cuantos objetos hay en la columna "+(m+1)+" ?");
        j[m]=teclado.nextInt();
        
        } 
    for (int n = 0; n <a; n++) {
        for (int m = 0; m <j[n]; m++) {
        Thing parcel = new Thing(bogota, m,n+1);     
            }  
    }
    for (int n = 0; n <a; n++) {
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        for (int p =0; p <j[n]; p++) {
        karel.pickThing();
        karel.move();
            }
        karel.turnLeft();
        karel.turnLeft();
        for (int q = 0; q <j[n]; q++) {
        karel.move();
            }
        }
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    
    
    for (int n = 0; n <=a; n++) {
        karel.move();
        karel.turnLeft();
        for (int p =0; p <j[n]; p++) {
        karel.putThing();
        karel.move();
            }
        karel.turnLeft();
        karel.turnLeft();
        for (int q = 0; q <j[n]; q++) {
        karel.move();
            }
        karel.turnLeft();
        
        }

        
    }
    }
