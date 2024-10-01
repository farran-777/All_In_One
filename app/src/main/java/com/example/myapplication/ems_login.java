package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.widget.EditText;

public class ems_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ems_login);


        class LoginActivity extends AppCompatActivity {

            private EditText emailEditText;
            private EditText passwordEditText;
            private TextView loginButton;

            private static final String VALID_EMAIL = "ems123@gmail.com";
            private static final String VALID_PASSWORD = "event123";

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_ems_login); // Make sure this matches your layout file name

                emailEditText = findViewById(R.id.emailEditText);
                passwordEditText = findViewById(R.id.passwordEditText);
                loginButton = findViewById(R.id.loginButton);

                loginButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String email = emailEditText.getText().toString();
                        String password = passwordEditText.getText().toString();

                        if (email.equals(VALID_EMAIL) && password.equals(VALID_PASSWORD)) {
                            // Login successful
                            Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                            // Proceed to the next activity or perform further actions
                        } else {
                            // Login failed
                            Toast.makeText(LoginActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }
        class LoginActivityImpl extends LoginActivity {}

    };
    }
