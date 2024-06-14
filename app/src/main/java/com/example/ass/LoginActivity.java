package com.example.ass;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText emailTextField = (EditText) findViewById(R.id.emailtext1);
        EditText passwordTextField = (EditText) findViewById(R.id.passwordtext1);

        Button loginButton = (Button) findViewById(R.id.Button2);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (emailTextField.getText().toString().equals(GOASS.email) &&
                        passwordTextField.getText().toString().equals(GOASS.password)) {
                    openHomepageActivity();
                } else
                    Toast.makeText(LoginActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();
            }


        });
    }

    public void openHomepageActivity() {
        Intent Homescreen = new Intent(LoginActivity.this, Homescreen.class);
        startActivity(Homescreen);
    }
}