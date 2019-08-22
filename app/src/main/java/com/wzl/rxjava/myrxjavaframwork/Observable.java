package com.wzl.rxjava.myrxjavaframwork;

/**
 * 作者：Create on 2019/7/15 13:24  by  wzl
 * 描述：
 * 最近修改：2019/7/15 13:24 modify by wzl
 */





public class Observable<T> {

    private  OnSubscrible<T>  onSubscrible;//男生
    /**
     * @effect:
     * @param1:T:看电影
     * 构造参数为男生
     */
    public Observable(OnSubscrible<T> onSubscrible) {
        this.onSubscrible = onSubscrible;
    }

/**
 * @effect:通知女生
 * @param1:Subscrible<? super T> subscrible:能看电影的女生

 */
public void subscrible(Subscrible<? super T> subscrible){
        onSubscrible.call(subscrible);

}
/**
 * @effect:
 * @param1:OnSubscrible<T> onSubscrible：男生
 *创建Obserable
 */
public static <T> Observable<T> create(OnSubscrible<T> onSubscrible){

    return new Observable<T>(onSubscrible);

}




public <R> Observable<R> map(Func1<? super T,? extends R> func1){
    return new Observable<R>(new OnSubscribleLift<T,R>(onSubscrible,func1));


}

/**
 * @effect:运行在子线程
 * @param1:
 * @param2;
 */
public Observable<T> subscriOnIO(){

    return create(new OnSubscribleIO<T>(this));
    }







}
