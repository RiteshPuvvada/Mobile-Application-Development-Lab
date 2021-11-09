package com.madlab.applicationofspinners;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Double[] n = {0.0};
        final Double[] d = {0.0};
        final Spinner s1 =(Spinner)findViewById(R.id.spinner);
        final Spinner s2 =(Spinner)findViewById(R.id.spinner2);
        final Spinner s3 =(Spinner)findViewById(R.id.spinner3);
        final Spinner s4 =(Spinner)findViewById(R.id.spinner4);
        final Spinner s5 =(Spinner)findViewById(R.id.spinner5);
        final EditText e5 =(EditText)findViewById(R.id.editText);
        final EditText e6 =(EditText)findViewById(R.id.editText1);
        final EditText e7 =(EditText)findViewById(R.id.editText2);
        final EditText e8 =(EditText)findViewById(R.id.editText3);
        final EditText e9 =(EditText)findViewById(R.id.editText4);
        final EditText e10 =(EditText)findViewById(R.id.editText5);
        final EditText e11 =(EditText)findViewById(R.id.editText6);
        ArrayAdapter<CharSequence> a1= ArrayAdapter.createFromResource (this,R.array.list,
                R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> a2= ArrayAdapter.createFromResource (this,R.array.dis,
                R.layout.support_simple_spinner_dropdown_item);
        s1.setAdapter(a1);
        s2.setAdapter(a1);
        s3.setAdapter(a1);
        s4.setAdapter(a1);
        s5.setAdapter(a2);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                n[0] = n[0] +Double.parseDouble(parent.getItemAtPosition(position).toString());
                e5.setText(String.valueOf(Double.parseDouble(parent.getItemAtPosition(position).toString())*500));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                n[0] = n[0] +Double.parseDouble(parent.getItemAtPosition(position).toString());
                e6.setText(String.valueOf(Double.parseDouble(parent.getItemAtPosition(position).toString())*100));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                n[0] = n[0] +Double.parseDouble(parent.getItemAtPosition(position).toString());
                e7.setText(String.valueOf(Double.parseDouble(parent.getItemAtPosition(position).toString())*200));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                n[0] = n[0] +Double.parseDouble(parent.getItemAtPosition(position).toString());
                e8.setText(String.valueOf(Double.parseDouble(parent.getItemAtPosition(position).toString())*300));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                d[0] = d[0] +Double.parseDouble(parent.getItemAtPosition(position).toString());
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
            });

        Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                e9.setText(String.valueOf(n[0]));
                Double sum= Double.parseDouble(e5.getText().toString())+Double.parseDouble(e6.getText().toString())+
                            Double.parseDouble(e7.getText().toString())+Double.parseDouble(e8.getText().toString());
                e10.setText(String.valueOf(sum));
                Double sum1=sum-(sum*d[0]);
                e11.setText(String.valueOf(sum1));
            }
        });
    }
}
