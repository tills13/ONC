package com.jseb.onc.listeners;

import android.app.Activity;
import android.support.v4.app.ListFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

import com.jseb.onc.MainActivity;

/**
 * Created by tills13 on 1/17/14.
 */
public class TabListener implements ActionBar.TabListener {
    private Activity mActivity;
    private ViewPager mViewPager;

    public TabListener(Activity activity, ViewPager viewPager) {
        this.mActivity = activity;
        this.mViewPager = viewPager;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        if (tab.getPosition() == 1) ((ListFragment)((MainActivity) mActivity).mSectionsPagerAdapter.getItem(tab.getPosition())).getListView().smoothScrollToPosition(0);
    }
}
