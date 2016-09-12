package com.vkp.android.vidyaapp;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebClientClass extends WebViewClient {

    ProgressBar progressBar;
    WebView web;


    public void onPageStarted(WebView view,String url,Bitmap favicon){
        super.onPageStarted(view,url,favicon);

    }
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub
        progressBar.setVisibility(View.VISIBLE);
        view.loadUrl(url);
        return true;

    }

    @Override
    public void onPageFinished(WebView view, String url) {
        // TODO Auto-generated method stub
        super.onPageFinished(view, url);

        progressBar.setVisibility(View.GONE);
    }


    // To handle "Back" key press event for WebView to go back to previous screen.
    //@Override
   // public boolean onKeyDown(int keyCode, KeyEvent event)
   // {
     //   if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
       //     web.goBack();
         //   return true;
        //}
        //return super.onKeyDown(keyCode, event);
    //}

}
