package com.example.bakkchos.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.bakkchos.myapplication.util.Schedule;
import com.example.bakkchos.myapplication.util.Subject;

import java.util.ArrayList;
import java.util.Map;

public class subjectDetails extends AppCompatActivity {

    TextView details;
    TextView description;
    public static String EXTRA_MESSAGE1 = "1";
    String id;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_details);

        details = (TextView) findViewById(R.id.detailsNew);
        description = (TextView) findViewById(R.id.description);
        Intent in = getIntent();
        String data = in.getStringExtra(Subjects.EXTRA_MESSAGE1);
        Schedule harm = new Schedule();
        ArrayList<Subject> today = harm.byDaySchedule(in.getStringExtra(Subjects.dzien_obecny));
        ArrayList<Subject> today_and_group = harm.groupSchedule(today, in.getStringExtra(Subjects.grupa));

        Subject item = today_and_group.get(Integer.parseInt(data));
        Map<String,String> opisy = harm.getDesc();
        details.append(item.getNazwa_przedmiotu()+"\n\n");
        description.setText("");

        description.append("Prowadzący : "+item.getProwadzacy()+"\n");
        description.append("Godzina : "+item.getGodzina()+"\n");
        description.append("Sala : "+item.getSala()+"\n");
        description.append("Grupa : "+item.getGrupa()+"\n\n");

        description.append(opisy.get(item.getNazwa_przedmiotu()));

    }


    @Override
    public void onBackPressed() {

        finish();
    }
}
