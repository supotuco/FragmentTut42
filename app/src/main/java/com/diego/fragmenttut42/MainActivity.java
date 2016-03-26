package com.diego.fragmenttut42;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements  FragmentOne.OnNameSetListener{


    @Override
    public void setName(String name) {
        FragmentTwo fragmentTwo = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment_two);
        fragmentTwo.updateInfo(name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
