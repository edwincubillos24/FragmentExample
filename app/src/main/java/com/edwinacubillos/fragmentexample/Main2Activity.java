package com.edwinacubillos.fragmentexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        FlashFragment flashFragment = new FlashFragment();
        ft.add(R.id.frame,flashFragment).commit();
    }

    public void cambiarClicked(View view) {
        ft = fm.beginTransaction();
        SupermanFragment supermanFragment = new SupermanFragment();
        ft.replace(R.id.frame, supermanFragment).commit();
    }
}
