package com.example.oxsama.senddatafromactivitytoanother;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_activity extends AppCompatActivity {

    TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        receiver_msg = (TextView)findViewById(
                R.id.received_value_id);

        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first
        // activity
        String str = intent.getStringExtra("message_key");

        // display the string into textView
        receiver_msg.setText(str);
    }
}