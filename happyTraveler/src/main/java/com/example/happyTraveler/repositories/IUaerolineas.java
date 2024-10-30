package com.example.happyTraveler.repositories;


import com.example.happyTraveler.models.aerolineas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUaerolineas extends JpaRepository<aerolineas, Long>{
}
