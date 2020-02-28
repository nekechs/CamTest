package com.example.camtest;

public class TimeKeeper {

    long start = 0;
    long delay;

    public TimeKeeper(long delay) {
        this.delay = delay;
    }

    public void start() {
        this.start = System.currentTimeMillis();
    }

    public boolean isExpired() {
        return ((System.currentTimeMillis() - this.start) > this.delay);
    }

}
