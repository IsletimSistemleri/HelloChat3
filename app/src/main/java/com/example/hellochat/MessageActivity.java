package com.example.hellochat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.hellochat.Adapters.ViewPagerAdapters;
import com.example.hellochat.Fragments.MessagesFragment;
import com.example.hellochat.Fragments.UsersFragment;
import com.google.android.material.tabs.TabLayout;

public class MessageActivity extends AppCompatActivity {
ViewPagerAdapters viewPagerAdapters;
ViewPager viewPager;
TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);

        viewPagerAdapters=new ViewPagerAdapters(getSupportFragmentManager());
        viewPagerAdapters.addFragment(new UsersFragment(),"USERS");
        viewPagerAdapters.addFragment(new MessagesFragment(),"MESSAGE");
        viewPager.setAdapter(viewPagerAdapters);
        tabLayout.setupWithViewPager(viewPager);

    }
}