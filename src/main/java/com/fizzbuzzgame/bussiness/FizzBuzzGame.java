package com.fizzbuzzgame.bussiness;

/**
 * Created by hotice on 2019/4/3.
 */
public class FizzBuzzGame implements Game {

    private FizzBuzzGameConfig config;
    private Rule rule;

    public FizzBuzzGame(FizzBuzzGameConfig config, Rule rule) {
        this.config = config;
        this.rule = rule;
    }

    public void start() {
        System.out.println("Game start.");
    }

    public boolean isEnd() {
        if(config.getNext() < config.getEnd()) {
            return false;
        }
        System.out.println("Game end.");
        return true;
    }

    public String run() {
        return (String)rule.execute(this.config.next());
    }
}
