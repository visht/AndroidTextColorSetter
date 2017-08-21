package com.vishalsdks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sdktextcolor.Util;

public class MainActivity extends AppCompatActivity {
    private Util util;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        util = new Util();
        util.setColor(findViewById(R.id.tv), R.color.colorPrimary, this);
    }
}
