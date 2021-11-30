package com.example.a25_hoangthienthao_18018331;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Screen2 extends AppCompatActivity {

    ImageView imv_ban1, imv_ban2, imv_ban3, imv_ban4, imv_ban5, imv_ban6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        imv_ban1 = findViewById(R.id.imv_ban01);
        imv_ban2 = findViewById(R.id.imv_ban02);
        imv_ban3 = findViewById(R.id.imv_ban3);
        imv_ban4 = findViewById(R.id.imv_ban04);
        imv_ban5 = findViewById(R.id.imv_ban05);
        imv_ban6 = findViewById(R.id.imv_ban06);

        imv_ban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen2.this, Screen3.class);
                startActivity(it);
            }
        });

        imv_ban2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen2.this, Screen3.class);
                startActivity(it);
            }
        });

        imv_ban3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen2.this, Screen3.class);
                startActivity(it);
            }
        });

        imv_ban4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen2.this, Screen3.class);
                startActivity(it);
            }
        });

        imv_ban5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen2.this, Screen3.class);
                startActivity(it);
            }
        });

        imv_ban6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Screen2.this, Screen3.class);
                startActivity(it);
            }
        });
    }
}