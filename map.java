package com.harris.harriswifibuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class map extends AppCompatActivity {

    private static Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        onClickMap_to_MainButtonListener();
    }

    public void onClickMap_to_MainButtonListener() {

        back = (Button)findViewById(R.id.back_from_map);
        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.harris.wi_fibuddy.HomeScreen");
                        startActivity(intent);
                    }
                }
        );

    }
}
