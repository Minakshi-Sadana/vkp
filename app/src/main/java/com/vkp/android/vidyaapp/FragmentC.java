package com.vkp.android.vidyaapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by HP on 11/15/2015.
 */
public class FragmentC extends Fragment {
    ExpandableListView expandableListView;
    View v;
    Context ctx;
    public FragmentC() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        v= inflater.inflate(R.layout.fragment_c, container, false);
        ctx = container.getContext();

        return v;
    }
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        expandableListView= (ExpandableListView) v.findViewById(R.id.exlist);
        List<String> Headings=new ArrayList<String>();
        List<String> L1=new ArrayList<String>();
        List<String> L2=new ArrayList<String>();
        List<String> L3=new ArrayList<String>();
        List<String> L4=new ArrayList<String>();
        List<String> L5=new ArrayList<String>();
        List<String> L6=new ArrayList<String>();
        List<String> L7=new ArrayList<String>();
        List<String> L8=new ArrayList<String>();
        HashMap<String,List<String>> Childlist=new HashMap<String,List<String>>();

        String heading_items[]=getResources().getStringArray(R.array.headerTitles);
        String l1[]=getResources().getStringArray(R.array.h1_items);
        String l2[]=getResources().getStringArray(R.array.h2_items);
        String l3[]=getResources().getStringArray(R.array.h3_items);
        String l4[]=getResources().getStringArray(R.array.h4_items);
        String l5[]=getResources().getStringArray(R.array.h5_items);
        String l6[]=getResources().getStringArray(R.array.h6_items);
        String l7[]=getResources().getStringArray(R.array.h7_items);
        String l8[]=getResources().getStringArray(R.array.h8_items);
        for (String title: heading_items){
            Headings.add(title);
        }
        for(String title:l1){
            L1.add(title);
        }
        for(String title:l2){
            L2.add(title);
        }
        for(String title:l3){
            L3.add(title);
        }
        for(String title:l4){
            L4.add(title);
        }
        for(String title:l5){
            L5.add(title);
        }
        for(String title:l6){
            L6.add(title);
        }
        for(String title:l7){
            L7.add(title);
        }
        for(String title:l8){
            L8.add(title);
        }


        Childlist.put(Headings.get(0),L1);
        Childlist.put(Headings.get(1),L2);
        Childlist.put(Headings.get(2),L3);
        Childlist.put(Headings.get(3),L4);
        Childlist.put(Headings.get(4), L5);
        Childlist.put(Headings.get(5),L6);
        Childlist.put(Headings.get(6),L7);
        Childlist.put(Headings.get(7),L8);

        ExpandableListAdapter myAdapter= new ExpandableListAdapter(ctx,Headings,Childlist);
        expandableListView.setAdapter(myAdapter);

    }

}

/**

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Vidya College of Engineering (VCE)");
        listDataHeader.add("Vidya Institute of Fashion Technology (VIFT)");
        listDataHeader.add("Vidya Institute of Creative Teaching (VICT)");
        listDataHeader.add("Vidya Global School (VGS)");
        listDataHeader.add("Vidya International School of Business (VISB)");
        listDataHeader.add("Vidya School of Business (VSB)");
        listDataHeader.add("Vidya International Sports Academy (VISA)");


        // Adding child data
        List<String> VidyaCollegeofEngnieering = new ArrayList<String>();
        VidyaCollegeofEngnieering.add("Diploma- Computer Science and Engineering (CSE)");
        VidyaCollegeofEngnieering.add("Diploma- Machenical Engineering (ME)");
        VidyaCollegeofEngnieering.add("B.Tech- Computer Science and Engineering (CSE)");
        VidyaCollegeofEngnieering.add("B.Tech- Information Technology (IT)");
        VidyaCollegeofEngnieering.add("B.Tech- Electronics and Communication Engineering (ECE)");
        VidyaCollegeofEngnieering.add("B.Tech- Electronics and Instrumentation (EI)");
        VidyaCollegeofEngnieering.add("B.Tech- Electrical and Electronics Engineering (EEE)");
        VidyaCollegeofEngnieering.add("B.Tech- Machenical Engineering (ME)");
        VidyaCollegeofEngnieering.add("B.Tech- Civil Engineering (CE)");
        VidyaCollegeofEngnieering.add("M.Tech- Computer Science and Engineering (CSE)");
        VidyaCollegeofEngnieering.add("M.Tech- Machenical Engineering (ME)");
        VidyaCollegeofEngnieering.add("M.Tech- Electrical and Electronics Engineering (EEE)");
        VidyaCollegeofEngnieering.add("MBA- Masters of Business Administration");
        VidyaCollegeofEngnieering.add("MCA- Masters of Computer Application");


        List<String> VidyaInstituteofFashionTechnology = new ArrayList<String>();
        VidyaInstituteofFashionTechnology.add("Arts- Bachelor of Fine Arts (BFA)");
        VidyaInstituteofFashionTechnology.add("Arts- Diploma in Arts");
        VidyaInstituteofFashionTechnology.add("Design- Bachelor of Design (B.Des)");
        VidyaInstituteofFashionTechnology.add("UG Diploma- Diploma in Fashion Design");
        VidyaInstituteofFashionTechnology.add("UG Diploma- Advance Diploma in Fashion Design and Technology");


        List<String> VidyaInstituteCreativeofTeaching = new ArrayList<String>();
        VidyaInstituteCreativeofTeaching.add("Bachelor of Business Administration (BBA)");
        VidyaInstituteCreativeofTeaching.add("Bachelor of Computer Application (BCA)");
        VidyaInstituteCreativeofTeaching.add("Bachelor of Education (B.Ed)");

        List<String> VidyaGlobalSchool = new ArrayList<String>();
        VidyaGlobalSchool.add("CBSE");
        VidyaGlobalSchool.add("IB/Cambridge");

        List<String> VidyaInternationalSchoolofBusiness = new ArrayList<String>();
        VidyaInternationalSchoolofBusiness.add("PGDM- Human Rescource Management");
        VidyaInternationalSchoolofBusiness.add("PGDM- Human Rescource Management");
        VidyaInternationalSchoolofBusiness.add("PGDM- Finance Management");
        VidyaInternationalSchoolofBusiness.add("PGDM- Operations Management");

        List<String> VidyaSchoolofBusiness = new ArrayList<String>();
        VidyaSchoolofBusiness.add("MBA");
        VidyaSchoolofBusiness.add("PH.D");

        List<String> VidyaInternationalSportsAcademy = new ArrayList<String>();
        VidyaInternationalSportsAcademy.add("H2O: a 25-meter Olympic size swimming pool with changing room facility and water polo");
        VidyaInternationalSportsAcademy.add("400-meter running track and field events of International standards");
        VidyaInternationalSportsAcademy.add("State-of-The-Art Multi Gymnasium");
        VidyaInternationalSportsAcademy.add("Mini Golf Course");
        VidyaInternationalSportsAcademy.add("Judo, Karate and Marshal Arts");
        VidyaInternationalSportsAcademy.add("Training");
        VidyaInternationalSportsAcademy.add("Cricket and Football field of International Standards");
        VidyaInternationalSportsAcademy.add("Badminton, Table Tennis, Billiards, Snooker and other Indoor Sports");
        VidyaInternationalSportsAcademy.add("Squash, Volleyball, Basketball, Tennis Court of International Standards");
        VidyaInternationalSportsAcademy.add("Meditation and Yoga Centre");
        VidyaInternationalSportsAcademy.add("Aerobic Center");

        listDataChild.put(listDataHeader.get(0), VidyaCollegeofEngnieering); // Header, Child data
        listDataChild.put(listDataHeader.get(1), VidyaInstituteofFashionTechnology);
        listDataChild.put(listDataHeader.get(2), VidyaInstituteCreativeofTeaching);
        listDataChild.put(listDataHeader.get(3), VidyaGlobalSchool);
        listDataChild.put(listDataHeader.get(4), VidyaInternationalSchoolofBusiness);
        listDataChild.put(listDataHeader.get(5), VidyaSchoolofBusiness);
        listDataChild.put(listDataHeader.get(6), VidyaInternationalSportsAcademy);
    }**/