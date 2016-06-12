package com.mim.archive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SearchTitleActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_title);
    }
///////gets called by Top fragment
    @Override
    public void createMeme(String top) {
        BottomSectionFragment bottomFragment=(BottomSectionFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top);
    }
}
