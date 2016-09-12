package com.vkp.android.vidyaapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FragmentD extends android.support.v4.app.Fragment  {
    View view;

    //Button address;
    Button mail,b1,b2,b3,b4,b5,details,address,fee;
    static Context ctx;
    public FragmentD(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
         view= inflater.inflate(R.layout.fragment_d, container, false);
        ctx=container.getContext();
        address= (Button) view.findViewById(R.id.mapBtn);

        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.co.in/maps/place/Vidya+Knowledge+Park,+Panchli+Khurd,+Uttar+Pradesh+250002/@28.9720284,77.6212888,16z/data=!3m1!4b1!4m2!3m1!1s0x390c66f2117a2667:0x2aeeb77335221dd4"));
                startActivity(intent);

              //  String tempString = new String(getResources().getString(R.string.Map));
                //SpannableString content = new SpannableString(tempString);
                //content.setSpan(new UnderlineSpan(), 0, tempString.length(), 0);
                //address.setText(content);
                //address.setTextColor(getResources().getColor(R.color.material_blue_grey_950));




                /**  Uri uri = Uri.parse("https://www.google.co.in/maps/place/Vidya+Knowledge+Park,+Panchli+Khurd,+Uttar+Pradesh+250002/@28.9720284,77.6212888,16z/data=!3m1!4b1!4m2!3m1!1s0x390c66f2117a2667:0x2aeeb77335221dd4"); // missing 'http://' will cause crashed
                  Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                  getActivity().startActivity(intent);**/
            }
        });

        details= (Button) view.findViewById(R.id.siteBtn);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://vidya.edu.in/"));
                startActivity(intent);


                /**  Uri uri = Uri.parse("https://www.google.co.in/maps/place/Vidya+Knowledge+Park,+Panchli+Khurd,+Uttar+Pradesh+250002/@28.9720284,77.6212888,16z/data=!3m1!4b1!4m2!3m1!1s0x390c66f2117a2667:0x2aeeb77335221dd4"); // missing 'http://' will cause crashed
                 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                 getActivity().startActivity(intent);**/
            }
        });


        b1= (Button) view.findViewById(R.id.callBtn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Intent.ACTION_CALL);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                in.setData(Uri.parse("tel:" + "01212439188"));
                try {
                    getActivity().startActivity(in);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getActivity().getApplicationContext(), "Your activity is not found", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2= (Button) view.findViewById(R.id.callBtn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Intent.ACTION_CALL);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                in.setData(Uri.parse("tel:" + "01212439189"));
                try {
                    getActivity().startActivity(in);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getActivity().getApplicationContext(), "Your activity is not found", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b3=(Button) view.findViewById(R.id.callBtn3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                in.setData(Uri.parse("tel:"+"01212439192"));
                try{
                    getActivity().startActivity(in);
                }
                catch (android.content.ActivityNotFoundException ex){
                    Toast.makeText(getActivity().getApplicationContext(),"Your activity is not found",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b4= (Button) view.findViewById(R.id.callBtn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                in.setData(Uri.parse("tel:"+"09411222666"));
                try{
                    getActivity().startActivity(in);
                }
                catch (android.content.ActivityNotFoundException ex){
                    Toast.makeText(getActivity().getApplicationContext(),"Your activity is not found",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b5= (Button) view.findViewById(R.id.callBtn5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                in.setData(Uri.parse("tel:"+"08650000775"));
                try{
                    getActivity().startActivity(in);
                }
                catch (android.content.ActivityNotFoundException ex){
                    Toast.makeText(getActivity().getApplicationContext(),"Your activity is not found",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mail=(Button) view.findViewById(R.id.mailBtn);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","admissions@vidya.edu.in", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, "");
                intent.putExtra(Intent.EXTRA_TEXT   , "");

                try {
                    startActivity(Intent.createChooser(intent, "Choose email client..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(FragmentD.ctx, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }

        });
        fee=(Button) view.findViewById(R.id.fees);
        fee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(ctx,SecondActivity.class);
                startActivity(intent1);
            }
        });

                return view;
    }}

