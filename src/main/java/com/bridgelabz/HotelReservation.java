package com.bridgelabz;

/**
 * Purpose : To create Hotel Reservation System
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-09-23
 */
public class HotelReservation {
    public static void main(String[] args) {
        System.out.println("Welcome To Miami Hotel Reservation System");
    }

    /**
     * Purpose : Method to add hotels details with name and rates for regular customer
     * @param hotelName  takes name of the hotel as first argument
     * @param weekDayRate takes week day rate of hotels as second argument
     * @return  the hotel details as name and week day rates.
     */
    public Hotel addHotel(String hotelName, int weekDayRate) {
        return new Hotel(hotelName, weekDayRate);
    }
}
