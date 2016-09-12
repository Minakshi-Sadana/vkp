package com.vkp.android.vidyaapp;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by HP on 3/15/2016.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private List<String> headerTitles;
    private HashMap<String,List<String>> childTitles;
    private Context ctx;

    ExpandableListAdapter(Context ctx, List<String> headerTitles,HashMap<String,List<String>> childTitles){
        this.ctx=ctx;
       // ctx=container.getContext();
        this.headerTitles=headerTitles;
        this.childTitles=childTitles;
    }



    @Override
    public int getGroupCount() {
        return headerTitles.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childTitles.get(headerTitles.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return headerTitles.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childTitles.get(headerTitles.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title= (String) this.getGroup(groupPosition);
        if(convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.list_groups,null);
        }
        TextView txtView= (TextView) convertView.findViewById(R.id.listHeader);
        txtView.setTypeface(null, Typeface.BOLD);
        txtView.setText(title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String title= (String) this.getChild(groupPosition,childPosition);
        if(convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.list_item,null);
        }
        TextView txtView1= (TextView) convertView.findViewById(R.id.listItem);
        txtView1.setText(title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}




