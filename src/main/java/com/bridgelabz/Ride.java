package com.bridgelabz;

public class Ride {

    public double distance;
    public int time;
    public RideCategory category;

    public Ride(double distance, int time) {
        this(distance, time, RideCategory.NORMAL);
    }

    public Ride(double distance, int time, RideCategory category) {
        this.distance = distance;
        this.time = time;
        this.category = category;
    }
}