package com.wzl.rxjava.myrxjavaframwork;

/**
 * 作者：Create on 2019/7/15 14:34  by  wzl
 * 描述：
 * 最近修改：2019/7/15 14:34 modify by wzl
 */

/**
 * @effect:动作,想做什么
 * @param1: T：女生需要做什么的，看电影
 */
public interface Action1<T> {
    void call(T t);
}
