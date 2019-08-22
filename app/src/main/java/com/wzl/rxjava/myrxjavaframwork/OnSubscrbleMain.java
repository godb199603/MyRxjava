package com.wzl.rxjava.myrxjavaframwork;

/**
 * 作者：Create on 2019/7/16 01:59  by  wzl
 * 描述：
 * 最近修改：2019/7/16 01:59 modify by wzl
 */
import android.os.Handler;


public class OnSubscrbleMain<T> implements OnSubscrible<T> {

    private Handler handler;
    private Observable<T> source;

    public OnSubscrbleMain(Handler handler, Observable<T> source) {
        this.handler = handler;
        this.source = source;
    }

    @Override
    public void call(final Subscrible<? super T> subscrible) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                source.subscrible(subscrible);
            }
        });
    }
}