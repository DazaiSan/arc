package com.mim.archive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.*;
import android.view.*;
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void after_register(View view){
        Intent i=new Intent(this, SuccessActivity.class);
        startActivity(i);
    }
}
