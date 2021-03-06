package com.company;

public class second {

    private int hour;
    private int min;
    private int second;

    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0);
        min = ((m >= 0 && m < 60) ? m : 0);
        second = ((s > 0 && s < 60) ? s : 0);
    }

    public String standTime() {
        return String.format("%02d:%02d:%02d", hour, min, second);
    }

    public String RegularTime(){
        return String.format("%d:%02d:%d %s",((hour==0|| hour==12)? 12:hour%12),min,second,(hour<12 ? "AM":"PM"));
    }
}
