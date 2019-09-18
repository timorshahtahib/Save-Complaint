package com.poraan.Learn.Spring.service;


import com.poraan.Learn.Spring.model.Comita;

public interface ComitaService {
    void saveComita(Comita comita);

    Object findAll();

    Comita findComitaById(Long id);

    void deleteComitaById(Long id);
}
