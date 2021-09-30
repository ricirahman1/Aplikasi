package com.example.aplikasifix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class nutrisi extends AppCompatActivity {
    private ImageButton nbtn1,nbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrisi);

        nbtn1= findViewById(R.id.nbtn1);
        nbtn2= findViewById(R.id.nbtn2);
        nbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),profile.class));

            }
        });
        nbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),menu.class));

            }
        });
    }
}