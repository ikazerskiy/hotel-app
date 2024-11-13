package app.hotel.apartments.service.impl;

import app.hotel.apartments.api.request.CreateApartmentRequest;
import app.hotel.apartments.api.response.CreateApartmentResponse;
import app.hotel.apartments.service.ApartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ApartmentServiceImpl implements ApartmentService {

  @Override
  public CreateApartmentResponse addApartment(CreateApartmentRequest request) {
    log.info("create apartment: request {}", request);
    return null;
  }
}
