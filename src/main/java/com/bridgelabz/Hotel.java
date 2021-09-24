package com.bridgelabz;

public class Hotel {
    private String hotelName;
    private int weekDayRate;
    private int weekEndRate;

    public Hotel(String hotelName, int weekDayRate, int weekEndRate) {
        this.hotelName = hotelName;
        this.weekDayRate = weekDayRate;
        this.weekEndRate = weekEndRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public int getWeekEndRate() {
        return weekEndRate;
    }

    public void setWeekEndRate(int weekEndRate) {
        this.weekEndRate = weekEndRate;
    }
}
