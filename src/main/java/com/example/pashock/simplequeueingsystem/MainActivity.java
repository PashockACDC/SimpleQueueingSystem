package com.example.pashock.simplequeueingsystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    static int n = 1;
    TableLayout tl1;
    TableRow tableRow;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl1 = (TableLayout)findViewById(R.id.tl1);
        tableRow = (TableRow)findViewById(R.id.tr1);

        tableRow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.tr1:
                TextView tv = new TextView(this);
                TableLayout.LayoutParams layoutParams = (TableLayout.LayoutParams)tableRow.getLayoutParams();

                tv.setLayoutParams(layoutParams);
                tv.setText("request # " + String.valueOf(n++));

                tl1.addView(tv);
                break;

        }
    }
}