package com.example.daniel.a11045418_pset3;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Daniel on 21/09/2017.
 */

public class HttpRequestHelper {

    protected static synchronized String downloadFromServer(String... params)
    {
        String result = "";
        String chosenTag = params[0];

        URL url = null;

        HttpURLConnection connect;

        if(url != null)
        {
            try
            {
                connect = (HttpURLConnection) url.openConnection();
                connect.setRequestMethod("GET");

                Integer responseCode = connect.getResponseCode();

                if(responseCode >= 200 && responseCode < 300)
                {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connect.getInputStream()));
                    String line;

                    while((line = reader.readLine()) != null)
                    {
                        result += line;
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        return result;
    }

}
