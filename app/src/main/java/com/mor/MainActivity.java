package com.mor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.mor.fragments.Ctvrtek;
import com.mor.fragments.Patek;
import com.mor.fragments.Sobota;
import com.mor.fragments.Nedele;
import com.mor.fragments.About;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.drawerCtvrtek);
        navigationView.getMenu().getItem(1).setChecked(true);


        Menu myMenu = navigationView.getMenu();

        MenuItem tools= myMenu.findItem(R.id.program);
        SpannableString s = new SpannableString(tools.getTitle());
        s.setSpan(new TextAppearanceSpan(this, R.style.MyTheme), 0, s.length(), 0);
        tools.setTitle(s);
        navigationView.setNavigationItemSelectedListener(this);

        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        Fragment fragment = new Ctvrtek();

        if ((month == 6 && day == 12 && hour >= 3) || (month == 6 && day == 13 && hour <= 2)) {fragment = new Patek();navigationView.setCheckedItem(R.id.drawerPatek);}
        else if ((month == 6 && day == 13) || (month == 6 && day == 14 && hour <= 2)) {fragment = new Sobota();navigationView.setCheckedItem(R.id.drawerSobota);}
        else if ((month == 6 && day == 14) || (month == 6 && day == 15 && hour <= 2)) {fragment = new Nedele(); navigationView.setCheckedItem(R.id.drawerNedele);}

        displaySelectedFragment(fragment);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment;
        int id = item.getItemId();

        clearChecked();
        navigationView.getMenu().findItem(item.getItemId()).setChecked(true);

        if (id == R.id.drawerCtvrtek) {
            fragment = new Ctvrtek();
            displaySelectedFragment(fragment);
        }  else if (id == R.id.drawerPatek) {
            fragment = new Patek();
            displaySelectedFragment(fragment);
        } else if (id == R.id.drawerSobota) {
            fragment = new Sobota();
            displaySelectedFragment(fragment);
        } else if (id == R.id.drawerNedele) {
            fragment = new Nedele();
            displaySelectedFragment(fragment);
        } else if (id == R.id.drawerAbout) {
            fragment = new About();
            displaySelectedFragment(fragment);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void clearChecked() {
        int size = navigationView.getMenu().size();
        for (int i = 0; i < size; i++) {
            navigationView.getMenu().getItem(i).setChecked(false);
        }
    }

    private void displaySelectedFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }

    @SuppressWarnings("WeakerAccess")
    public static class Globals {
        public static String messageStr;
    }
}