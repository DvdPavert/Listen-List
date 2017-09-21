package com.example.daniel.a11045418_pset3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText searchText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchText = (EditText) findViewById(R.id.searchText);
    }


    public void toShowSong(View view)
    {
        Intent intent = new Intent(this, ShowSongActivity.class);
        //// TODO: 19/09/2017 Get Clicked Song

        startActivity(intent);
        finish();
    }

    private void displayList()
    {
       //// TODO: 21/09/2017 Display the list
    }


    public void trackSearch(View view)
    {
        String trackSearch = searchText.getText().toString();
        TrackAsyncTask task = new TrackAsyncTask(this);
        task.execute(trackSearch);

        searchText.getText().clear();
    }

    public void trackStartIntent(ArrayList<String> trackData)
    {
        Intent dataIntent = new Intent(this, ShowSongActivity.class);
        dataIntent.putExtra("data", trackData);
        this.startActivity(dataIntent);
    }

    //password: "D@@n1995"
    //username: "danielvdpavert@gmail.com"
    //api_key  : "2a828a481fa633d70733ee3f241d52c0"
    //api_sig: A Last.fm method signature. See authentication for more information.


}
