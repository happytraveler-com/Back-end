package com.example.happyTraveler.repositories;

import com.example.happyTraveler.models.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUusuarios extends JpaRepository<usuarios, Long> {
}
