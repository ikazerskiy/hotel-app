package app.hotel.apartments.api.request;

import app.hotel.apartments.api.ApartmentLevel;
import java.util.UUID;

public record CreateApartmentRequest(
    UUID hotelId,
    String number,
    int roomsCount,
    int floor,
    ApartmentLevel level
) {

}
