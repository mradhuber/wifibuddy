package com.harris.harriswifibuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("calling activity");
    }

    Button back_from_settings = (Button)findViewById(R.id.back_from_settings);

    // settings button that launches settings activity from main
    public void onIntoSettingsClick(View view) {

        Intent getSettingsActivityFromMain = new Intent(this,
                MainActivity.class);

        final int result = 1;

        getSettingsActivityFromMain.putExtra("callingSettingsActivity", "settings");

        startActivity(getSettingsActivityFromMain);

    }

}
