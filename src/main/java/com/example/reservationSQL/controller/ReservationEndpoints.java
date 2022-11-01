package com.example.reservationSQL.controller;

import com.example.reservationSQL.entity.Reservation;
import com.example.reservationSQL.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ReservationEndpoints.ROOM_V_1_RESERVATION)
@CrossOrigin
public class ReservationEndpoints {

    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    private String a;

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reservation> getAllReservation(){
        a = "it's here";
        System.out.println(a);
        return (List<Reservation>) reservationRepository.findAll();
    }

}
