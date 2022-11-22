package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Home");

        ImageButton imgBtnBmi,imgBtnTic,imgBtnAnim;

        imgBtnBmi=findViewById(R.id.imgBtnBmi);
        imgBtnTic=findViewById(R.id.imgBtnTic);
        imgBtnAnim=findViewById(R.id.imgBtnAnim);

        Animation setAni= AnimationUtils.loadAnimation(this,R.anim.scale);
        imgBtnAnim.startAnimation(setAni);
        
        imgBtnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bmi= new Intent(MainActivity.this,bmi.class);
                MainActivity.this.startActivity(Bmi);
            }
        });
        imgBtnTic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ticTacToe=new Intent(MainActivity.this, com.example.myapplication.ticTacToe.class);
                MainActivity.this.startActivity(ticTacToe);
            }
        });
        imgBtnAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animationTest = new Intent(MainActivity.this, com.example.myapplication.animationTest.class);
                startActivity(animationTest);
            }
        });
    }
}