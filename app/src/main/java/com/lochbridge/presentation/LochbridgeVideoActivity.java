package com.lochbridge.presentation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.lochbridge.R;

public class LochbridgeVideoActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, View.OnClickListener {

    Button playButton;
    Button pauseButton;
    YouTubePlayerView playerView;
    YouTubePlayer youTubePlayer;
    private static final String API_KEY = "<API key>";
    private static final String CRYPTOCATORS_VIDEO_ID = "fQGRz5B8OfU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lochbridge_video);
        init();
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        youTubePlayer = player;
        youTubePlayer.cueVideo(CRYPTOCATORS_VIDEO_ID);
        youTubePlayer.play();
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        youTubePlayer = null;
    }

    private void init(){

        //---player view initialization
        playerView = findViewById(R.id.ytPlayerView);
        playerView.initialize(API_KEY, this);

        //---buttons
        playButton = findViewById(R.id.btnPlay);
        playButton.setOnClickListener(this);
        pauseButton = findViewById(R.id.btnPause);
        pauseButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        youTubePlayer.pause();

        switch (view.getId()){
            case R.id.btnPlay:
                if(youTubePlayer!=null) {
                    if (!youTubePlayer.isPlaying())
                        youTubePlayer.play();
                }
                break;

            case R.id.btnPause:
                if(youTubePlayer!= null){
                    if (youTubePlayer.isPlaying())
                        youTubePlayer.pause();
                }
                break;
            default:
            break;
        }
    }
}
