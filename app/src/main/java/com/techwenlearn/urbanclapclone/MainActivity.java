package com.techwenlearn.urbanclapclone;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import com.techwenlearn.urbanclapclone.ui.AdvertisementFragment;
import com.techwenlearn.urbanclapclone.ui.MyBookingFragment;
import com.techwenlearn.urbanclapclone.ui.MyWalletFragment;
import com.techwenlearn.urbanclapclone.ui.Profile;
import com.techwenlearn.urbanclapclone.ui.SearchFragment;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    public static final String TAG=MainActivity.class.getSimpleName();

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(false);
        supportActionBar.setDisplayShowHomeEnabled(false);
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,new SearchFragment())
                .commit();
        setSearchToolbar();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.search_bottom_menu:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,new SearchFragment())
                        .commit();
                setSearchToolbar();
                break;
            case R.id.my_booking_bottom_menu:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,new MyBookingFragment())
                        .commit();
                setMyBookingToolbar();
                break;
            case R.id.my_wallet_bottom_menu:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,new MyWalletFragment())
                        .commit();

                setWalletToolbar();
                break;
            case R.id.profile_bottom_menu:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,new Profile())
                        .commit();

                setProfileToolbar();
                break;
        }
        return true;
    }

    private void setSearchToolbar()
    {
        View view = LayoutInflater.from(this).inflate(R.layout.search_toolbar_layout, null);
        getSupportActionBar().setCustomView(view);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Search Toolbar");
            }
        });
    }

    private void setProfileToolbar()
    {
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayShowCustomEnabled(false);
        supportActionBar.setTitle("Profile");
    }

    private void setWalletToolbar()
    {
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayShowCustomEnabled(false);
        supportActionBar.setTitle("Wallet");
    }

    private void setMyBookingToolbar()
    {
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayShowCustomEnabled(false);
        supportActionBar.setTitle("Booking");
    }
}
