package com.example.bakkchos.myapplication.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bakkchos.myapplication.R;

import java.util.ArrayList;

/**
 * Created by bakkchos on 03.05.2017.
 */

public class SubjectAdapter extends ArrayAdapter<Subject> {
        public SubjectAdapter(Context context, ArrayList<Subject> subjects) {
            super(context, 0, subjects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            Subject subject = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_layout, parent, false);
            }

            ImageView iv= (ImageView)convertView.findViewById(R.id.imageView2);
            int imageResouce = 0;
            if(subject.getTyp_zajec()=="W"){imageResouce = R.drawable.w;}
            if(subject.getTyp_zajec()=="L"){imageResouce = R.drawable.l;}
            if(subject.getTyp_zajec()=="P"){imageResouce = R.drawable.p;}
            if(subject.getTyp_zajec()=="C"){imageResouce = R.drawable.c;}
            iv.setImageResource(imageResouce);

            // Lookup view for data population
            TextView Name = (TextView) convertView.findViewById(R.id.main);
            TextView Desc = (TextView) convertView.findViewById(R.id.content);
            // Populate the data into the template view using the data object
            Name.setText(subject.getNazwa_przedmiotu());
            Desc.setText(subject.getGodzina()+ " w " + subject.getSala());
            // Return the completed view to render on screen

            return convertView;
        }
    }


