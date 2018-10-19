package com.example.cohen.theepiccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


     private DrawerLayout drawerLayout;
     public int drawerId;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);


        drawerLayout = findViewById(R.id.drawer_layout);


        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                drawerId = menuItem.getItemId();
                menuItem.setChecked(true);
                selectItem(drawerId);
                drawerLayout.closeDrawers();
                return true;
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void selectItem(int position){


        switch (position){
            case R.id.nav_currency :
                Intent intentC = new Intent(MainActivity.this, InputActivityCurrency.class);
                startActivity(intentC);
                Toast.makeText(MainActivity.this,"Currency", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_length :
                Intent intentL = new Intent(MainActivity.this, InputActivityLength.class);
                startActivity(intentL);
                Toast.makeText(MainActivity.this,"Length", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_weight :
                Intent intentW = new Intent(MainActivity.this, InputActivityWeight.class);
                startActivity(intentW);
                Toast.makeText(MainActivity.this,"Weight", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_temp :
                Intent intentT = new Intent(MainActivity.this, InputActivityTemperature.class);
                startActivity(intentT);
                Toast.makeText(MainActivity.this,"Temp", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_area :
                Intent intentA = new Intent(MainActivity.this, InputActivityArea.class);
                startActivity(intentA);
                Toast.makeText(MainActivity.this,"Area", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_speed :
                Intent intentS = new Intent(MainActivity.this, InputActivitySpeed.class);
                startActivity(intentS);
                Toast.makeText(MainActivity.this,"Speed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_vol :
                Intent intentV = new Intent(MainActivity.this, InputActivityVolume.class);
                startActivity(intentV);
                Toast.makeText(MainActivity.this,"Vol", Toast.LENGTH_SHORT).show();
                break;

        }


    }
}
