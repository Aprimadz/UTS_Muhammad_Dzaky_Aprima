package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.MenuItem;

import com.example.navigationdrawer.databinding.ActivityMainBinding;
import com.example.navigationdrawer.ui.about.AboutFragment;
import com.example.navigationdrawer.ui.club.ClubFragment;
import com.example.navigationdrawer.ui.home.HomeFragment;
import com.example.navigationdrawer.ui.manager.ManagerFragment;
import com.example.navigationdrawer.ui.player.PlayerFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    private ActivityMainBinding binding;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());

            Toolbar toolbar = findViewById(R.id.toolbar); //Ignore red line errors
            setSupportActionBar(toolbar);
            drawerLayout = findViewById(R.id.drawer_layout);
            NavigationView navigationView = binding.navView;
            navigationView.setNavigationItemSelectedListener(this);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav,
                R.string.close_nav);
            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();
            if (savedInstanceState == null) {

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                navigationView.setCheckedItem(R.id.nav_home);
            }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_home){
            replaceFragment(new HomeFragment());
        }
        else if (id == R.id.nav_player){
            replaceFragment(new PlayerFragment());
        }
        else if (id == R.id.nav_manager){
            replaceFragment(new ManagerFragment());
        }
        else if (id == R.id.nav_club){
            replaceFragment(new ClubFragment());

        }else if (id == R.id.nav_about){
            replaceFragment(new AboutFragment());
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();

    }
}
