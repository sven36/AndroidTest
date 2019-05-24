package com.example.chengweiliang.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRE_MESSAGE);
        TextView textView=findViewById(R.id.textView);
        textView.setText(message);
        WebView myWebView=findViewById(R.id.webview);
        WebSettings webSettings=myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://m.xin.com");

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        WebView myWebView=findViewById(R.id.webview);
        if(keyCode==KeyEvent.KEYCODE_BACK&&myWebView.canGoBack()){
            myWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}
