package com.example.tugas41;

import android.content.Intent;
import android.support.annotation.NavigationRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_menu);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,
                toolbar,R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_menu1:getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment , new makan1()).commit();
                break;
            case R.id.nav_menu2:getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment , new makan2()).commit();
                break;
            case R.id.nav_menu3:getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment , new makan3()).commit();
                break;
            case R.id.nav_menu4:getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment , new makan4()).commit();
                break;
            case R.id.nav_menu5:getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment , new makan5()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){ Intent intent = new Intent(this, about.class);
            startActivity(intent);
            //Toast toast = Toast.makeText(this, "Anda Pilih Menu About" , Toast.LENGTH_SHORT);
            //toast.show();
        } else if (item.getItemId() == R.id.help) {Intent intent = new Intent(this, help.class);
            startActivity(intent);
            //Toast toast = Toast.makeText(this, "Anda Pilih Menu Help" , Toast.LENGTH_LONG);
            //toast.show();
        } return true;
    }
}
