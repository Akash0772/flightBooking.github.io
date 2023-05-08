package com.akash.app1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightName;
    private int sheet;
    private double price;
    
    // getters and setters, constructor, etc.
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getSheet() {
		return sheet;
	}
	public void setSheet(int sheet) {
		this.sheet = sheet;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", flightName=" + flightName + ", sheet=" + sheet + ", price=" + price + "]";
	}
}

