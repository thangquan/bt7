package com.example.bt7;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


import com.example.bt7.Fragment1;
import com.example.bt7.Fragment2;

public class TabAdapter extends FragmentStatePagerAdapter {
    private String listTab[] = {"Posts", "Audio"};
    private Fragment1 mfragment1;
    private Fragment2 mfragment2;
    private BlankFragment blankFragment;

    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
        mfragment1 = new Fragment1();
        mfragment2 = new Fragment2();
        blankFragment = new BlankFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return blankFragment;
        } else if (position == 1) {
            return mfragment1;
        }
        return null;
    }

    @Override
    public int getCount() {
        return listTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }
}