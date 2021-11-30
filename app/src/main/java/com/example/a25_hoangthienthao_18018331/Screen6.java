package com.example.a25_hoangthienthao_18018331;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Screen6 extends AppCompatActivity {

    ImageView imv_ban01, imv_ban02, imv_ban03, imv_ban04, imv_ban05, imv_ban06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);

        imv_ban01 = findViewById(R.id.imv_ban01);
        imv_ban02 = findViewById(R.id.imv_ban02);
        imv_ban03 = findViewById(R.id.imv_ban03);
        imv_ban04 = findViewById(R.id.imv_ban04);
        imv_ban05 = findViewById(R.id.imv_ban05);
        imv_ban06 = findViewById(R.id.imv_ban06);


        imv_ban01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen6.this, Screen7.class);
                startActivity(it);
            }
        });

        imv_ban02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen6.this, Screen7.class);
                startActivity(it);
            }
        });

        imv_ban03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen6.this, Screen7.class);
                startActivity(it);
            }
        });

        imv_ban04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen6.this, Screen7.class);
                startActivity(it);
            }
        });

        imv_ban05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen6.this, Screen7.class);
                startActivity(it);
            }
        });

        imv_ban06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen6.this, Screen7.class);
                startActivity(it);
            }
        });
    }
}