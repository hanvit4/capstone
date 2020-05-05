package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class set_filter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_filter);

        Button b_disease_select = (Button) findViewById(R.id.disease_select);
        b_disease_select.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(set_filter.this, disease_select.class);
                startActivity(intent);
            }
        });

        Button b_region_select = (Button) findViewById(R.id.region_select);
        b_region_select.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(set_filter.this, region_select.class);
                startActivity(intent);
            }
        });

    }


}
