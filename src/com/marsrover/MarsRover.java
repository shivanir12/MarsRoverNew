package com.marsrover;

public class MarsRover {
    int lowerLimitX = 0;
    int lowerLimitY = 0;
    int upperLimitX = 5;
    int upperLimitY = 5;
    private int positionX;
    private int positionY;
    private char initialLocation;
    char finalLocation;

    public MarsRover(int initialPositionX, int initialPositionY, char initialLocation) {

        this.positionX = initialPositionX;
        this.positionY = initialPositionY;
        this.initialLocation = initialLocation;
    }

    public String newPosition(char instruction) {
        if (instruction == 'L') {
            finalLocation = rotateLeft();
            return positionX + " " + positionY + " " + finalLocation;
        } else if (instruction == 'R') {
            finalLocation = rotateRight();
            return positionX + " " + positionY + " " + finalLocation;
        } else if (instruction == 'M') {
            return moveToPosition();
        }
        return null;
    }

    private String moveToPosition() {
        if (positionY < upperLimitY && initialLocation == 'N') {
            positionY++;
            return positionX + " " + positionY + " " + initialLocation;
        }
        return null;
    }

    private char rotateRight() {
        if (initialLocation == 'N') {
            finalLocation = 'E';
            return finalLocation;
        } else if (initialLocation == 'E') {
            finalLocation = 'S';
            return finalLocation;
        } else if (initialLocation == 'S') {
            finalLocation = 'W';
            return finalLocation;
        } else if (initialLocation == 'W') {
            finalLocation = 'N';
            return finalLocation;
        }
        return 0;
    }

    public char rotateLeft() {
        if (initialLocation == 'N') {
            finalLocation = 'W';
            return finalLocation;
        } else if (initialLocation == 'W') {
            finalLocation = 'S';
            return finalLocation;
        } else if (initialLocation == 'S') {
            finalLocation = 'E';
            return finalLocation;
        } else if (initialLocation == 'E') {
            finalLocation = 'N';
            return finalLocation;
        }
        return 0;
    }
}


