package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class startingView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_view);

        TextView txtWelcome= findViewById(R.id.txtWelcome);

        Animation setAnimation= AnimationUtils.loadAnimation(this,R.anim.scale);
        txtWelcome.startAnimation(setAnimation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent preview= new Intent(startingView.this,MainActivity.class);
                startActivity(preview);
                finish();
            }
        },4000);



    }
}