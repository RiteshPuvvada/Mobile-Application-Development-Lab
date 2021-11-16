package com.madlab.internalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText eT;
    TextView textView3;
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = (EditText) findViewById(R.id.eT);
        textView3 = (TextView) findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = eT.getText().toString();
                writeToFile("demo.txt",content);
                eT.setText("");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = readFromFile("demo.txt");
                textView3.setText(content);
            }
        });
    }
    public String readFromFile(String filename){
        File path = getApplicationContext().getFilesDir();
        File readFrom = new File(path,filename);
        byte[] content = new byte[(int) readFrom.length()];

        try {
            FileInputStream stream = new FileInputStream(readFrom);
            stream.read(content);
            return new String (content);
        }catch (Exception e){
            e.printStackTrace();
            return e.toString();
        }
    }
    public void writeToFile(String filename, String content){
        File path = getApplicationContext().getFilesDir();
        try {
            FileOutputStream writer = new FileOutputStream(new File(path, filename));
            writer.write(content.getBytes());
            writer.close();
            Toast.makeText(getApplicationContext(), "Wrote to file" + filename,Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}