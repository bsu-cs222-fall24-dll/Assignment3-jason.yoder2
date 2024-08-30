package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int guess) {
        return guess == 42;
    }

    public String countTo(int count) {
        StringBuilder countBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            countBuilder.append(i + " ");
        }
        countBuilder.append(count);
        return countBuilder.toString();
     }
}
