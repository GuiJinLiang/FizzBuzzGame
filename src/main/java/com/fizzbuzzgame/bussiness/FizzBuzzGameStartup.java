package com.fizzbuzzgame.bussiness;

/**
 * Created by hotice on 2019/4/3.
 */
public class FizzBuzzGameStartup {

    public void run() {
        FizzBuzzGameConfig config = new FizzBuzzGameConfig(1, 100);
        FizzBuzzGameRule rule = new FizzBuzzGameRule();
        Game game = new FizzBuzzGame(config, rule);

        Pupil pupil = new Pupil();
        pupil.joinGame(game);

        game.start();
        while(!game.isEnd()) {
            pupil.play();
        }
    }
}
