package com.example.aplikasifix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class vworkout extends AppCompatActivity {
    private ImageButton vwbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vworkout);

        vwbtn1= findViewById(R.id.vwbtn1);

        vwbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),workout.class));

            }
        });
    }
}