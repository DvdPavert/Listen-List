package com.example.daniel.a11045418_pset3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Song> trackList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        showResults();
    }

    private void showResults()
    {
        Bundle extras = getIntent().getExtras();
        trackList = (ArrayList<Song>) extras.getSerializable("data");
        makeTrackAdapter();
    }

    public void makeTrackAdapter()
    {
        ArrayAdapter arrayAdapter = new ArrayAdapter<Song>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, trackList);
        listView = (ListView) findViewById(R.id.trackList);
        assert listView != null;
        listView.setAdapter(arrayAdapter);
    }
}
