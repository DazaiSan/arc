package com.mim.archive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.*;
import android.view.*;
public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void show_main(){
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
