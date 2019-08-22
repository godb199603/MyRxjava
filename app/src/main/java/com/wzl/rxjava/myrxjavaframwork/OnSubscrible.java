package com.wzl.rxjava.myrxjavaframwork;

/**
 * 作者：Create on 2019/7/15 14:30  by  wzl
 * 描述：男生：观察者：主动：通知者：observer
 * 最近修改：2019/7/15 14:30 modify by wzl
 */

/**
 * @effect:
 * @param1:T：看电影
 * @param2: Subscrible<? super T>:看电影女生
 * 得到看电影的女生和去看电影
 */
public interface OnSubscrible<T> extends Action1<Subscrible<? super T>> {




}
