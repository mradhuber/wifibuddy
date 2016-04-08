package com.harris.harriswifibuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {

    private static Button settings_to_main, settings_to_about, change_net_name, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        // button click methods
        onClickSettings_to_MainButtonListener();
        onClickSettings_to_AboutButtonListener();
        onClickSettings_to_NetNameButtonListener();
        onClickSettings_to_NetPwordButtonListener();
    }

    public void onClickSettings_to_MainButtonListener() {

        settings_to_main = (Button)findViewById(R.id.settings_to_main);
        settings_to_main.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.harris.wi_fibuddy.HomeScreen");
                        startActivity(intent);
                    }
                }
        );

    }

    public void onClickSettings_to_AboutButtonListener() {

        settings_to_about = (Button)findViewById(R.id.about);
        settings_to_about.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.harris.harriswifibuddy.about");
                        startActivity(intent);
                    }
                }
        );

    }

    public void onClickSettings_to_NetNameButtonListener() {

        change_net_name = (Button)findViewById(R.id.change_net_name);
        change_net_name.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.harris.harriswifibuddy.change_net_name");
                        startActivity(intent);
                    }
                }
        );

    }

    public void onClickSettings_to_NetPwordButtonListener() {

        password = (Button)findViewById(R.id.change_net_password);
        password.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.harris.harriswifibuddy.change_net_password");
                        startActivity(intent);
                    }
                }
        );

    }
}
