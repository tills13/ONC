package com.jseb.onc.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import com.jseb.onc.Constants;
import com.jseb.onc.MainActivity;
import com.jseb.onc.R;
import com.jseb.onc.adapters.MediaAdapter;
import com.jseb.onc.fetchers.YouTubeFeedFetcher;

/**
 * Created by tills13 on 1/17/14.
 */
public class MediaFragment extends ListFragment {
    private MediaAdapter mAdapter;
    private ListView mListView;

    public MediaFragment(Context context) {
        mAdapter = new MediaAdapter(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setListAdapter(mAdapter);
        new YouTubeFeedFetcher(mAdapter).execute();

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
