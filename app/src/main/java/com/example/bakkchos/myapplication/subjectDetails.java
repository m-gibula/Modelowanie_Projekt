package com.example.bakkchos.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.bakkchos.myapplication.util.Schedule;
import com.example.bakkchos.myapplication.util.Subject;

import java.util.ArrayList;

public class subjectDetails extends AppCompatActivity {

    TextView details;
    public static String EXTRA_MESSAGE1 = "1";
    String id;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_details);

        details = (TextView) findViewById(R.id.detailsNew);

        Intent in = getIntent();
        String data = in.getStringExtra(Subjects.EXTRA_MESSAGE1);
        Schedule harm = new Schedule();
        ArrayList<Subject> today = harm.byDaySchedule(in.getStringExtra(Subjects.dzien_obecny));
        ArrayList<Subject> today_and_group = harm.groupSchedule(today, in.getStringExtra(Subjects.grupa));

        Subject item = today_and_group.get(Integer.parseInt(data));

        details.append(item.getNazwa_przedmiotu());
    }
}
