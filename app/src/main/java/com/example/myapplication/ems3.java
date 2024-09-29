package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.myapplication.R;

import java.util.Objects;

public class ems3 extends AppCompatActivity implements View.OnClickListener{

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    public Cardview d1,d2,d3,d4 ;

    private static final int IMAGE_PICK_CODE = 1000; // Request code for image picker intent
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ems3);
         d1 = (Cardview) findViewById(R.id.d1);
        d2 = (Cardview) findViewById(R.id.d2);
        d3 = (Cardview) findViewById(R.id.d3);
        d4 = (Cardview) findViewById(R.id.d4);

        d1.setOnClickListener((View.OnClickListener) this);
        d2.setOnClickListener((View.OnClickListener) this);
        d3.setOnClickListener((View.OnClickListener) this);
        d4.setOnClickListener((View.OnClickListener) this);





        drawerLayout = findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // to make the Navigation drawer icon always appear on the action bar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
@SuppressLint("NonConstantResourceId")
public void onClick(View v) {
    Intent i;
    switch (v.getId()) {
        case R.id.d1; new Intent(this,d1.class); startActivity(i); break;
        case R.id.d2; new Intent(this,d2.class); startActivity(i); break;
        case R.id.d3; new Intent(this,d3.class); startActivity(i); break;
        case R.id.d4; new Intent(this,d4.class); startActivity(i); break;

    }
}
}