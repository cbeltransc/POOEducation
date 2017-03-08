/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author USUARIO
 */
public class Coordendas {
    
    private City ciudad;
    private Robot robot;
    private Thing thing1;
    private Thing thing2;
    private Thing thing3;

    public Coordendas() {
        this.ciudad = new City();
        this.robot= new Robot(ciudad,7,6,Direction.NORTH);
        this.thing1=new Thing(ciudad,6,3);
        this.thing2=new Thing(ciudad,4,4);
        this.thing3=new Thing(ciudad,3,6);
        
        Wall[] muro = new Wall[51];
        muro[1] = new Wall(ciudad , 4, 2, Direction.EAST);
        muro[2] = new Wall(ciudad, 2, 2, Direction.WEST);
        muro[3] = new Wall(ciudad, 3, 2, Direction.WEST);
        muro[4] = new Wall(ciudad, 2, 5, Direction.EAST);
        muro[5] = new Wall(ciudad, 2, 3, Direction.NORTH);
        muro[6] = new Wall(ciudad, 2, 4, Direction.NORTH);
        muro[7] = new Wall(ciudad, 2, 2, Direction.NORTH);
        muro[8] = new Wall(ciudad, 3, 6, Direction.NORTH);
        muro[9] = new Wall(ciudad, 2, 5, Direction.NORTH);
        muro[10] = new Wall(ciudad, 4, 1, Direction.WEST);
        muro[11] = new Wall(ciudad , 5, 0, Direction.NORTH);
        muro[12] = new Wall(ciudad, 5, 0, Direction.WEST);
        muro[13] = new Wall(ciudad, 6, 0, Direction.WEST);
        muro[14] = new Wall(ciudad, 6, 0, Direction.SOUTH);
        muro[15] = new Wall(ciudad, 7, 1, Direction.WEST);
        muro[16] = new Wall(ciudad, 7, 1, Direction.SOUTH);
        muro[17] = new Wall(ciudad, 7, 2, Direction.SOUTH);
        muro[18] = new Wall(ciudad, 7, 2, Direction.EAST);
        muro[19] = new Wall(ciudad, 6, 2, Direction.EAST);
        muro[20] = new Wall(ciudad, 5, 3, Direction.SOUTH);
        muro[21] = new Wall(ciudad, 4, 1, Direction.NORTH);
        muro[22] = new Wall(ciudad, 5, 3, Direction.EAST);
        muro[23] = new Wall(ciudad, 4, 3, Direction.EAST);
        muro[24] = new Wall(ciudad, 4, 4, Direction.SOUTH);
        muro[25] = new Wall(ciudad, 7, 3, Direction.EAST);
        muro[26] = new Wall(ciudad, 6, 4, Direction.SOUTH);
        muro[27] = new Wall(ciudad, 6, 4, Direction.EAST);
        muro[28] = new Wall(ciudad, 5, 5, Direction.SOUTH);
        muro[29] = new Wall(ciudad, 5, 6, Direction.SOUTH);
        muro[30] = new Wall(ciudad, 6, 6, Direction.WEST);
        muro[31] = new Wall(ciudad, 7, 6, Direction.WEST);
        muro[32] = new Wall(ciudad, 7, 6, Direction.SOUTH);
        muro[33] = new Wall(ciudad, 7, 6, Direction.EAST);
        muro[34] = new Wall(ciudad, 6, 7, Direction.SOUTH);
        muro[35] = new Wall(ciudad, 6, 7, Direction.EAST);
        muro[36] = new Wall(ciudad, 5, 7, Direction.EAST);
        muro[37] = new Wall(ciudad, 4, 7, Direction.EAST);
        muro[38] = new Wall(ciudad, 3, 6, Direction.EAST);
        muro[39] = new Wall(ciudad, 4, 7, Direction.NORTH);
        muro[40] = new Wall(ciudad, 6, 1, Direction.EAST);
        muro[41] = new Wall(ciudad, 5, 1, Direction.EAST);
        muro[42] = new Wall(ciudad, 5, 1, Direction.SOUTH);
        muro[43] = new Wall(ciudad, 4, 2, Direction.SOUTH);
        muro[44] = new Wall(ciudad, 3, 2, Direction.EAST);
        muro[45] = new Wall(ciudad, 4, 3, Direction.EAST);
        muro[46] = new Wall(ciudad, 2, 3, Direction.SOUTH);
        muro[47] = new Wall(ciudad, 2, 4, Direction.SOUTH);
        muro[48] = new Wall(ciudad, 3, 5, Direction.WEST);
        muro[49] = new Wall(ciudad, 3, 5, Direction.SOUTH);
        muro[50] = new Wall(ciudad, 4, 6, Direction.WEST);
        muro[51] = new Wall(ciudad, 4, 6, Direction.SOUTH);
        
        } 

    
    
    public void girarderecha(){
        this.robot.turnLeft();
        this.robot.turnLeft();
        this.robot.turnLeft();
        this.robot.move();
    }
    public void girarizquierda(){
        this.robot.turnLeft();
        this.robot.move();
    }
    
    public void volver(){
        this.robot.turnLeft();
        this.robot.turnLeft();
        this.robot.move();
    }
    
    public void moverse (int i){
        for (int j = 0; j < i; j++) {
            this.robot.move();
        }
    }
    
    public void pintar(){
        this.robot.move();
        this.girarderecha();
        this.robot.turnLeft();
        this.moverse(2);
        this.girarizquierda();
        this.girarderecha();
        this.robot.canPickThing();
        this.volver();
        this.girarizquierda();
        this.girarderecha();
        this.girarderecha();
        this.robot.move();
        this.girarderecha();
        this.girarizquierda();
        this.robot.canPickThing();
        this.volver();
        this.girarderecha();
        this.girarderecha();
        this.girarizquierda();
        this.girarderecha();
        this.robot.canPickThing();
        this.girarizquierda();
           }
}

    
    
      
    

    




    
    

