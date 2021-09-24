package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    void givenHotelDetails_WhenAddedHotelDetails_ShouldReturnHotelDetails() {
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("Lakewood", 110, 90)));
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("Bridgewood", 150, 50)));
        Assertions.assertTrue(hotelReservation.addHotel(new Hotel("Ridgewood", 220, 150)));
    }

    @Test
    void toFindTheCheapestHotel() {
        hotelReservation.findCheapestHotel();
    }
}
