package com.example.rizkyedp.simplebootmbarnav;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.action_addphoto :
                        Toast.makeText(MainActivity.this, "Add Photo clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_camera :
                        Toast.makeText(MainActivity.this, "Camera clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_assistant :
                        Toast.makeText(MainActivity.this, "Assistant clicked", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });

    }
}
