package com.groomer.microservices.service;

import com.groomer.microservices.model.Groomer;
import com.groomer.microservices.repository.GroomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class GroomerServicesImpl implements GroomerService{

    @Autowired
    GroomerRepository groomerRepository;

    @Override
    public ArrayList<Groomer> getAllGroomer() {
        return (ArrayList<Groomer>) groomerRepository.findAll();
    }

    @Override
    public Optional<Groomer> getGroomerById(long id) {
        return groomerRepository.findById(id);
    }

    @Override
    public Groomer save(Groomer g) {
        return groomerRepository.save(g);
    }

    @Override
    public boolean delete(long id) {
        try {
            Optional<Groomer> g = getGroomerById(id);
            groomerRepository.delete(g.get());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
