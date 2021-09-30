package com.example.aplikasifix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class workout extends AppCompatActivity {
    private ImageButton wbtn1,wbtn2,wbtn3,wbtn4,wbtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        wbtn1= findViewById(R.id.wbtn1);
        wbtn2= findViewById(R.id.wbtn2);
        wbtn3= findViewById(R.id.wbtn3);
        wbtn4= findViewById(R.id.wbtn4);
        wbtn5= findViewById(R.id.wbtn5);


        wbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),vworkout.class));

            }
        });
        wbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),vworkout.class));

            }
        });
        wbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),vworkout.class));

            }
        });
        wbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),profile.class));

            }
        });
        wbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),menu.class));

            }
        });
    }
}