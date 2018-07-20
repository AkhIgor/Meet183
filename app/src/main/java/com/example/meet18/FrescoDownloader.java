package com.example.meet18;

import android.content.Context;
import android.net.Uri;
import android.view.View;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import java.net.URI;
import java.net.URL;

/**
 * Created by Игорь on 20.07.2018.
 */

public class FrescoDownloader {

    public static void getImage(Context context, String URLString, View view) {

        final Uri uri = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/gh-pages/static/fresco-logo.png");

        Fresco.initialize(context);
        try {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.imageView);
            simpleDraweeView.setImageURI(uri);
        } catch (ClassCastException ignored) {}
    }
}
