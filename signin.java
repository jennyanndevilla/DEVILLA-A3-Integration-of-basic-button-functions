package com.example.mya2_androidui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Button signInButton = findViewById(R.id.button_sign_in);

        signInButton.setOnClickListener(view -> {
            Intent intent = new Intent(SignInActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
