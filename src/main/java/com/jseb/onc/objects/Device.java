package com.jseb.onc.objects;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by tills13 on 1/17/14.
 */
public class Device {
    public String id;
    public String title;
    public boolean isFav;
    public String location;
    public double latitude;
    public double longitude;
    public double depth;
    public double updated;
    public double icetemp50;
    public double icetemp100;
    public double icetemp150;
    public double icetemp200;
    public double voltage;
    public double airtemp;
    public double surfacetemp;

    public Device(String id, String title, boolean isFav) {
        this.id = id;
        this.title = title;
        this.isFav = isFav;
        location = Arrays.asList("Peel Bay", "Cambrige Bay", "Straight of Juan de Fuca", "Marine Technology Center").get(new Random().nextInt(4));
        latitude = new Random().nextDouble();
        longitude = new Random().nextDouble();
        depth = new Random().nextDouble();
        updated = new Random().nextInt(1000);
        icetemp50 = new Random().nextDouble();
        icetemp100 = new Random().nextDouble();
        icetemp150 = new Random().nextDouble();
        icetemp200 = new Random().nextDouble();
        voltage = new Random().nextDouble();
        airtemp = new Random().nextDouble();
        surfacetemp = new Random().nextDouble();
    }
}
