package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_go_disease_select = (Button) findViewById(R.id.go_disease_select);
        b_go_disease_select.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, disease_select.class);
                startActivity(intent);
            }
        });

        Button b_go_region_select = (Button) findViewById(R.id.go_region_select);
        b_go_region_select.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, region_select.class);
                startActivity(intent);
            }
        });
    }
}
