package com.example.aplikasifix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class exercisess extends AppCompatActivity {
    private ImageButton ebtn1,ebtn2,ebtn3,ebtn4,ebtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisess);

        ebtn1= findViewById(R.id.ebtn1);
        ebtn2= findViewById(R.id.ebtn2);
        ebtn3= findViewById(R.id.ebtn3);
        ebtn4= findViewById(R.id.ebtn4);
        ebtn5= findViewById(R.id.ebtn5);

        ebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),vexercises.class));

            }
        });
        ebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),vexercises.class));

            }
        });
        ebtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),vexercises.class));

            }
        });
        ebtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),profile.class));

            }
        });
        ebtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),menu.class));

            }
        });
    }
}