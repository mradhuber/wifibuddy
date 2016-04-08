package com.harris.harriswifibuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class change_net_password extends AppCompatActivity {

    private static Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_net_password);
        onClickBack_From_Net_PwordButtonListener();
    }

    public void onClickBack_From_Net_PwordButtonListener() {

        cancel = (Button)findViewById(R.id.back_from_change_pword);
        cancel.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.harris.harriswifibuddy.settings");
                        startActivity(intent);
                    }
                }
        );

    }
}
