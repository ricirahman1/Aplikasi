package com.example.aplikasifix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {
    private ImageButton Ibtn1,Ibtn2,Ibtn3,Ibtn4,Ibtn5,Ibtn6,Ibtn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Ibtn1= findViewById(R.id.ibtn1);
        Ibtn2= findViewById(R.id.ibtn2);
        Ibtn3= findViewById(R.id.ibtn3);
        Ibtn4= findViewById(R.id.ibtn4);
        Ibtn5= findViewById(R.id.ibtn5);
        Ibtn6= findViewById(R.id.ibtn6);
        Ibtn7= findViewById(R.id.ibtn7);

        Ibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),exercisess.class));

            }
        });
        Ibtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),workout.class));

            }
        });
        Ibtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),nutrisi.class));

            }
        });
        Ibtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),custom.class));

            }
        });
        Ibtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),history.class));

            }
        });
        Ibtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),profile.class));

            }
        });
        Ibtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });
    }
}