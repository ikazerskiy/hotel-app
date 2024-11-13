package app.hotel.apartments.api;

import java.util.UUID;

public record Apartment(
    UUID id,
    UUID hotelId,
    String number,
    int roomsCount,
    int floor,
    Status status,
    ApartmentLevel level) {

}
