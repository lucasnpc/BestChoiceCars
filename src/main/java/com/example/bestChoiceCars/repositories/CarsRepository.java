package com.example.bestChoiceCars.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bestChoiceCars.model.Car;

@Repository
public interface CarsRepository extends JpaRepository<Car, UUID> {

}
