package com.madlab.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textvie4;
    EditText editTextTextMoney;
    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textvie4 = (TextView) findViewById(R.id.textView4);
        button = (Button) findViewById(R.id.button);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        editTextTextMoney = (EditText) findViewById(R.id.editTextTextMoney);
        int i=radioGroup.getCheckedRadioButtonId();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ab =Integer.parseInt(editTextTextMoney.getText().toString());
                if(radioButton.getText().equals("USD"))
                {
                    textvie4.setText(String.valueOf(ab*0.014));
                }
                else if (radioButton.getText().equals("EURO"))
                {
                    radioButton.setText(String.valueOf(ab*0.214));
                }
                else if (radioButton.getText().equals("YEN"))
                {
                    textvie4.setText(String.valueOf(ab*1.014));
                }
            }
        });
    }
}