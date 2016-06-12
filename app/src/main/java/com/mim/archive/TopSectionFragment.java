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
public class TopSectionFragment extends Fragment {
    private static EditText etTopTextInput;
    //private static EditText etBottomTextInput;

    TopSectionListener activityCommander;

    public interface TopSectionListener{

        public void createMeme(String top);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        etTopTextInput = (EditText)view. findViewById(R.id.topTextInput);

        final Button button = (Button)view.findViewById(R.id.s_button);

        button.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return  view;
    }

    private void buttonClicked(View v) {
        activityCommander.createMeme(etTopTextInput.getText().toString());
    }
}

