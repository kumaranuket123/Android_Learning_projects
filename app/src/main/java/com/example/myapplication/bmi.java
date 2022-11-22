package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class bmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().setTitle("BMI");

        EditText edtWeight,edtHeightFeet,edtHeightInch;
        Button btnBmi;
        TextView txtResult;
        LinearLayout llBmi;

        edtWeight= findViewById(R.id.edtWeight);
        edtHeightFeet=findViewById(R.id.edtHeightFeet);
        edtHeightInch=findViewById(R.id.edtHeightInch);
        btnBmi=findViewById(R.id.btnBmi);
        txtResult=findViewById(R.id.txtResult);
        llBmi=findViewById(R.id.llBmi);


        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt=Integer.parseInt(edtWeight.getText().toString());
                int heightFt=Integer.parseInt(edtHeightFeet.getText().toString());
                int heightIn=Integer.parseInt(edtHeightInch.getText().toString());


                int totalIn= heightFt*12 + heightIn;
                double totalCm= totalIn *2.53;
                double totalM= totalCm/100;
                double bmi = wt/(totalM*totalM);

                if(bmi>25){
                    txtResult.setText("you are overweight");
                    llBmi.setBackgroundColor(getResources().getColor(R.color.colorOW));
                }else if(bmi<18){
                    txtResult.setText("you are underweight");
                    llBmi.setBackgroundColor(getResources().getColor(R.color.colorUW));
                }else{
                    txtResult.setText("you are healthy");
                    llBmi.setBackgroundColor(getResources().getColor(R.color.colorH));
                }

            }
        });

    }
}