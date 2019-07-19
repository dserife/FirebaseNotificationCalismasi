package com.example.firebasenotificationcalismasi.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.firebasenotificationcalismasi.R;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirebaseMessaging.getInstance().setAutoInitEnabled(true);
    }
}
