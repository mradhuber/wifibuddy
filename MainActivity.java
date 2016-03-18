package com.harris.harriswifibuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // begin button handling
        Button net1 = (Button)findViewById(R.id.change_net_name);
        Button net2 = (Button)findViewById(R.id.net2);
        Button config = (Button)findViewById(R.id.config);
        Button settings = (Button)findViewById(R.id.settings);
        Button map = (Button)findViewById(R.id.map);

        net1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView conn_status = (TextView)findViewById(R.id.conn_status);
                        conn_status.setText("SUCCESS!");
                    }
                }
        );

        net2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView conn_status = (TextView)findViewById(R.id.conn_status);
                        conn_status.setText("FAILURE!");
                    }
                }
        );


        config.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        // navigate to desired page/interface
                    }
                }
        );

        map.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        // navigate to desired page/interface
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // back button returns from settings activity to main activity
    public void onSettingsBackClick(View view) {

        Intent getMainActivityFromSettings = new Intent(this,
                settings.class);

        final int result = 1;

        getMainActivityFromSettings.putExtra("callingMainActivity", "MainActivity");

        startActivity(getMainActivityFromSettings);

    }
}
