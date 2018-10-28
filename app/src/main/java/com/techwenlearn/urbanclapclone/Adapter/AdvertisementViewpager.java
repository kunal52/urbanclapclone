package com.techwenlearn.urbanclapclone.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.techwenlearn.urbanclapclone.ui.AdvertisementFragment;

public class AdvertisementViewpager extends FragmentStatePagerAdapter {


    public AdvertisementViewpager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Fragment getItem(int i) {
        return AdvertisementFragment.getInstance("");
    }


}
