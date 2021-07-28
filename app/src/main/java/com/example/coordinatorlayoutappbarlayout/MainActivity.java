package com.example.coordinatorlayoutappbarlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem tab1, tab2, tab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        tab1 = findViewById(R.id.tab_1);
        tab2 = findViewById(R.id.tab_2);
        tab3 = findViewById(R.id.tab_3);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        Toast.makeText(MainActivity.this, "tab 0", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "tab 1", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "tab 2", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "tab 3", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "tab 4", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "tab 5", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "tab 0", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}