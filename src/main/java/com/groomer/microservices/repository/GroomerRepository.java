package com.groomer.microservices.repository;

import com.groomer.microservices.model.Groomer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroomerRepository extends CrudRepository<Groomer, Long> {
}
