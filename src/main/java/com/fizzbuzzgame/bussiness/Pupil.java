package com.fizzbuzzgame.bussiness;

/**
 * Created by hotice on 2019/4/3.
 */
public class Pupil {

    private Game game;

    public void joinGame(Game game) {
        this.game = game;
    }

    public void play() {
        System.out.println(this.game.run());
    }
}
