package com.madlab.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,be,bs,bm,bd,bc,ba;
    EditText et;
    static double result;
    static char op;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        be = (Button) findViewById(R.id.be);
        ba = (Button) findViewById(R.id.ba);
        bs = (Button) findViewById(R.id.bs);
        bm = (Button) findViewById(R.id.bm);
        bd = (Button) findViewById(R.id.bd);
        bc = (Button) findViewById(R.id.bc);
        et = (EditText) findViewById(R.id.et);


         b0.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 if(!(et.getText().toString().equals("")))
                     et.setText(String.valueOf(et.getText().toString()+0));
             }
         });
         b1.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(et.getText().toString()+1));
             }
         });
         b2.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(et.getText().toString()+2));
             }
         });
         b3.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(et.getText().toString()+3));
             }
         });
         b4.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(et.getText().toString()+4));
             }
         });
         b5.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(et.getText().toString()+5));
             }
         });
         b6.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(et.getText().toString()+6));
             }
         });
         b7.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(et.getText().toString()+7));
             }
         });
         b8.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(et.getText().toString()+8));
             }
         });
         b9.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(et.getText().toString()+9));
             }
         });
         bc.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v)
             {
                 et.setText(String.valueOf(""));
             }
         });
         ba.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 op = '+';
                 result = Double.parseDouble(et.getText().toString());
                 et.setText("");
             }
         });
         bs.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 op = '-';
                 result = Double.parseDouble(et.getText().toString());
                 et.setText(String.valueOf(""));
             }
         });
         bm.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 op = '*';
                 result = Double.parseDouble(et.getText().toString());
                 et.setText(String.valueOf(""));
             }
         });
         bd.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 op = '/';
                 result = Double.parseDouble(et.getText().toString());
                 et.setText(String.valueOf(""));
             }
         });
         be.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 if (op == '+') {
                     double n = Double.parseDouble(et.getText().toString());
                     et.setText(String.valueOf(result + n));
                 } else if (op == '-') {
                     double n = Double.parseDouble(et.getText().toString());
                     et.setText(String.valueOf(result - n));
                 } else if (op == '*') {
                     double n = Double.parseDouble(et.getText().toString());
                     et.setText(String.valueOf(result * n));
                 } else {
                     double n = Double.parseDouble(et.getText().toString());
                     et.setText(String.valueOf(result / n));
                 }
             }
         });
     }
}