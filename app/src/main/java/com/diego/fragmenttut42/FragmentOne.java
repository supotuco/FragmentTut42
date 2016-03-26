package com.diego.fragmenttut42;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Diego on 3/25/16.
 */
public class FragmentOne extends Fragment {

    EditText edt_name;
    Button btn_submit;
    OnNameSetListener nameSetListener;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_one, container, false);

        edt_name = (EditText) view.findViewById(R.id.edit_text_enter_name);
        btn_submit = (Button) view.findViewById(R.id.button_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                * This is where we get the name
                *
                * */
                String name = edt_name.getText().toString();

                nameSetListener.setName(name);
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            nameSetListener = (OnNameSetListener) context;
        }catch (Exception ex){

        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            nameSetListener = (OnNameSetListener) activity;
        }catch (Exception ex){

        }
    }

    public static interface OnNameSetListener{
        public void setName(String name);
    }
}
