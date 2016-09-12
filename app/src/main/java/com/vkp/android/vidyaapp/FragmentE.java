package com.vkp.android.vidyaapp;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by HP on 3/30/2016.
 */
public class FragmentE extends Fragment {

    Context ctx;
    WebView placement;
    // ProgressBar progressBar;

    public FragmentE() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_e, container, false);
        //   rootview.setMinimumWidth(20);
        final WebView placement = (WebView) rootview.findViewById(R.id.webView);
        ctx = container.getContext();
        placement.getSettings().setJavaScriptEnabled(true);

        // browser.getSettings().setLoadWithOverviewMode(true);
        //browser.getSettings().setUseWideViewPort(true);
        placement.loadUrl("http://vidya.edu.in/placements/");
        //placement.setPadding(0,0,0,0);
       // placement.setInitialScale(100);

        WebSettings webSettings = placement.getSettings();
        /**  placement.setInitialScale(120);
         placement.setScrollContainer(true);
         placement.bringToFront();
         placement.setScrollbarFadingEnabled(true);
         placement.setVerticalScrollBarEnabled(true);
         placement.setHorizontalScrollBarEnabled(true);**/

        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setSupportMultipleWindows(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setLightTouchEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportZoom(true);
        webSettings.setUseWideViewPort(true);
        placement.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        placement.setScrollbarFadingEnabled(false);
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB) {


// Hide the zoom controls for HONEYCOMB+


            //   webSettings.setDisplayZoomControls(false);


            placement.setInitialScale(50);
            placement.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);


// Enable remote debugging via chrome://inspect


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                //   placement.getSettings().setJavaScriptEnabled(true);
                //  placement.addJavascriptInterface(new MyJavaScriptInterface(), "MYOBJECT");
                placement.getSettings().setAllowUniversalAccessFromFileURLs(true);
                 placement.getSettings().setUseWideViewPort(true);
                placement.getSettings().setLoadWithOverviewMode(true);
                placement.getSettings().setBuiltInZoomControls(true);
                placement.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

                placement.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                placement.getSettings().setAllowFileAccess(true);
                // placement.canScrollHorizontally(1);
                placement.setInitialScale(50);
                placement.getSettings().setDefaultFontSize(20);


                placement.setWebViewClient(new WebViewClient());
                //   public static final String USERNAME = ;
            }
        }

        return rootview;

    }

}