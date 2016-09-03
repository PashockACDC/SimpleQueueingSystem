package com.example.pashock.simplequeueingsystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;

public class MainActivity extends Activity implements View.OnClickListener {

    static int n = 1;
    Button btn1;
    TableLayout tl1;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl1 = (TableLayout)findViewById(R.id.tl1);
        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn1:
                Button btn = new Button(this);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)btn1.getLayoutParams();
                
                btn.setLayoutParams(layoutParams);
                //btn.setText(n++);

                tl1.addView(btn);
                break;

        }
    }
}