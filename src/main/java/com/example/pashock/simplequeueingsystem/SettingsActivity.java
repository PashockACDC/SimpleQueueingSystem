package com.example.pashock.simplequeueingsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pashock on 09.09.2016.
 */
public class SettingsActivity extends Activity implements View.OnClickListener {

    EditText et_max;
    EditText et_interval;
    Button btnBackToMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_settings);

        et_max = (EditText)findViewById(R.id.et_max);
        et_interval = (EditText)findViewById(R.id.et_interval);
        btnBackToMain = (Button)findViewById(R.id.bntBackToMain);

        Intent intent = getIntent();
        int[] data = intent.getIntArrayExtra("max_req and interval");
        et_max.setText(String.valueOf(data[0]));
        et_interval.setText(String.valueOf(data[1]));

        btnBackToMain.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.bntBackToMain:
                int[] data = new int[2];
                try {
                    data[0] = Integer.parseInt(et_max.getText().toString());
                    data[1] = Integer.parseInt(et_interval.getText().toString());
                } catch (NumberFormatException ex) {
                    Toast.makeText(this, "Пустой ввод!", Toast.LENGTH_SHORT).show();
                    return;  //don't exit while empty input
                }
                Intent intent = new Intent();
                intent.putExtra("max_req and interval", data);
                setResult(RESULT_OK, intent);
                finish();

        }
    }


//    @Override
//    protected void onDestroy() {
//        if(!MainActivity.checkFirst) {
//            MainActivity.checkFirst = true;
//        }
//        try {
//            MainActivity.max_Requests = Integer.parseInt(et_max.getText().toString());
//            MainActivity.interval = Integer.parseInt(et_interval.getText().toString());
//        }
//        catch (NumberFormatException ex) {
//            Toast.makeText(this, "Пустой ввод!", Toast.LENGTH_SHORT).show();
//            return;
//        }
//        super.onDestroy();
//    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if(!MainActivity.checkFirst) {
//            MainActivity.checkFirst = true;
//        }
        try {
            MainActivity.max_Requests = Integer.parseInt(et_max.getText().toString());
            MainActivity.interval = Integer.parseInt(et_interval.getText().toString());
        }
        catch (NumberFormatException ex) {
            Toast.makeText(this, "Пустой ввод!", Toast.LENGTH_SHORT).show();
            return false;  //don't exit while empty input
        }
        super.onDestroy();
        return super.onKeyDown(keyCode, event);
    }
}
