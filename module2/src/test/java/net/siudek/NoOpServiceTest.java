package net.siudek;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoOpServiceTest {

    @Test
    public void shouldCoverMethods()
    {
        new NoOpService().doNothing(1);
    }
}