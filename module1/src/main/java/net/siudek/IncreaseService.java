package net.siudek;

/**
 * Simple functionality to be covered fully by code coverage
 */
public class IncreaseService {
    public IncreaseResult increase(int value) {
        return IncreaseResult.of(value, ++value);
    }
}
