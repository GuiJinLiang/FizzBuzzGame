package com.fizzbuzzgame.bussiness;

/**
 * Created by hotice on 2019/4/3.
 */
public class FizzBuzzGameConfig {
    private int next;
    private int end;

    public FizzBuzzGameConfig(int start, int end) {
        if(start < 0 || end < 0 || end < start) {
            throw new IllegalArgumentException("start and end must be integers greater than 0, and end must be greater than start!");
        }
        this.end = end;
        this.next = start - 1;
    }

    public int next() {
        return ++next;
    }

    public int getNext() {
        return next;
    }

    public int getEnd() {
        return end;
    }
}
