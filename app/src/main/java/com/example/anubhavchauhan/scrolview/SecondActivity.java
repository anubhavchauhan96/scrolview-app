package com.example.anubhavchauhan.scrolview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ArrayList<String> data = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        Intent intent = getIntent();
        data.add(intent.getStringExtra("data"));

        TextView textView;
        textView = findViewById(R.id.textView);

        for (int i = 0; i < data.size(); i++) {
            textView.setText(data.get(i)+"\n");
        }

    }
}