package com.example.haryproject.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.haryproject.Fragment.DashboardFragment;
import com.example.haryproject.Fragment.ProfileFragment;
import com.example.haryproject.Fragment.UsersFragment;
import com.example.haryproject.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView=findViewById(R.id.bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this );
        loadFragment(new DashboardFragment());

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment=null;
        switch (item.getItemId())
        {
            case R.id.dashboard:
                fragment=new DashboardFragment();
                break;
            case R.id.users:
                fragment=new UsersFragment();
                break;
            case R.id.profile:
                fragment=new ProfileFragment();
                break;
        }
        if (fragment!=null)
        {
            loadFragment(fragment);
        }
        return true     ;
    }
   void loadFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.relativelayout, fragment).commit();
   }

}