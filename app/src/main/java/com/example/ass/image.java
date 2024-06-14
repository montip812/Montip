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

public class image extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_image);
        Button Button = (Button) findViewById(R.id.button13);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(image.this, "មានបញ្ហាបច្ចេកទេស", Toast.LENGTH_SHORT).show();
            }

        });
        Button imgButton1 = (Button) findViewById(R.id.button14);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(image.this, "មានបញ្ហាបច្ចេកទេស", Toast.LENGTH_SHORT).show();
            }
        });
        Button imgButton2 = (Button) findViewById(R.id.button15);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(image.this, "មានបញ្ហាបច្ចេកទេស", Toast.LENGTH_SHORT).show();
            }
        });
        Button imgButton3 = (Button) findViewById(R.id.button16);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(image.this, "មានបញ្ហាបច្ចេកទេស", Toast.LENGTH_SHORT).show();
            }
        });
        Button imgButton4 = (Button) findViewById(R.id.button17);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(image.this, "មានបញ្ហាបច្ចេកទេស", Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton imgButton6 = (ImageButton) findViewById(R.id.Pro1);
        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Barker = new Intent(image.this, Homescreen.class);
                startActivity(Barker);
            }
        });
    }
}