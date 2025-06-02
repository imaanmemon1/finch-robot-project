package com.ImJi;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        myFinch.print("Dance!");

        // Play an intro note
        myFinch.playNote(60, 0.5);

    }
}
