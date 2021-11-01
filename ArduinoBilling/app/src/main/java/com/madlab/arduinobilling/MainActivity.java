package com.madlab.arduinobilling;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et,et2,et3,et4,et5,et6,et7,et8,et9,et10;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);
        et7 = (EditText) findViewById(R.id.et7);
        et8 = (EditText) findViewById(R.id.et8);
        et9 = (EditText) findViewById(R.id.et9);
        et10 = (EditText) findViewById(R.id.et10);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et2.setText(String.valueOf(Double.parseDouble(et.getText().toString())*500));
                et4.setText(String.valueOf(Double.parseDouble(et3.getText().toString())*100));
                et6.setText(String.valueOf(Double.parseDouble(et5.getText().toString())*200));
                et8.setText(String.valueOf(Double.parseDouble(et7.getText().toString())*300));
                et9.setText(
                        String.valueOf(
                                Double.parseDouble(et.getText().toString())+
                                        Double.parseDouble(et3.getText().toString())+
                                        Double.parseDouble(et5.getText().toString())+
                                        Double.parseDouble(et7.getText().toString())
                        )
                );
                et10.setText(
                        String.valueOf(
                                Double.parseDouble(et2.getText().toString())+
                                        Double.parseDouble(et4.getText().toString())+
                                        Double.parseDouble(et6.getText().toString())+
                                        Double.parseDouble(et8.getText().toString())
                        )
                );
            }
        });
    }
}