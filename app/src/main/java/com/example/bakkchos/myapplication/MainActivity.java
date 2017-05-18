package com.example.bakkchos.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.File;


public class MainActivity extends AppCompatActivity {
    String message;
    public static String EXTRA_MESSAGE1 = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void next_button(View v){
        Intent intent = new Intent(this, Subjects.class);
        EXTRA_MESSAGE1 = "1";
        intent.putExtra(EXTRA_MESSAGE1,"1");
        startActivity(intent);
    }
    public void next_button2(View v){
        Intent intent = new Intent(this, Subjects.class);
        EXTRA_MESSAGE1 = "2";
        intent.putExtra(EXTRA_MESSAGE1,"2");
        startActivity(intent);
    }
}
