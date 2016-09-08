package com.example.pashock.simplequeueingsystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    static int n = 1;
    TextView tv;
    TableLayout[] tl;
    TableRow tableRow;
    ImageView[] imageViews;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl = new TableLayout[4];
        imageViews =  new ImageView[4];
        for (int i = 0; i < 4; i++) {
            tl[i] = new TableLayout(this);
            imageViews[i] = new ImageView(this);
        }
        tl[0] = (TableLayout)findViewById(R.id.tl1);
        tl[1] = (TableLayout)findViewById(R.id.tl2);
        tl[2] = (TableLayout)findViewById(R.id.tl3);
        tl[3] = (TableLayout)findViewById(R.id.tl4);
        tableRow = (TableRow)findViewById(R.id.tr1);
        imageViews[0] = (ImageView)findViewById(R.id.image_Device_1);
        imageViews[1] = (ImageView)findViewById(R.id.image_Device_2);
        imageViews[2] = (ImageView)findViewById(R.id.image_Device_3);
        imageViews[3] = (ImageView)findViewById(R.id.image_Device_4);

        for (int i = 0; i < 4; i++)
            imageViews[i].setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.image_Device_1:
            case R.id.image_Device_2:
            case R.id.image_Device_3:
            case R.id.image_Device_4:
                tv = new TextView(this);
                TableLayout.LayoutParams layoutParams = (TableLayout.LayoutParams)tableRow.getLayoutParams();
                tv.setLayoutParams(layoutParams);
                tv.setText("request # " + String.valueOf(n++));
                float textSize = this.getResources().getDimension(R.dimen.regular_text_in_table);
                tv.setTextSize(textSize);
                tv.setVisibility(View.VISIBLE);
                switch (view.getId()) {
                    case R.id.image_Device_1:
                        tl[0].addView(tv);
                        break;
                    case R.id.image_Device_2:
                        tl[1].addView(tv);
                        break;
                    case R.id.image_Device_3:
                        tl[2].addView(tv);
                        break;
                    case R.id.image_Device_4:
                        tl[3].addView(tv);
                        break;
                }
                break;

        }
    }

}