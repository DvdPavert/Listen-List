package com.example.daniel.a11045418_pset3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ShowSongActivity extends AppCompatActivity {

    private Song song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_song);
        getSong();
        loadSong();
    }


    private void getSong()
    {
        String songName = getIntent().getStringExtra("Song");
        //// TODO: 19/09/2017 Search for song name in the db and set to global
    }

    private void loadSong()
    {
        //// TODO: 19/09/2017 Set song.info en load into the textViews

    }
}
