package com.jseb.onc.objects;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import com.jseb.onc.Constants;
import com.jseb.onc.R;

/**
 * Created by tills13 on 1/20/14.
 */
public class Video {
    private String videoID;
    private String mTitle;
    private Drawable img_preview;

    public Video(String id, String title, String thumbnailurl) {
        this.videoID = id;
        this.mTitle = title;
    }

    public View getView(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_post, null);
        final YouTubeThumbnailView preview = (YouTubeThumbnailView) view.findViewById(R.id.preview);

        if (img_preview != null) {
            preview.setImageDrawable(this.img_preview);
        } else {
            preview.initialize(Constants.DEVELOPER_KEY, new YouTubeThumbnailView.OnInitializedListener() {
                @Override
                public void onInitializationSuccess(YouTubeThumbnailView view, YouTubeThumbnailLoader loader) {
                    loader.setVideo(Video.this.videoID);
                    loader.setOnThumbnailLoadedListener(new YouTubeThumbnailLoader.OnThumbnailLoadedListener() {
                        @Override
                        public void onThumbnailLoaded(YouTubeThumbnailView view, String s) {
                            img_preview = view.getDrawable();
                        }

                        @Override
                        public void onThumbnailError(YouTubeThumbnailView youTubeThumbnailView, YouTubeThumbnailLoader.ErrorReason errorReason) {

                        }
                    });
                }

                @Override
                public void onInitializationFailure(YouTubeThumbnailView view, YouTubeInitializationResult loader) {

                }
            });
        }

        ((TextView) view.findViewById(R.id.post_title)).setText(this.mTitle);

        return view;
    }
}
