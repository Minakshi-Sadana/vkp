package com.vkp.android.vidyaapp;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;


public class MainActivity extends FragmentActivity implements ActionBar.TabListener {
    ActionBar actionBar;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //supportRequestWindowFeature(Window.FEATURE_ACTION_BAR);
        //requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);

        setContentView(R.layout.activity_main);
       // if(savedInstanceState==null){
         //   getSupportFragmentManager().beginTransaction().add(R.id.action_bar_container,new FragmentC()).commit();
        //}
        viewPager= (ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
              //  Log.d("ms", "On page scrolled at "+" position "+position+" from "+positionOffset+" with no. of pixels "+positionOffsetPixels);

            }

            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            //    Log.d("ms", "On page selected at "+" position "+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if(state==viewPager.SCROLL_STATE_IDLE){
             //       Log.d("ms","On page scroll state changed idle");
                }
                if(state==viewPager.SCROLL_STATE_DRAGGING){
               //     Log.d("ms","On page scroll state changed dragging");
                }
                if(state==viewPager.SCROLL_STATE_SETTLING){
                 //   Log.d("ms","On page scroll state changed settling");
                }

            }
        });




          actionBar=getActionBar();
                //getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1=actionBar.newTab();
        tab1.setText("Home");
        tab1.setTabListener(this);

        ActionBar.Tab tab2=actionBar.newTab();
        tab2.setText("Registration");
        tab2.setTabListener(this);

        ActionBar.Tab tab3=actionBar.newTab();
        tab3.setText("About Us");
        tab3.setTabListener(this);

        ActionBar.Tab tab4=actionBar.newTab();
        tab4.setText("Contact Us");
        tab4.setTabListener(this);

        ActionBar.Tab tab5=actionBar.newTab();
        tab5.setText("Placements");
        tab5.setTabListener(this);




        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
        actionBar.addTab(tab4);
        actionBar.addTab(tab5);


    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
     //   Log.d("ms","On tab selected at "+"position"+tab.getPosition()+" name "+tab.getText());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
       // Log.d("ms","On tab unselected at "+"position"+tab.getPosition()+" name "+tab.getText());
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
       // Log.d("ms","On tab reselected at "+"position"+tab.getPosition()+" name "+tab.getText());
    }
}
class MyAdapter extends FragmentStatePagerAdapter{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position==0){
            fragment = new FragmentA();
        }
        if(position==1){
            fragment = new FragmentB();
        }
        if(position==2){
            fragment = new FragmentC();
        }
        if(position==3){
            fragment = new FragmentD();
        }
        if(position==4){
            fragment = new FragmentE();
        }


        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}