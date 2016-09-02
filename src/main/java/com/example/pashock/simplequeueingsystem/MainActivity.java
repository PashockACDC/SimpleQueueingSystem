package com.example.pashock.simplequeueingsystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends Activity implements View.OnClickListener {

    TableLayout tl;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl = new TableLayout(this);

    }

    @Override
    public void onClick(View view) {

    }
}