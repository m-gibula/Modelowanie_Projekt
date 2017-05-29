package com.example.bakkchos.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    String message;
    public static String EXTRA_MESSAGE1 = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CustomMain(this));

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
