package com.diego.fragmenttut42;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Diego on 3/25/16.
 */
public class FragmentTwo extends Fragment {
    TextView name_text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        name_text = (TextView) view.findViewById(R.id.text_view_name);
        //name_text.setVisibility(View.INVISIBLE);

        return view;
    }

    public void updateInfo(String name){
        name_text.setText("Welcome " + name);
    }


}
