package com.poraan.Learn.Spring.repository;


import com.poraan.Learn.Spring.model.Comita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComitaRepository extends JpaRepository <Comita, Long> {
}
