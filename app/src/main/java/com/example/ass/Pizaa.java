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

public class Pizaa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pizaa);
        Button Button = (Button) findViewById(R.id.Pizaa13);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Pizaa.this, "Add Cart", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton imgButton1 = (ImageButton) findViewById(R.id.Pizaa100);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Barker = new Intent(Pizaa.this, Homescreen.class);
                startActivity(Barker);
            }
        });
    }
}