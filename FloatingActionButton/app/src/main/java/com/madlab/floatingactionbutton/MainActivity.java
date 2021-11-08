package com.madlab.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton add_alarm_fab,add_person_fab;
    ExtendedFloatingActionButton add_fab;
    TextView add_person_action_text,add_alarm_action_text;

    Boolean isAllFABVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_alarm_fab = (FloatingActionButton) findViewById(R.id.add_alarm_fab);
        add_person_fab = (FloatingActionButton) findViewById(R.id.add_person_fab);
        add_fab = (ExtendedFloatingActionButton) findViewById(R.id.add_fab);
        add_person_action_text = (TextView) findViewById(R.id.add_person_action_text);
        add_alarm_action_text = (TextView) findViewById(R.id.add_alarm_action_text);

        add_alarm_fab.setVisibility(View.GONE);
        add_person_fab.setVisibility(View.GONE);
        add_person_action_text.setVisibility(View.GONE);
        add_alarm_action_text.setVisibility(View.GONE);

        isAllFABVisible = false;

        add_fab.shrink();

        add_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isAllFABVisible){
                    add_alarm_fab.show();
                    add_person_fab.show();
                    add_person_action_text.setVisibility(View.VISIBLE);
                    add_alarm_action_text.setVisibility(View.VISIBLE);

                    add_fab.extend();
                    isAllFABVisible = true;
                }else {
                    add_alarm_fab.hide();
                    add_person_fab.hide();
                    add_person_action_text.setVisibility(View.GONE);
                    add_alarm_action_text.setVisibility(View.GONE);

                    add_fab.shrink();
                    isAllFABVisible = false;
                }
            }
        });

        add_person_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Person Added",Toast.LENGTH_SHORT).show();
            }
        });
        add_alarm_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Alarm Added",Toast.LENGTH_SHORT).show();
            }
        });
    }
}