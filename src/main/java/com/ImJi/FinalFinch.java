package com.ImJi;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        bird.setTurn("L",40, 60);

        bird.setMove("F", 12, 20);
        bird.setMotors(40, 0);
        bird.pause(2.4);

        bird.setTurn("L", 182, 60);

        bird.setMotors(40, 0);
        bird.pause(2.4);
        bird.setMotors(0,0); 
        bird.pause(0.5);          
        bird.setMove("F", 13, 20);

        bird.stopAll();
        bird.disconnect();

    }
}