package com.marsrover;

public class MarsRover {
    int lowerLimitX = 0;
    int lowerLimitY = 0;
    int upperLimitX = 5;
    int upperLimitY = 5;
    private int initialPositionX;
    private int initialPositionY;
    private char initialLocation;
    char instructions;
    char finalLocation;

    public MarsRover(int initialPositionX, int initialPositionY, char initialLocation) {

        this.initialPositionX = initialPositionX;
        this.initialPositionY = initialPositionY;
        this.initialLocation = initialLocation;
    }

    public String newPosition(char instructions) {
        if (instructions == 'L'){
            finalLocation = rotateLeft();
            return initialPositionX + " " + initialPositionY + " " + finalLocation;
        }
        return null;
    }

    public char rotateLeft() {
        if (initialLocation == 'N') {
            finalLocation = 'W';
            return finalLocation;
        }
        else if(initialLocation == 'W') {
            finalLocation = 'S';
            return finalLocation;
        }
        else if(initialLocation == 'S') {
            finalLocation = 'E';
            return finalLocation;
        }
        else if(initialLocation == 'E') {
            finalLocation = 'N';
            return finalLocation;
        }
        return 0;
    }
}


