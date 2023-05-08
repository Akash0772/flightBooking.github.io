package com.akash.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.app1.entity.Flight;
import com.akash.app1.repository.FlightRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;
    
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }
    
    public Flight getFlightById(Long id) {
        return flightRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Flight not found with id " + id));
    }
    
    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}

