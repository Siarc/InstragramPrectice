package com.example.aminu.instragramprectice.Home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aminu on 8/17/2017.
 */

/**
 * Class that stores fragment for tabs
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter{
    private static final String TAG = "SectionsPagerAdapter";


    private final List<Fragment> mFragmentList = new ArrayList<>();
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
}
