package com.example.daniel.a11045418_pset3;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Daniel on 21/09/2017.
 */

class TrackAsyncTask extends AsyncTask<String, Integer, String>{

    private Context context;
    private MainActivity main;
    private ArrayList<Song> resultsList;

    public TrackAsyncTask(MainActivity main)
    {
        this.main = main;
        this.context = this.main.getApplicationContext();
    }


    @Override
    protected void onPreExecute()
    {
        Toast.makeText(context, "Searching for tracks", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected String doInBackground(String... params) {
        return HttpRequestHelper.downloadFromServer(params);
    }

    @Override
    protected void onPostExecute(String result)
    {
        super.onPostExecute(result);

        try
        {
            JSONObject trackStreamObject = new JSONObject(result);
            JSONObject resultsObject = trackStreamObject.getJSONObject("results");
            //// TODO: 21/09/2017 Get the right info from the JSON
;        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }

        this.main.trackStartIntent(resultsList);
    }
}
