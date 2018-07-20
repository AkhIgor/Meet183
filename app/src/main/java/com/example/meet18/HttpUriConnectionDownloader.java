package com.example.meet18;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUriConnectionDownloader {

    public static Bitmap getImage(URL url) {
        HttpURLConnection connection = null;

        try {
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode == 200)
                return BitmapFactory.decodeStream(connection.getInputStream());
            else
                return null;
        } catch (Exception ignored) {
        } finally {
            if (connection != null)
                connection.disconnect();
        }
        return null;
    }

    public static Bitmap getImage(String URLString) {

        try {
            URL url = new URL(URLString);

            return getImage(url);
        } catch (MalformedURLException ignored) {}

        return null;
    }
}
