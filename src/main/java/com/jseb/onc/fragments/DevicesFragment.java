package com.jseb.onc.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jseb.onc.DeviceActivity;
import com.jseb.onc.adapters.DeviceListAdapter;

/**
 * Created by tills13 on 1/17/14.
 */
public class DevicesFragment extends ListFragment {
    DeviceListAdapter mAdapter;

    public DevicesFragment(Context context) {
        mAdapter = new DeviceListAdapter(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setListAdapter(mAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(getActivity(), DeviceActivity.class);
        DeviceActivity.mDevice = mAdapter.getItem(position);
        startActivity(intent);
    }
}