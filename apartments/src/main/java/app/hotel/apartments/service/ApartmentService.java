package app.hotel.apartments.service;

import app.hotel.apartments.api.request.CreateApartmentRequest;
import app.hotel.apartments.api.response.CreateApartmentResponse;

public interface ApartmentService {
  CreateApartmentResponse addApartment(CreateApartmentRequest request);
}
