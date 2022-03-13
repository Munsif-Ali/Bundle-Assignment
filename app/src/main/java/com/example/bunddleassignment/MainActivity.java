package com.example.bunddleassignment;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nameField=(EditText) findViewById(R.id.nameField);
        EditText ageField=(EditText) findViewById(R.id.ageField);
        EditText phoneField=(EditText) findViewById(R.id.phoneField);
        Button sendButton=(Button) findViewById(R.id.button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("name",nameField.getText().toString());
                bundle.putString("age",ageField.getText().toString());
                bundle.putString("phone",phoneField.getText().toString());
                Intent myIntent=new Intent(MainActivity.this,SecondActivity.class);
                myIntent.putExtras(bundle);
                startActivity(myIntent);
            }
        });
    }
}