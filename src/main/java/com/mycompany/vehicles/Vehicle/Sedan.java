package com.mycompany.vehicles.Vehicle;


import com.mycompany.vehicles.Vehicle.Car;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marl8n
 */
public class Sedan extends Car {
    
    public Sedan () {
        
    }
    
    public Sedan(Integer passengersNumber, Integer numberOfDoors, String motor, String typeOfGasoline, Integer kilometers, String licensePlate, String model, String brand) {
        super(passengersNumber, numberOfDoors, motor, typeOfGasoline, kilometers, licensePlate, model, brand);
    }
    
    

    public String getInfo() {
        return "Vehiculo: Sedan, Modelo: " + this.model + " \n" + "";
    }
    
}
