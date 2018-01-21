package com.cruzhacks.scheduleapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by julio on 1/20/18.
 **/
public class CustomArrayAdapter extends BaseAdapter implements ListAdapter {
    private ArrayList<String> list = new ArrayList<String>();
    private ArrayList<String> listSub = new ArrayList<String>();
    private Context context;



    public CustomArrayAdapter(ArrayList<String> list,ArrayList<String> listSub, Context context) {
        for(int index = 0; index < list.size(); index++) {
            this.list.add(list.get(index));
        }
        for(int i = 0; i < list.size(); i++) {
            this.listSub.add(listSub.get(i));
        }


        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return 0;
        //just return 0 if your list items do not have an Id variable.
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview_assignment_item, null);
        }

        //Handle TextView and display string from your list



        return view;
    }
}
