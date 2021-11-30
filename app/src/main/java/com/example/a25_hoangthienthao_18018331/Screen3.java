package com.example.a25_hoangthienthao_18018331;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity {

    private Button btn_tinhtien;
    private TextView tv_tinhtien;
    private ImageView imv_question;

    private ServiceConnection serviceConnection;
    private boolean isConnected;
    private TinhTienService tinhTienService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        initView();

        connectService();

        btn_tinhtien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isConnected){
                    return;
                }
                tv_tinhtien.setVisibility(View.VISIBLE);
                tv_tinhtien.setText(tinhTienService.tinhTien());
                imv_question.setVisibility(View.INVISIBLE);
            }
        });

    }

    @Override
    protected void onDestroy() {
        unbindService(serviceConnection);
        super.onDestroy();
    }

    private void initView() {
        btn_tinhtien = findViewById(R.id.button_tinhtien);
        tv_tinhtien = findViewById(R.id.tv_tinhtien);
        tv_tinhtien.setVisibility(View.INVISIBLE);
        imv_question = findViewById(R.id.imv_question);
    }

    private void connectService() {

        Intent intent = new Intent(this, TinhTienService.class);

        serviceConnection = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                TinhTienService.TinhTien myBinder = (TinhTienService.TinhTien) service;

                tinhTienService = myBinder.getService();
                isConnected = true;
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                isConnected = false;
                tinhTienService = null;
            }
        };
        bindService(intent, serviceConnection, BIND_AUTO_CREATE);
    }
}