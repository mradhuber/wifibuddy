package com.harris.harriswifibuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class change_net_name extends AppCompatActivity {

    private static Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_net_name);
        onClickBack_From_Net_NameButtonListener();
    }

    public void onClickBack_From_Net_NameButtonListener() {

        cancel = (Button)findViewById(R.id.back_from_net_name);
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
