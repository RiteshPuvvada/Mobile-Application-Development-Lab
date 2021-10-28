package com.madlab.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,Pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        Pass = (EditText) findViewById(R.id.Pass);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(("ritesh".equals(name.getText().toString())&&"pass".equals(Pass.getText().toString()))
                        ||
                        ("RITESH".equals(name.getText().toString())&&"PASS".equals(Pass.getText().toString()))){
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"INVALID LOGIN",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}