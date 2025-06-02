package com.ImJi;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        // Print a message on the micro:bit
        myFinch.print("Dance!");

        // Play an intro note
        myFinch.playNote(60, 0.5);

    }
}
