package com.example.rakesh.profileview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        videoView = (VideoView) findViewById(R.id.Video);

//        MediaController mediaController= new MediaController(this);
//        mediaController.setAnchorView(videoView);

//        Uri uri = Uri.parse("https://www.youtube.com/watch?v=kWUQbhbqvqo");
//        videoView.setMediaController(mediaController);
//        videoView.setVideoURI(uri);
//        videoView.requestFocus();
//        videoView.start();

    }

}
