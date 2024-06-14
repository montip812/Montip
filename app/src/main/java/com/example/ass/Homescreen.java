package com.example.ass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Homescreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);


        ImageButton imgButton = (ImageButton) findViewById(R.id.imageButton11);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Homescreen.this, "លក់អស់ហើយ", Toast.LENGTH_SHORT).show();
                ImageButton imgButton1 = (ImageButton) findViewById(R.id.imageButton13);
                imgButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Pizaa = new Intent(Homescreen.this, Pizaa.class);
                        startActivity(Pizaa);
                    }
                });
                ImageButton imgButton2 = (ImageButton) findViewById(R.id.imageButton16);
                imgButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Homescreen.this, "លក់អស់ហើយ", Toast.LENGTH_SHORT).show();
                    }
                });
                ImageButton imgButton3 = (ImageButton) findViewById(R.id.imageButton12);
                imgButton3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Barker = new Intent(Homescreen.this, Barker.class);
                        startActivity(Barker);
                    }
                });
                Button button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent profile = new Intent(Homescreen.this, image.class);
                        startActivity(profile);
                    }
                });
                ImageButton imgButton56 = (ImageButton) findViewById(R.id.imageButton17);
                imgButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Homescreen.this, "លក់អស់ហើយ", Toast.LENGTH_SHORT).show();
                    }
                });
                ImageButton imgButton57 = (ImageButton) findViewById(R.id.imageButton18);
                imgButton57.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Homescreen.this, "លក់អស់ហើយ", Toast.LENGTH_SHORT).show();
                    }
                });

                    }
                });
            }
        }