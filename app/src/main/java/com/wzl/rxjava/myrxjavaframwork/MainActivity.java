package com.wzl.rxjava.myrxjavaframwork;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "WODE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }






    /**
     * @effect:
     * @param1:string:看电影
     * @param2;

     */
    public void send1(View view){
        Observable.create(new OnSubscrible<String>() {
            @Override
            public void call(Subscrible<? super String> subscrible) {
                subscrible.onNext("看电影");
                //通知Toast.makeText(MainActivity.this,"ni的",Toast.LENGTH_SHORT).show();
               Log.i(TAG,"线程："+Thread.currentThread().getName());
            }
        }).map(new Func1<String, Bitmap>() {
            @Override
            public Bitmap call(String s) {
                //结果uu不和你去看电影
Log.i(TAG,s);
Log.i(TAG,"NO");
Log.i(TAG,"线程2："+Thread.currentThread().getName());
                return BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
            }
        }).subscriOnIO().subscrible(new Subscrible<Bitmap>() {  //通知闺蜜
            @Override
            public void onNext(Bitmap bitmap) {
                //主线程
                Log.i(TAG,"Bitmap"+bitmap);
                Log.i(TAG,"ok");
                Log.i(TAG,"线程3："+Thread.currentThread().getName());
              }

        });
    }
}
