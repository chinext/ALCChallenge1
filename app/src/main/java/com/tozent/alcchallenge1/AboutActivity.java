package com.tozent.alcchallenge1;

import android.content.Context;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    private WebView andelaPage;
    private final String andelaURL ="https://andela.com/alc/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setTitle("About ALC");


        andelaPage  = new WebView(this);
        WebSettings andelaWebSetting = andelaPage.getSettings();
        andelaWebSetting.setJavaScriptEnabled(true);
        andelaWebSetting.setDomStorageEnabled(true);
        andelaWebSetting.setLoadWithOverviewMode(true);
        andelaWebSetting.setUseWideViewPort(true);

        andelaPage.setWebViewClient( new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
               // super.onReceivedSslError(view, handler, error);
                handler.proceed();
            }
        });

        andelaPage.loadUrl(andelaURL);
        setContentView(andelaPage);

    }






}
