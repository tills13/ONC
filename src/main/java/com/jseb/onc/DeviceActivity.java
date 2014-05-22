package com.jseb.onc;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.jseb.onc.objects.Device;

/**
 * Created by tills13 on 1/17/14.
 */
public class DeviceActivity extends Activity {
    public static Device mDevice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.device_view);

        getActionBar().setTitle(mDevice.title);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        populateInfo();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void populateInfo() {
        TextView location = (TextView) findViewById(R.id.location);
        TextView latitude = (TextView) findViewById(R.id.latitude);
        TextView longitude = (TextView) findViewById(R.id.longitude);
        TextView depth = (TextView) findViewById(R.id.depth);
        TextView updated = (TextView) findViewById(R.id.update);
        TextView icetemp50 = (TextView) findViewById(R.id.icetemp50);
        TextView icetemp100 = (TextView) findViewById(R.id.icetemp100);
        TextView icetemp150 = (TextView) findViewById(R.id.icetem150);
        TextView icetemp200 = (TextView) findViewById(R.id.icetemp200);
        TextView voltage = (TextView) findViewById(R.id.voltage);
        TextView airtemp = (TextView) findViewById(R.id.airtemp);
        TextView surfacetemp = (TextView) findViewById(R.id.surfacetemp);

        location.setText("Location: " + mDevice.location);
        latitude.setText("Latitude: " + mDevice.latitude);
        longitude.setText("Longitude: " + mDevice.longitude);
        depth.setText("Depth: " + mDevice.depth);
        updated.setText("Updated " + mDevice.updated + " hours ago");
        icetemp50.setText("Ice Temp. (50m): " + mDevice.icetemp50);
        icetemp100.setText("Ice Temp. (100m): " + mDevice.icetemp100);
        icetemp150.setText("Ice Temp. (150m): " + mDevice.icetemp150);
        icetemp200.setText("Ice Temp. (2000m): " + mDevice.icetemp200);
        voltage.setText("Voltage: " + mDevice.voltage);
        airtemp.setText("Air Temp.: " + mDevice.airtemp);
        surfacetemp.setText("Surface Temp: " + mDevice.surfacetemp);

    }
}
