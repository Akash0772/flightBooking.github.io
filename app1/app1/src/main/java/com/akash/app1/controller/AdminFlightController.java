package com.akash.app1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akash.app1.entity.Flight;
import com.akash.app1.service.FlightService;

@Controller
@RequestMapping("/admin/flights")
public class AdminFlightController {
    @Autowired
    private FlightService flightService;
    
    @GetMapping("/add")
    public String showAddFlightForm(Model model) {
        model.addAttribute("flight", new Flight());
        return "add-flight-form";
    }
    
    @PostMapping("/add")
    public String addFlight(@ModelAttribute("flight") Flight flight) {
        flightService.saveFlight(flight);
        return "redirect:/admin/flights";
    }
}

