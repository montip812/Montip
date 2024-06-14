package com.example.ass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText firstname = (EditText) findViewById(R.id.firstnametext);
        EditText lastname = (EditText) findViewById(R.id.lastnametext);
        EditText birthdate = (EditText) findViewById(R.id.birthdatetext);
        EditText email = (EditText) findViewById(R.id.emailtext);
        EditText password = (EditText) findViewById(R.id.passwordtext);

        Button view = (Button) findViewById(R.id.buttontext);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GOASS.first_name = firstname.getText().toString();
                GOASS.last_name = lastname.getText().toString();
                GOASS.Birthdate = birthdate.getText().toString();
                GOASS.email = email.getText().toString();
                GOASS.password = password.getText().toString();
                //Open new Activity
                Intent goToLogin = new Intent(Registration.this, LoginActivity.class);
                startActivity(goToLogin);



            }
        });
    }
}