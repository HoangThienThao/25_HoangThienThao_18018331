package com.example.a25_hoangthienthao_18018331;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen7 extends AppCompatActivity {

    Button btn_xembill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen7);

        btn_xembill = findViewById(R.id.button_xembill);
        btn_xembill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen7.this, Screen3.class);
                startActivity(it);
            }
        });
    }
}