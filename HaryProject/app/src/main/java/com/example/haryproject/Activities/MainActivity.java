package com.example.haryproject.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.haryproject.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView loginlink;
    EditText name, email,password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        name=findViewById(R.id.etname);
        email=findViewById(R.id.etemail);
        password=findViewById(R.id.etpass);
        register=findViewById(R.id.btnregister);
        loginlink=findViewById(R.id.loginlink);
        register.setOnClickListener(this);
        loginlink.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnregister:
                Toast.makeText(this , "Register", Toast.LENGTH_SHORT).show();
                break;
            case R.id.loginlink:
                    switchOnLogin();
                    break;

        }
    }
    private void switchOnLogin()
    {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
}