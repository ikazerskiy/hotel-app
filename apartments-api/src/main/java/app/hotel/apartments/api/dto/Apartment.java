package app.hotel.apartments.api.dto;

public record Apartment(
    String number,
    int roomsCount,
    int floor,
    Status status,
    ApartmentLevel level) {

}
