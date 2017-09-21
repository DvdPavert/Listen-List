package com.example.daniel.a11045418_pset3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class ShowSongActivity extends AppCompatActivity {

    private Song song;

    public ShowSongActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_song);
        getSong();
        loadSong();

        if(song.getInList() == true)
        {
            Button addSong = (Button) findViewById(R.id.buttonAddSong);
            addSong.setVisibility(INVISIBLE);
        }

    }


    private void getSong()
    {
        song = (Song) getIntent().getExtras().getSerializable("song");
    }

    private void loadSong()
    {
        TextView textName =  (TextView) findViewById(R.id.textName);
        TextView textArtist =  (TextView) findViewById(R.id.textArtist);
        TextView textAlbum =  (TextView) findViewById(R.id.textAlbum);

        textName.setText(song.getName());
        textArtist.setText(song.getArtist());
        textAlbum.setText(song.getAlbum());

    }

    private void addSong()
    {
        //// TODO: 21/09/2017 Add song to the list
        song.setInList(true);
    }

    private void removeSong()
    {
        //// TODO: 20/09/2017 Remove song from the list
        song.setInList(false);
    }


}
