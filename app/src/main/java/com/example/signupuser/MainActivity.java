package com.example.signupuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText signInEmailEditText,signInPasswordEditText;
    private TextView signUpTextView;
    private Button signInButton;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Sign In Activity");

        progressBar = findViewById(R.id.progressbar_Id);
        signInEmailEditText = findViewById(R.id.signInEmailEditText_Id);
        signInPasswordEditText = findViewById(R.id.signInPasswordEditText_Id);
        signUpTextView = findViewById(R.id.signUpTextView_Id);
        signInButton = findViewById(R.id.signInButtonId);


        signUpTextView.setOnClickListener(this);
        signInButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (id==R.id.signInButtonId)
        {

        }
        else if (id==R.id.signUpTextView_Id)
        {
            Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
            startActivity(intent);
        }

    }
}