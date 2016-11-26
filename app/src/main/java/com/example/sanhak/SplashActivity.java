package com.example.sanhak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by 조상현 on 2016-11-14.
 */
public class SplashActivity extends Activity {
    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(4000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}

