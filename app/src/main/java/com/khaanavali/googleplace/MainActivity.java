package com.khaanavali.googleplace;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout dLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_nav);
        setNavigationDrawer();


    }




    private void setNavigationDrawer() {
        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navView = (NavigationView) findViewById(R.id.navigation);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //    transaction.addToBackStack(null);
        transaction.replace(R.id.frame, new AddPlaceFragment());

        transaction.commit();

        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                Fragment frag = null;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.hotel) {
                    frag = new AddPlaceFragment();
                }
//                else if (itemId == R.id.about_knvl) {
//                    frag = new AboutKhaanavali();
//                }
//                else if(itemId == R.id.status)
//                {
//                    frag = new StatusTrackerFragment();
//                }
//                else if(itemId == R.id.invite)
//                {
//                    frag = new ShareAppFragment();
//                }
                if (frag != null) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                    transaction.replace(R.id.frame, frag);
//                if(itemId != R.id.location) {
//                    transaction.addToBackStack(null);
//                }
                    transaction.commit();

                    dLayout.closeDrawers();
                    return true;
                }

                return false;
            }
        });
    }





    @Override
    public void onBackPressed() {
        if (dLayout.isDrawerOpen(GravityCompat.START)) {
            dLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

}
