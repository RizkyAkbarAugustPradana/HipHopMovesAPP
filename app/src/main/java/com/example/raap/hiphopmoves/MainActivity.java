package com.example.raap.hiphopmoves;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//PINDAH KE PLAY
    public void play(View view) {
        startActivity(new Intent(MainActivity.this, play.class));
    }
//PINDAH KE KUIS
    public void quiz(View view) {
        startActivity(new Intent(MainActivity.this, quiz.class));
    }
//EXIT
    public void clickExit(View v){
        finish();
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder =  new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Apakah ingin keluar Aplikasi?");
        builder.setCancelable(true);
        builder.setPositiveButton("Keluar", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        builder.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
