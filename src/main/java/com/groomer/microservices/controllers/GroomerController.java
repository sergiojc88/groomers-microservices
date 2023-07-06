package com.groomer.microservices.controllers;

import com.groomer.microservices.model.Groomer;
import com.groomer.microservices.service.GroomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class GroomerController {

    @Autowired
    GroomerService groomerService;

    @GetMapping("/all")
    public ArrayList<Groomer> getAllGroomer() {
        return groomerService.getAllGroomer();
    }

    @GetMapping("/find/{id}")
    public Optional<Groomer> getGroomerById(@PathVariable("id") long id) {
        return groomerService.getGroomerById(id);
    }

    @PostMapping("/save")
    public Groomer save(@RequestBody Groomer g) {
        return groomerService.save(g);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        if(groomerService.delete(id))
            return "Delete Successfully";
        else
            return "Something happen on Deleting";
    }
}
