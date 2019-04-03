package com.example.navigation_project;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

public class MainActivity extends AppCompatActivity {

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                    NavHostFragment.findNavController(fragment).navigate(R.id.homeFragment);
//                    return true;
//                case R.id.navigation_dashboard:
//                    NavHostFragment.findNavController(fragment).navigate(R.id.dashboardFragment);
//                    return true;
//                case R.id.navigation_notifications:
//                    NavHostFragment.findNavController(fragment).navigate(R.id.noticeFragment);
//                    return true;
//            }
//            return false;
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.my_nav_host_fragment);

                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        NavHostFragment.findNavController(fragment).navigate(R.id.homeFragment);
                        return true;
                    case R.id.navigation_dashboard:
                        NavHostFragment.findNavController(fragment).navigate(R.id.dashboardFragment);
                        return true;
                    case R.id.navigation_notifications:
                        NavHostFragment.findNavController(fragment).navigate(R.id.noticeFragment);
                        return true;
                }
                return false;
            }
        });
    }

//    @Override
//    public boolean onSupportNavigateUp() {
//        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.my_nav_host_fragment);
//        return NavHostFragment.findNavController(fragment).navigateUp();
//    }
}
