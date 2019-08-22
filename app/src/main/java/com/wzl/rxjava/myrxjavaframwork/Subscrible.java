package com.wzl.rxjava.myrxjavaframwork;

/**
 * 作者：Create on 2019/7/15 14:44  by  wzl
 * 描述：女生：观察者
 * 最近修改：2019/7/15 14:44 modify by wzl
 */
public abstract class Subscrible<T> {
    /**
     * @effect:想要做什么
     * @param1:T:代表做什么的泛型
     */
    public abstract void onNext(T t);

}
