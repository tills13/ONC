package com.jseb.onc.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.jseb.onc.objects.Video;

import java.util.ArrayList;

/**
 * Created by tills13 on 1/20/14.
 */
public class MediaAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Video> videos;

    public MediaAdapter(Context context) {
        this.mContext = context;
        this.videos = new ArrayList<Video>();
    }

    public void addItems(ArrayList<Video> videos) {
        this.videos.addAll(videos);
    }

    @Override
    public int getCount() {
        return videos.size();
    }

    @Override
    public Video getItem(int position) {
        return videos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getItem(position).getView(mContext);
    }
}
