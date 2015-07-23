package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void newPositionOfTheRoverShouldBeZeroZeroWestWhenInitialPositionIsZeroZeroNorthWithInstructionLeft() {
        MarsRover rover = new MarsRover(0, 0, 'N');

        char instructions = 'L';

        assertEquals("0 0 W", rover.newPosition(instructions));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoWestWhenInitialPositionIsOneTwoNorthWithInstructionLeft() {
        MarsRover rover = new MarsRover(1, 2, 'N');

        char instructions = 'L';

        assertEquals("1 2 W", rover.newPosition(instructions));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoSouthWhenInitialPositionIsOneTwoWestWithInstructionLeft() {
        MarsRover rover = new MarsRover(1, 2, 'W');

        char instructions = 'L';

        assertEquals("1 2 S", rover.newPosition(instructions));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoSouthWhenInitialPositionIsOneTwoEastWithInstructionLeft() {
        MarsRover rover = new MarsRover(1, 2, 'S');

        char instructions = 'L';

        assertEquals("1 2 E", rover.newPosition(instructions));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoNorthWhenInitialPositionIsOneTwoEastWithInstructionLeft() {
        MarsRover rover = new MarsRover(1, 2, 'E');

        char instructions = 'L';

        assertEquals("1 2 N", rover.newPosition(instructions));
    }

    @Test
    public void newPositionOfTheRoverShouldBeOneTwoEastWhenInitialPositionIsOneTwoNorthWithInstructionRight() {
        MarsRover rover = new MarsRover(1, 2, 'N');

        char instructions = 'R';

        assertEquals("1 2 E", rover.newPosition(instructions));
    }
}
