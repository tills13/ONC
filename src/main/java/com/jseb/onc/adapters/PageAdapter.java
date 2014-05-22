package com.jseb.onc.adapters;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.jseb.onc.R;
import com.jseb.onc.fragments.DevicesFragment;
import com.jseb.onc.fragments.MapFragment;
import com.jseb.onc.fragments.MediaFragment;

import java.util.Locale;

/**
 * Created by tills13 on 1/17/14.
 */
public class PageAdapter extends FragmentPagerAdapter {
    private Activity mActivity;
    public FragmentManager fm;

    private DevicesFragment devices;
    private MediaFragment media;
    private MapFragment map;

    public PageAdapter(Activity activity, FragmentManager fm) {
        super(fm);

        this.fm = fm;
        this.mActivity = activity;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 1:
                if (this.devices == null) devices = new DevicesFragment(mActivity);
                return devices;
            case 2:
                if (this.media == null) media = new MediaFragment(mActivity);
                return media;
            default:
                if (this.map == null) map = new MapFragment();
                return map;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return mActivity.getString(R.string.title_map).toUpperCase(Locale.getDefault());
            case 1: return mActivity.getString(R.string.title_devices).toUpperCase(Locale.getDefault());
            case 2: return mActivity.getString(R.string.title_media).toUpperCase(Locale.getDefault());
        }

        return null;
    }
}
