package com.example.ass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Barker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barker);
        Button Button = (Button) findViewById(R.id.Pizaa13);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Barker.this, "Add Cart", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton imgButton1 = (ImageButton) findViewById(R.id.Pizaa100);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Barker = new Intent(Barker.this, Homescreen.class);
                startActivity(Barker);
            }
        });

    }
}
