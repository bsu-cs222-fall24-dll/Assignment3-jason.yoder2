package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int i) {
        return i == 42;
    }

    public String countTo(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(i + " ");
        }
        builder.append(count);
        return builder.toString();
     }
}
