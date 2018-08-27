package com.edwinacubillos.fragmentexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottonNavigationActivity extends AppCompatActivity {

    private FragmentManager fm;
    private FragmentTransaction ft;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            fm = getSupportFragmentManager();
            ft = fm.beginTransaction();

            switch (item.getItemId()) {
                case R.id.mSuperman:
                    SupermanFragment supermanFragment = new SupermanFragment();
                    ft.replace(R.id.frame, supermanFragment).commit();
                    return true;
                case R.id.mBatman:
                    BatmanFragment batmanFragment = new BatmanFragment();
                    ft.replace(R.id.frame, batmanFragment).commit();
                    return true;
                case R.id.mFlash:
                    FlashFragment flashFragment = new FlashFragment();
                    ft.replace(R.id.frame, flashFragment).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botton_navigation);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        SupermanFragment supermanFragment = new SupermanFragment();
        ft.add(R.id.frame, supermanFragment).commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
