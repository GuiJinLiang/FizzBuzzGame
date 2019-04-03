package com.fizzbuzzgame.bussiness;

/**
 * Created by hotice on 2019/4/3.
 */
public interface Rule<R, V> {

    R execute(V value);
}
