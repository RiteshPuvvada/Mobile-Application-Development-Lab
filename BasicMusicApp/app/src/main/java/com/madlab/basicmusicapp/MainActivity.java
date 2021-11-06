package com.madlab.basicmusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer bad_guy, dont_drop_it, peaceful_guiter, your_love;
    Button button1, button2, button3, button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaplayer = new MediaPlayer();
        mediaplayer.setWakeMode(getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);

        bad_guy = MediaPlayer.create(this,R.raw.bad_guy);
        dont_drop_it = MediaPlayer.create(this,R.raw.dont_drop_it);
        peaceful_guiter = MediaPlayer.create(this,R.raw.peaceful_guiter);
        your_love = MediaPlayer.create(this,R.raw.your_love);


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bad_guy.start();
                Toast.makeText(MainActivity.this,"Service Started and Playing Music", Toast.LENGTH_LONG).show();
                if(bad_guy.isPlaying()){
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                }
                bad_guy.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaplayer) {
                    Toast.makeText(MainActivity.this, "Service Stopped and Music Stopped",Toast.LENGTH_SHORT).show();
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                    button4.setEnabled(true);
                }
                });
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dont_drop_it.start();
                Toast.makeText(MainActivity.this,"Service Started and Playing Music", Toast.LENGTH_LONG).show();
                if(dont_drop_it.isPlaying()){
                    button1.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                }
                dont_drop_it.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaplayer) {
                        Toast.makeText(MainActivity.this, "Service Stopped and Music Stopped",Toast.LENGTH_SHORT).show();
                        button1.setEnabled(true);
                        button3.setEnabled(true);
                        button4.setEnabled(true);
                    }
                });
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peaceful_guiter.start();
                Toast.makeText(MainActivity.this,"Service Started and Playing Music", Toast.LENGTH_LONG).show();
                if(peaceful_guiter.isPlaying()){
                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button4.setEnabled(false);
                }
                peaceful_guiter.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaplayer) {
                        Toast.makeText(MainActivity.this, "Service Stopped and Music Stopped",Toast.LENGTH_SHORT).show();
                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        button4.setEnabled(true);
                    }
                });
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                your_love.start();
                Toast.makeText(MainActivity.this,"Service Started and Playing Music", Toast.LENGTH_LONG).show();
                if(your_love.isPlaying()){
                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                }
                your_love.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaplayer) {
                        Toast.makeText(MainActivity.this, "Service Stopped and Music Stopped",Toast.LENGTH_SHORT).show();
                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        button3.setEnabled(true);
                    }
                });
            }
        });
    }
}
