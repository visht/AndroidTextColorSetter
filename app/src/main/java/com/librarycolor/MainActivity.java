package com.librarycolor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.textcolotlibrary.Util;

public class MainActivity extends AppCompatActivity {
    private Util util;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = new TextView(this);
        util.setColor(tv, R.color.colorPrimary, this);
    }
}
