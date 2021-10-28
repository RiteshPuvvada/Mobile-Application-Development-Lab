package com.madlab.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText tempEdit,ResultEdit;
    Button Fbutton,Cbutton;
    double a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempEdit = (EditText) findViewById(R.id.tempEdit);
        ResultEdit = (EditText) findViewById(R.id.ResultEdit);
        Fbutton = (Button) findViewById(R.id.Fbutton);
        Cbutton = (Button) findViewById(R.id.Cbutton);

        Fbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                a=Double.parseDouble(tempEdit.getText().toString());
                b=a-32;
                b=b*0.5555;
                ResultEdit.setText(String.valueOf(b));
                Toast.makeText(getApplicationContext(),tempEdit.getText()+" to Celsius = "+ResultEdit.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        Cbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                double a=Double.parseDouble(tempEdit.getText().toString());
                double b=a*1.8;
                b=b+32;
                ResultEdit.setText(String.valueOf(b));
                Toast.makeText(getApplicationContext(),tempEdit.getText()+" to Fahrenheit = "+ResultEdit.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}