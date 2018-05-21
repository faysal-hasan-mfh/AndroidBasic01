package com.example.fhasan.basicandroidpart01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {
    public static final String TEST = "TEST";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TEST, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TEST, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TEST, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TEST, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TEST, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TEST, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TEST, "onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TEST, "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TEST, "onSaveInstanceStateaf");
    }

}
