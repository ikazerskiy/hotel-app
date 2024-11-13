package app.hotel.apartments.controller;

import app.hotel.apartments.api.request.CreateApartmentRequest;
import app.hotel.apartments.api.response.CreateApartmentResponse;

import app.hotel.apartments.service.ApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("api/apartments")
public class ApartmentController {

  private final ApartmentService apartmentService;

  @PostMapping
  public ResponseEntity<CreateApartmentResponse> addApartment(
      @RequestBody CreateApartmentRequest request) {
    return ResponseEntity.ok(apartmentService.addApartment(request));
  }

}
