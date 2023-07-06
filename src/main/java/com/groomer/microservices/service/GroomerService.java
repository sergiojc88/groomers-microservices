package com.groomer.microservices.service;

import com.groomer.microservices.model.Groomer;

import java.util.ArrayList;
import java.util.Optional;

public interface GroomerService {

    ArrayList<Groomer> getAllGroomer();
    Optional<Groomer> getGroomerById(long id);
    Groomer save(Groomer g);
    boolean delete(long id);
}
