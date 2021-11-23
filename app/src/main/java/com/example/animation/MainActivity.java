package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //public boolean bartIsShowing=true;
    public void fadeBart(View view){
        Log.i("info","imageView tapped");
        ImageView imageViewBart = (ImageView) findViewById(R.id.bartImageView);
        ImageView imageViewHomer = (ImageView)findViewById(R.id.homerImageView);
        imageViewBart.animate().rotation(180).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}