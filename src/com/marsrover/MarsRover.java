package com.marsrover;

public class MarsRover {
    int lowerLimitX = 0;
    int lowerLimitY = 0;
    int upperLimitX = 5;
    int upperLimitY = 5;
    private int initialPositionX;
    private int initialPositionY;
    private char initialLocation;

    public MarsRover(int initialPositionX, int initialPositionY, char initialLocation) {

        this.initialPositionX = initialPositionX;
        this.initialPositionY = initialPositionY;
        this.initialLocation = initialLocation;
    }

    public String newPosition() {
        return "0 0 N";
    }
}
