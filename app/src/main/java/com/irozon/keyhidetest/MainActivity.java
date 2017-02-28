package com.irozon.keyhidetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.irozon.library.HideKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HideKey.initialize(this);
    }
}
