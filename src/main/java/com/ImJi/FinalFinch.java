package com.ImJi;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();
 
        // Draw a heart
        bird.setTurn("L",40, 60);

        // left side of the heart
        bird.setMove("F", 12, 20);
        bird.setMotors(40, 0);
        bird.pause(2.4);

        bird.setTurn("L", 182, 60);
        // right side of the heart
        bird.setMotors(40, 0);
        bird.pause(2.4);
        bird.setMotors(0,0); 
        bird.pause(0.5);          
        bird.setMove("F", 13, 20);

        // Bird starts break dancingg!!!!!!!
        bird.print("Dance!");
        // setting tail color to purple
        bird.setTail("all", 100, 0, 100);
        bird.playNote(60, 0.5); 
        // fast spins during the dance
        bird.setMotors(100, -100);
        bird.pause(1.5);
        // continues dancing turning right and printing wooo
        bird.setTail("all", 0, 100, 100); 
        bird.playNote(64, 0.5); 
        bird.setTurn("R", 90, 50);
        bird.print("WOOOO");

        bird.setTail("all", 100, 100, 0);
        bird.playNote(67, 0.5); 
        // turns backwards 
        bird.setMove("B", 10, 30);

        bird.setTail("all", 0, 0, 100); 
        bird.playNote(72, 0.5); 
        //turns forward
        bird.setMove("F", 10, 30);

        bird.setTail("all", 100, 0, 0); 
        bird.playNote(76, 0.3); 
        // flash spins for the final show
        bird.setMotors(-80, 80); 
        bird.pause(1.2);

        // stops the bird from moving and disconnects
        bird.stopAll();
        bird.disconnect();
    }
}