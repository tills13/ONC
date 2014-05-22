package com.jseb.onc.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.jseb.onc.R;
import com.jseb.onc.objects.Device;

import java.util.ArrayList;

/**
 * Created by tills13 on 1/17/14.
 */
public class DeviceListAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<Device> devices;

    public DeviceListAdapter(Context context) {
        this.mContext = context;
        this.devices = new ArrayList<Device>();
        this.devices.add(new Device("1", "Oceanic 908", false));
        this.devices.add(new Device("2", "Oceanic 91", false));
        this.devices.add(new Device("3", "Oceanic 928", false));
        this.devices.add(new Device("4", "Oceanic 948", false));
        this.devices.add(new Device("5", "Oceanic 958", false));
        this.devices.add(new Device("6", "Oceanic 968", false));
        this.devices.add(new Device("7", "Oceanic 708", false));
        this.devices.add(new Device("8", "Oceanic 928", false));
        this.devices.add(new Device("9", "Oceanic 938", false));
        this.devices.add(new Device("10", "Oceanic 948", false));
        this.devices.add(new Device("11", "Oceanic 208", false));
        this.devices.add(new Device("12", "Oceanic 904", false));
        this.devices.add(new Device("13", "Oceanic 938", false));
        this.devices.add(new Device("14", "Oceanic 208", false));
        this.devices.add(new Device("15", "Oceanic 908", false));
        this.devices.add(new Device("16", "Oceanic 948", false));
        this.devices.add(new Device("17", "Oceanic 508", false));
        this.devices.add(new Device("18", "Oceanic 968", false));
        this.devices.add(new Device("19", "Oceanic 907", false));
        this.devices.add(new Device("20", "Oceanic 9048", false));
        this.devices.add(new Device("21", "Oceanic 938", false));
        this.devices.add(new Device("22", "Oceanic 308", false));
        this.devices.add(new Device("23", "Oceanic 938", false));
        this.devices.add(new Device("24", "Oceanic 208", false));
        this.devices.add(new Device("25", "Oceanic 918", false));
        this.devices.add(new Device("26", "Oceanic 904", false));
        this.devices.add(new Device("27", "Oceanic 928", false));
        this.devices.add(new Device("28", "Oceanic 408", false));
        this.devices.add(new Device("29", "Oceanic 906", false));
        this.devices.add(new Device("30", "Oceanic 9038", false));
        this.devices.add(new Device("31", "Oceanic 9068", false));
        this.devices.add(new Device("32", "Oceanic 9083", false));
    }

    @Override
    public int getCount() {
        return this.devices.size();
    }

    @Override
    public Device getItem(int position) {
        return devices.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.device_list_item, null);

        TextView title = (TextView) view.findViewById(R.id.title);
        TextView id = (TextView) view.findViewById(R.id.id);
        RatingBar fav = (RatingBar) view.findViewById(R.id.star);

        title.setText(getItem(position).title);
        id.setText("ID: " + getItem(position).id);
        fav.setNumStars(getItem(position).isFav ? 1 : 0);

        return view;
    }
}
