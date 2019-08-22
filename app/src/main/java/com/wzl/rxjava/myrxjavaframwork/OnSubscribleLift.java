package com.wzl.rxjava.myrxjavaframwork;

/**
 * 作者：Create on 2019/7/15 16:57  by  wzl
 * 描述：好兄弟
 * 最近修改：2019/7/15 16:57 modify by wzl
 */


/**
 * @effect:
 * @param1:T:男生想找个能看电影女生
 * @param2;R:能看电影的女生

 */
public class OnSubscribleLift<T,R> implements OnSubscrible<R>{


    public OnSubscribleLift(OnSubscrible boy, Func1<? super T, ? extends R> transfromer) {
        this.boy = boy;
        this.transfromer = transfromer;
    }


    OnSubscrible boy;
    private Func1<? super T,?extends R> transfromer;



    /**
     * @effect:根据男生想要的  生成想要的闺蜜
     * @param1:
     * @param2;

     */
    @Override
    public void call(Subscrible<? super R> subscrible) {
                 Subscrible<? super T> wifu=new OperaChange<>(subscrible,transfromer);
                 boy.call(wifu);
    }




    /**
     * @effect:
     * @param1:好兄弟的女朋友uu
     * @param2;

     */
  class OperaChange<T,R> extends Subscrible<T> {

        public OperaChange(Subscrible<? super R> actual, Func1<? super T, ? extends R> transform) {
            this.actual = actual;
            this.transform = transform;
        }

        Subscrible<? super R> actual;//真正能和男生一起去看电影的人
        private Func1<? super T,? extends R> transform;//转换方法



        /**
         * @effect:男生调用的onnext方法
         * @param1:

         */

        @Override
        public void onNext(T t) {
          R r=this.transform.call(t);
          actual.onNext(r);
        }
    }




}
