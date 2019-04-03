package com.fizzbuzzgame.bussiness;

/**
 * Created by hotice on 2019/4/3.
 */
public interface Game {

    /**
     * Game start
     */
    void start();

    /**
     * Judging whether the game is over
     * @return false or true
     */
    boolean isEnd();

    /**
     * Running game rule
     * @return  the result of running game rule
     */
    String run();
}
