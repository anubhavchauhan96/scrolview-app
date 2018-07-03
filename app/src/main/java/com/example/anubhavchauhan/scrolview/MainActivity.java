package com.example.anubhavchauhan.scrolview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<String> data =new ArrayList<>();
    EditText text1,text2,text3,text4,text5,text6,text7,text8,text9,text10;
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.editText11);
        text2 = findViewById(R.id.editText12);
        text3 = findViewById(R.id.editText13);
        text4 = findViewById(R.id.editText14);
        text5 = findViewById(R.id.editText15);
        text6 = findViewById(R.id.editText16);
        text7 = findViewById(R.id.editText17);
        text8 = findViewById(R.id.editText18);
        text9 = findViewById(R.id.editText19);
        text10 = findViewById(R.id.editText20);
        btn = findViewById(R.id.button);
        textView=findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = text1.getText().toString();
                String fname = text2.getText().toString();
                String mname = text3.getText().toString();
                String address = text4.getText().toString();
                String city  = text5.getText().toString();
                String college = text6.getText().toString();
                String email = text7.getText().toString();
                String phone = text8.getText().toString();
                String age = text9.getText().toString();
                String branch = text10.getText().toString();
                data.add(name);
                data.add(fname);
                data.add(mname);
                data.add(address);
                data.add(city);
                data.add(college);
                data.add(email);
                data.add(phone);
                data.add(age);
                data.add(branch);

                for(int i=0; i<data.size();i++)
                {
                    textView.setText(textView.getText() + "info \n"+data.get(i));
                }
            }
        });
    }
}
