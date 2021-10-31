package com.madlab.playcards;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11;
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText) findViewById(R.id.e3);
        e4 = (EditText) findViewById(R.id.e4);
        e5 = (EditText) findViewById(R.id.e5);
        e6 = (EditText) findViewById(R.id.e6);
        e7 = (EditText) findViewById(R.id.e7);
        e8 = (EditText) findViewById(R.id.e8);
        e9 = (EditText) findViewById(R.id.e9);
        e10 = (EditText) findViewById(R.id.e10);
        e11 = (EditText) findViewById(R.id.e11);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        final int arr[]=new int[5];

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Random rand = new Random();
                arr[0]=rand.nextInt(10);
                e1.setText(String.valueOf(arr[0]));
                arr[1]=rand.nextInt(10);
                e2.setText(String.valueOf(arr[1]));
                arr[2]=rand.nextInt(10);
                e3.setText(String.valueOf(arr[2]));
                arr[3]=rand.nextInt(10);
                e4.setText(String.valueOf(arr[3]));
                arr[4]=rand.nextInt(10);
                e5.setText(String.valueOf(arr[4]));}
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                for (int i = 0; i < 4; i++)
                    for (int j = 0; j < 4; j++)
                        if (arr[j] > arr[j+1])
                        {
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                e6.setText(String.valueOf(arr[0] ));
                e7.setText(String.valueOf(arr[1]));
                e8.setText(String.valueOf( arr[2]));
                e9.setText(String.valueOf(arr[3] ));
                e10.setText(String.valueOf( arr[4]));
                e11.setText(String.valueOf(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]));
            }
        });
    }
}