package com.jseb.onc.fetchers;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;

import com.jseb.onc.adapters.MediaAdapter;
import com.jseb.onc.objects.Video;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created by tills13 on 1/22/14.
 */
public class YouTubeFeedFetcher extends AsyncTask<Void, Void, ArrayList<Video>> {
    public MediaAdapter mAdapter;

    public YouTubeFeedFetcher(MediaAdapter adapter) {
        this.mAdapter = adapter;
    }

    @Override
    protected ArrayList<Video> doInBackground(Void... params) {
        ArrayList<Video> videos = new ArrayList<Video>();

        try {
            URL url = new URL("http://gdata.youtube.com/feeds/api/users/OceanNetworksCanada/uploads?alt=json");
            URLConnection connection = url.openConnection();

            //JSONArray videos_json = new JSONObject(new BufferedReader(new InputStreamReader(connection.getInputStream())).readLine()).getJSONArray("entry");
            System.out.println(new BufferedReader(new InputStreamReader(connection.getInputStream())).readLine());

            //for (int i = 0; i < videos_json.length(); i++) {
            //    JSONObject video_json = videos_json.getJSONObject(i);
            //    videos.add(new Video(video_json.getJSONObject("id").getString("$t"), video_json.getJSONObject("title").getString("$t"), video_json.getJSONObject("media$group").getJSONArray("media$thumbnail").getJSONObject(1).getString("url")));
            //}
        } catch (IOException e) {

        } //catch (JSONException e) {

       // }

        return videos;
    }

    @Override
    protected void onPostExecute(ArrayList<Video> videos) {
        super.onPostExecute(videos);

        mAdapter.addItems(videos);
        mAdapter.notifyDataSetChanged();
    }
}
