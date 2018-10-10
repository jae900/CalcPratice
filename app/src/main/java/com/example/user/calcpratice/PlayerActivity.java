package com.example.user.calcpratice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.music);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
    }
}
