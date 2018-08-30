package com.edwinacubillos.comunicfrag;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements comunicador {

    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        EnvioFragment envioFragment = new EnvioFragment();
        ft.add(android.R.id.content, envioFragment).commit();
    }

    @Override
    public void envioDatos(String nombre, String telefono) {
        Bundle args = new Bundle();
        args.putString("nombre", nombre);
        args.putString("telefono",telefono);

        RecepcionFragment recepcionFragment = new RecepcionFragment();
        recepcionFragment.setArguments(args);

        ft = fm.beginTransaction();
        ft.replace(android.R.id.content, recepcionFragment).commit();



    }
}
