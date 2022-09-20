package com.example.haryproject.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.haryproject.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText email, password;
    Button btnlogin;
    TextView registerlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        email=findViewById(R.id.etemail);
        password=findViewById(R.id.etpass);
        btnlogin=findViewById(R.id.btnlogin);
        registerlink=findViewById(R.id.registerlink);
        btnlogin.setOnClickListener(this);
        registerlink.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.btnlogin:
                    startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                    finish();
                    break;

                case R.id.registerlink:
                    switchOnRegister();
                    break;


            }
    }

    private void switchOnRegister() {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

}