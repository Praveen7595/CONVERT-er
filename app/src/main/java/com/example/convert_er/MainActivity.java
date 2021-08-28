package com.example.convert_er;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    public TabLayout convo;
    public TabItem units,currency;
    public ViewPager2 viewpager;
    public PagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convo=(TabLayout) findViewById(R.id.convo);
        units=(TabItem) findViewById(R.id.units);
        currency=(TabItem) findViewById(R.id.currency);
        viewpager=(ViewPager2) findViewById(R.id.viewpager);
        FragmentManager fm = getSupportFragmentManager();
        adapter= new PagerAdapter(fm,getLifecycle());
        viewpager.setAdapter(adapter);

        convo.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                convo.selectTab(convo.getTabAt(position));
            }
        });



    }
}
