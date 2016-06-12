package com.mim.archive;

/**
 * Created by User on 6/8/2016.
 */

import  android.os.*;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.*;
import android.widget.*;
import android.support.*;
import android.app.Activity;
public class BottomSectionFragment extends Fragment
{

    private static TextView topMemeText;
    private static TextView bottomMemeText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.bottom_section_fragment, container, false);

        topMemeText=(TextView) v.findViewById(R.id.topMemeText);
        bottomMemeText=(TextView) v.findViewById(R.id.bottomMemeText);


        return v;
    }

    public void setMemeText(String top){
        topMemeText.setText(top);
        bottomMemeText.setText(top);
    }
}
