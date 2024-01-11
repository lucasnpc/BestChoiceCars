package com.example.bestChoiceCars.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bestChoiceCars.model.Car;

@Repository
public interface CarsRepository extends JpaRepository<Car, UUID> {

    @Query("SELECT DISTINCT c.brand FROM Car c")
    List<String> findDistinctBrands();

}
