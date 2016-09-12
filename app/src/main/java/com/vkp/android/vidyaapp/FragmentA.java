package com.vkp.android.vidyaapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

/**
 * Created by HP on 11/15/2015.
 */
public class FragmentA extends Fragment {
    ImageView mImageView;
    View v;
    WebView mWebView;

   // Integer pics[]={R.drawable.download,R.drawable.mail,R.drawable.vkp,R.drawable.vkpl};

   // ImageSwitcher iSwitcher;

    Context ctx;
    public FragmentA(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        v= inflater.inflate(R.layout.fragment_a, container, false);
        ctx=container.getContext();
        return v;
    }

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        mWebView= (WebView) v.findViewById(R.id.webView1);
        final WebSettings webSettings = mWebView.getSettings();
// Set the font size (in sp).
        webSettings.setDefaultFontSize(20);

        String text="<html><body bgcolor=\"#ffe86f\" text=\"#000\"  "
                + "<p align=\"justify\" >"

                + getString(R.string.app)
                + "</p> "
                + "</body></html>";

        mWebView.loadData(text, "text/html", "utf-8");

        mImageView = (ImageView)v.findViewById(R.id.image); //this is your imageView
     //   ViewGroup.LayoutParams params = (ViewGroup.LayoutParams) mImageView.getLayoutParams();
       // params.height = 420;
        //mImageView.stLayoutParams(params);
      //  LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(400, 400);
//width and height of your Image ,if it is inside Relative change the LinearLayout to RelativeLayout.
    //    mImageView.setLayoutParams(layoutParams);
       // mImageView .setImageDrawable(getResources().getDrawable( R.id.image));
    }

}




   /** iSwitcher = (ImageSwitcher) v.findViewById(R.id.imageSwitcher);
        iSwitcher.setFactory(this);
        iSwitcher.setInAnimation(AnimationUtils.loadnimation(ctx,
                android.R.anim.fade_in));
        iSwitcher.setOutAnimation(AnimationUtils.loadAnimation(ctx,
                android.R.anim.fade_out));

        Gallery gallery = (Gallery) v.findViewById(R.id.gallery);
        gallery.setAdapter(new ImageAdapter(ctx));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                iSwitcher.setImageResource(pics[arg2]);
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {

        private Context ctx;

        public ImageAdapter(Context c) {
            ctx = c;
        }

        @Override
        public int getCount() {

            return pics.length;
        }

        @Override
        public Object getItem(int arg0) {

            return arg0;
        }

        @Override
        public long getItemId(int arg0) {

            return arg0;
        }

        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {

            ImageView iView = new ImageView(ctx);
            iView.setImageResource(pics[arg0]);
            iView.setScaleType(ImageView.ScaleType.FIT_XY);
            iView.setLayoutParams(new Gallery.LayoutParams(150, 150));
            return iView;
        }

    }


    /**  final int []imageArray={R.drawable.download,R.drawable.mail,R.drawable.vkp};


      final Handler handler = new Handler();
      Runnable runnable = new Runnable() {
          int i=0;
          public void run() {
              imageView.setImageResource(imageArray[i]);
              i++;
              if(i>imageArray.length-1)
              {
                  i=0;
              }
              handler.postDelayed(this, 50);  //for interval...
          }
      };
      handler.postDelayed(runnable, 2000); //for initial delay..**/



   /** @Override
    public View makeView() {
        ImageView iView = new ImageView(ctx);
        iView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        iView.setLayoutParams(new ImageSwitcher.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
        iView.setBackgroundColor(0xFF000000);
        return iView;
    }
    }

**/