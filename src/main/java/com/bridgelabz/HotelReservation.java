package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

/**
 * Purpose : To create Hotel Reservation System
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-09-23
 */
public class HotelReservation {
    private final List<Hotel> hotels;

    public static void main(String[] args) {
        System.out.println("Welcome To Miami Hotel Reservation System");
    }

    public HotelReservation() {
        this.hotels = new ArrayList<>();
    }

    /**
     * Purpose : Method to add hotels details to the Hotel List
     * @return the hotel details
     */
    public boolean addHotel(Hotel hotel) {
        return this.hotels.add(hotel);
    }
}
