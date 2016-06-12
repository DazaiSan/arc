package com.mim.archive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.*;
import android.graphics.*;
import android.view.*;
public class AdminAddPaperActivity extends AppCompatActivity {

    EditText title;
    EditText tag;
    EditText date;
    EditText paper;
    EditText url;
    Button add;
    DBHandler dbHandler;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_paper);
        title=(EditText) findViewById(R.id.title);
        //tag=(EditText) findViewById(R.id.tag);
        //paper=(EditText) findViewById(R.id.paper);
        //date=(EditText) findViewById(R.id.date);
        url=(EditText) findViewById(R.id.url);
        add=(Button) findViewById(R.id.add_button);
        txt=(TextView) findViewById(R.id.whole_news);
        //txt.setMovementMethod(new ScrollingMovementMethod());
        dbHandler= new DBHandler(this, null, null, 1);
        try {
            print_database();
        }catch (Exception e){
            Log.i("exxxx", e.toString());
        }

    }

    public void print_database(){
        String dbString = dbHandler.databaseToString();
        txt.setText(dbString);
        title.setText("");
        //tag.setText("");
       // paper.setText("");
       // date.setText("");
        //tag.setText("");

    }

    public void addButtonClicked(View view){
        Log.i("exxxx", "CLİCKED ADD BUTTON");
        String a = title.getText().toString();
        //String b = paper.getText().toString();
        //String c = date.getText().toString();
        //String d = tag.getText().toString();
        String e = url.getText().toString();
        News p = new News(a,e);
        dbHandler.addNews(p);
        print_database();
    }


    public void show_admin_activity_page(View view){
        Intent i=new Intent(this, SuccessActivity.class);
        startActivity(i);
    }
}
