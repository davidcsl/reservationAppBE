package com.example.reservationSQL.repository;


import com.example.reservationSQL.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,String> {
}
