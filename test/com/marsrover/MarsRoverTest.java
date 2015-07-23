package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void newPositionOfTheRoverShouldBeZeroZeroWestWhenInitialPositionIsZeroZeroNorthWithInstructionLeft() {
        MarsRover rover = new MarsRover(0, 0, 'N');

        char instruction = 'L';

        assertEquals("0 0 W", rover.newPosition(instruction));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoWestWhenInitialPositionIsOneTwoNorthWithInstructionLeft() {
        MarsRover rover = new MarsRover(1, 2, 'N');

        char instruction = 'L';

        assertEquals("1 2 W", rover.newPosition(instruction));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoSouthWhenInitialPositionIsOneTwoWestWithInstructionLeft() {
        MarsRover rover = new MarsRover(1, 2, 'W');

        char instruction = 'L';

        assertEquals("1 2 S", rover.newPosition(instruction));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoSouthWhenInitialPositionIsOneTwoEastWithInstructionLeft() {
        MarsRover rover = new MarsRover(1, 2, 'S');

        char instruction = 'L';

        assertEquals("1 2 E", rover.newPosition(instruction));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoNorthWhenInitialPositionIsOneTwoEastWithInstructionLeft() {
        MarsRover rover = new MarsRover(1, 2, 'E');

        char instruction = 'L';

        assertEquals("1 2 N", rover.newPosition(instruction));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoEastWhenInitialPositionIsOneTwoNorthWithInstructionRight() {
        MarsRover rover = new MarsRover(1, 2, 'N');

        char instruction = 'R';

        assertEquals("1 2 E", rover.newPosition(instruction));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoSouthWhenInitialPositionIsOneTwoEastWithInstructionRight() {
        MarsRover rover = new MarsRover(1, 2, 'E');

        char instruction = 'R';

        assertEquals("1 2 S", rover.newPosition(instruction));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoWestWhenInitialPositionIsOneTwoSouthWithInstructionRight() {
        MarsRover rover = new MarsRover(1, 2, 'S');

        char instruction = 'R';

        assertEquals("1 2 W", rover.newPosition(instruction));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoNorthWhenInitialPositionIsOneTwoWestWithInstructionRight() {
        MarsRover rover = new MarsRover(1, 2, 'W');

        char instruction = 'R';

        assertEquals("1 2 N", rover.newPosition(instruction));
    }


    @Test
    public void newPositionOfTheRoverShouldBeOneThreeNorthWhenInitialPositionIsOneTwoNorthWithInstructionMove() {
        MarsRover rover = new MarsRover(1, 2, 'N');

        char instruction = 'M';

        assertEquals("1 3 N", rover.newPosition(instruction));
    }

    @Test
    public void newPositionOfTheRoverShouldBeFiveThreeEastWhenInitialPositionIsFourThreeEastWithInstructionMove() {
        MarsRover rover = new MarsRover(4, 3, 'E');

        char instruction = 'M';

        assertEquals("5 3 E", rover.newPosition(instruction));
    }
}
