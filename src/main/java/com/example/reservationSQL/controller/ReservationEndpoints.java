package com.example.reservationSQL.controller;

import com.example.reservationSQL.entity.Reservation;
import com.example.reservationSQL.repository.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(ReservationEndpoints.ROOM_V_1_RESERVATION)
@CrossOrigin
public class ReservationEndpoints {

    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    private static final Logger LOGGER = LoggerFactory.getLogger(ReservationEndpoints.class);

    private String a;

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reservation> getAllReservation(){
        LOGGER.debug("GET all reservation");
        a = "it's here";
        System.out.println(a);
        LOGGER.info("The following is for testing to print object {}", a);
        return (List<Reservation>) reservationRepository.findAll();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoSuchElementException.class)
    public String return400(NoSuchElementException ex){
        LOGGER.error("Unable to find the response for the respective request", ex);
        return ex.getMessage();
    }

}
