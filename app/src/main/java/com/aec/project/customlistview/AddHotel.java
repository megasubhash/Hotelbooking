package com.aec.project.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.MediaStore;
import android.provider.SyncStateContract;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.net.ProtocolException;
import java.net.URLEncoder;
import java.util.UUID;

import static android.Manifest.permission.CAMERA;

public class AddHotel extends AppCompatActivity{

    Button buttonUpload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hotel);

        buttonUpload = (Button) findViewById(R.id.btn_add);
        setTitle("ADD HOTEL");

    }
}
