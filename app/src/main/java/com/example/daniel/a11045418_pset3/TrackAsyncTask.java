package com.example.daniel.a11045418_pset3;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Daniel on 21/09/2017.
 */

class TrackAsyncTask extends AsyncTask<String, Integer, String>{

    Context context;
    MainActivity main;

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
;        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }

        this.main.trackStartIntent();
    }
}
