package com.example.diary_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class data extends AppCompatActivity {

    android.widget.TextView TextView;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);

        TextView=findViewById(R.id.data);

        Intent intent=getIntent();
        Bundle bundle = intent.getExtras();
        String datePicker = bundle.getString("datePicker");
        String edtDiary = bundle.getString("edtDiary");

        TextView.setText(datePicker+ "\n"+edtDiary);
    }
}
