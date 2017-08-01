package com.xxd.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xxd.retrofitdemo.net.RetrofitAssistant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        RetrofitAssistant.getGsonService().hotalClassifySearch()
    }
}
