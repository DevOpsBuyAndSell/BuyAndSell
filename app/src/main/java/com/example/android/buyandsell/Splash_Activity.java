package com.example.android.buyandsell;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.android.buyandsell.MainActivity;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView image= (ImageView) findViewById(R.id.logo);

        YoYo.with(Techniques.ZoomInUp)
                .duration(1000)
                .repeat(1)
                .playOn(image);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_Activity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 2500);
    }
}