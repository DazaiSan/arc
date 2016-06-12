package com.mim.archive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.*;
import android.view.*;
import android.content.*;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_log_in(View view){
        Intent i=new Intent(this, LogInActivity.class);
        startActivity(i);
    }

    public void show_about(View view){

        Intent i=new Intent(this, AboutActivity.class);
        startActivity(i);
    }
}
