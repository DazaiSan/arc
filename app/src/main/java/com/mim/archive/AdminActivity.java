package com.mim.archive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.*;
import android.view.*;
public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void add_paper(View x){

        Intent i=new Intent(this, AdminAddPaperActivity.class);
        startActivity(i);
    }
    public void add_tag(View y){

    }

    public void back_up(View z){

    }
}
