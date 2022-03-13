package com.example.bunddleassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        TextView name=(TextView) findViewById(R.id.name);
        TextView age=(TextView) findViewById(R.id.age);
        TextView phone=(TextView) findViewById(R.id.phone);
                Bundle bundle=getIntent().getExtras();
                if(bundle!=null){
                    name.setText("Name:"+bundle.getString("name"));
                    age.setText("Age:"+bundle.getString("age"));
                    phone.setText("Phone:"+bundle.getString("phone"));
                }

            }
}
