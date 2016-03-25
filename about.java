package com.harris.harriswifibuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about extends AppCompatActivity {

    private static Button about_to_settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        onClickAbout_to_SettingsButtonListener();
    }

    public void onClickAbout_to_SettingsButtonListener() {

        about_to_settings = (Button)findViewById(R.id.about_to_settings);
        about_to_settings.setOnClickListener(
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
