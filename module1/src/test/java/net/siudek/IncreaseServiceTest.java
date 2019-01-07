package net.siudek;

import org.junit.Assert;
import org.junit.Test;

public class IncreaseServiceTest {

    @Test
    public void shouldIncrease()
    {
        Assert
                .assertEquals(new IncreaseService().increase(1), IncreaseResult.of(1, 2));
    }
}