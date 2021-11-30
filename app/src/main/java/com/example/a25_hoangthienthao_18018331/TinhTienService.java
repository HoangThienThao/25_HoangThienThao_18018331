package com.example.a25_hoangthienthao_18018331;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class TinhTienService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new TinhTien();
    }


    public class TinhTien extends Binder {
        public TinhTienService getService(){
            return TinhTienService.this;
        };
    }

    public String tinhTien(){
        return "107k";
    }
}
