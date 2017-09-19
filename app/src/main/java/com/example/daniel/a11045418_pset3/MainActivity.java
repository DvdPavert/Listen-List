package com.example.daniel.a11045418_pset3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toInputSong(View view)
    {
        Intent intent = new Intent(this, InputSongActivity.class);
        startActivity(intent);
        finish();
    }

    public void toShowSong(View view)
    {
        Intent intent = new Intent(this, ShowSongActivity.class);
        //// TODO: 19/09/2017 Get Clicked Song

        startActivity(intent);
        finish();

    }
}
