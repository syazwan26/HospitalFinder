package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webViewer = (WebView) findViewById(R.id.web);
        webViewer.loadUrl("https://wandanialprofile.wixsite.com/aboutus");

    }
}