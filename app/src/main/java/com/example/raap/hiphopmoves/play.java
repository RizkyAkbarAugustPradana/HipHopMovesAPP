package com.example.raap.hiphopmoves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }

    public void hh(View view) {
        startActivity(new Intent(play.this, hiphop.class));
    }

    public void bb(View view) {
        startActivity(new Intent(play.this, bboy.class));
    }

    public void pp(View view) {
        startActivity(new Intent(play.this, popping.class));
    }
}
