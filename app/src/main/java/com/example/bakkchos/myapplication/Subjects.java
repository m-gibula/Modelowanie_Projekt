package com.example.bakkchos.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.bakkchos.myapplication.util.Schedule;
import com.example.bakkchos.myapplication.util.Subject;
import com.example.bakkchos.myapplication.util.SubjectAdapter;

import java.util.ArrayList;
import java.util.Calendar;

public class Subjects extends AppCompatActivity {
    public static String extPOSITION = "position";
    public static String EXTRA_MESSAGE1 = "";
    public static String dzien_obecny = "";
    public static String grupa = "";
    TextView text;
    String group;
    String show_day;
    private static final String PON = "PONIEDZIALEK";
    private static final String WT = "WTOREK";
    private static final String SR = "SRODA";
    private static final String CZW = "CZWARTEK";
    private static final String PT = "PIATEK";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        Intent intent = getIntent();
        group = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case Calendar.MONDAY:
                show_day = PON;
                break;
            case Calendar.TUESDAY:
                show_day = WT;
                break;
            case Calendar.WEDNESDAY:
                show_day = SR;
                break;
            case Calendar.THURSDAY:
                show_day = CZW;
                break;
            case Calendar.FRIDAY:
                show_day = PT;
                break;
        }
        Schedule harm = new Schedule();
        ArrayList<Subject> today = harm.byDaySchedule(show_day);
        ArrayList<Subject> today_and_group = harm.groupSchedule(today, group);

        SubjectAdapter adapter = new SubjectAdapter(this, today_and_group);
        ListView listView = (ListView) findViewById(R.id.lista);
        listView.setAdapter(adapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(parent.getContext(), subjectDetails.class);
                dzien_obecny+=show_day;
                grupa+=group;
                EXTRA_MESSAGE1  +=position;
                intent.putExtra(EXTRA_MESSAGE1,EXTRA_MESSAGE1);
                intent.putExtra(dzien_obecny,dzien_obecny);
                intent.putExtra(grupa,grupa);
                startActivity(intent);

            }
        });


    }
}
