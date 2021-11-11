package com.madlab.dateandtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4,button5;
    EditText date1,date2,date3,time1,time2,time3;
    private int[] Date1 ,Date2,Time1,Time2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        date1 = (EditText) findViewById(R.id.date1);
        date2 = (EditText) findViewById(R.id.date2);
        date3 = (EditText) findViewById(R.id.date3);
        time1 = (EditText) findViewById(R.id.time1);
        time2 = (EditText) findViewById(R.id.time2);
        time3 = (EditText) findViewById(R.id.time3);

        Date1=new int [3];
        Date2=new int [3];
        Time1=new int[2];
        Time2=new int[2];

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date(Date1,date1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time(Time1,time1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                date(Date2,date2);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time(Time2,time2);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diff_date(date3);
                diff_time(time3);
            }
        });
    }
    void date(final int[]d, final EditText e){
        final Calendar c1 = Calendar.getInstance();
        d[0] = c1.get(Calendar.YEAR);
        d[1] = c1.get(Calendar.MONTH);
        d[2] = c1.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                e.setText(String.valueOf(dayOfMonth+"/"+(month+1)+"/"+year));
                d[0]=dayOfMonth;
                d[1]=month;
                d[2]=year;

            }
        },d[0],d[1],d[2]);
        datePickerDialog.show();
    }

    void time(final int[] t, final EditText e){
        final Calendar c = Calendar.getInstance();
        t[0] = c.get(Calendar.HOUR_OF_DAY);
        t[1] = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                e.setText(String.valueOf(hourOfDay + ":" + minute));
                t[0]=hourOfDay;
                t[1]=minute;
            }
        },t[0], t[1], true);
        timePickerDialog.show();
    }
    void diff_date(final EditText e){
        e.setText(String.valueOf((Date2[0]-Date1[0])+"/"+(Date2[1]- Date1[1])+"/"+(Date2[2]-Date1[2])));
    }
    void diff_time(final EditText e){
        e.setText(String.valueOf((Time2[0]-Time1[0])+":"+(Time2[1]-Time1[1])));
    }
}