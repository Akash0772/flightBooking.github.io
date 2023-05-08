package com.akash.app1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akash.app1.entity.Booking;
import com.akash.app1.repository.BookingRepository;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}

