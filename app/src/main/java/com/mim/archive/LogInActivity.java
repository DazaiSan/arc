package com.mim.archive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.*;
import android.view.*;
public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void after_log_in(View view){
        Intent i=new Intent(this, SuccessActivity.class);
        startActivity(i);
    }
    public void register_page(View view){

        Intent i=new Intent(this, RegisterActivity.class);
        startActivity(i);
    }

    public  void go_to_admin(View view){

        Intent i=new Intent(this, AdminActivity.class);
        startActivity(i);
    }

}
