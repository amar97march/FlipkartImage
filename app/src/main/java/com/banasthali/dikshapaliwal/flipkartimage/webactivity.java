package com.banasthali.dikshapaliwal.flipkartimage;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class webactivity extends Activity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webdesign);

        webview = (WebView) findViewById(R.id.webscreen);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        Bundle extras = getIntent().getExtras();

        String urlToInput = extras.getString("url");

        webview.loadUrl(urlToInput);
    }
}

