package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();
    Hotel hotel1 = hotelReservation.addHotel("Lakewood", 110);
    Hotel hotel2 = hotelReservation.addHotel("Bridgewood", 160);
    Hotel hotel3 = hotelReservation.addHotel("Ridgewood", 220);

    @Test
    void givenHotelDetails_WhenAddedHotelName_ShouldReturnEnteredName() {
        Assertions.assertEquals(hotel1.getHotelName(),"Lakewood");
        Assertions.assertEquals(hotel2.getHotelName(),"Bridgewood");
        Assertions.assertEquals(hotel3.getHotelName(),"Ridgewood");
    }

    @Test
    void givenHotelDetails_WhenAddedWeekDayRate_ShouldReturnEnteredWeekDayRate() {
        Assertions.assertEquals(hotel1.getWeekDayRate(),110);
        Assertions.assertEquals(hotel2.getWeekDayRate(),160);
        Assertions.assertEquals(hotel3.getWeekDayRate(),220);
    }
}
