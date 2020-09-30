/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehicles.Vehicle;

/**
 *
 * @author marl8n
 */
public class PickUp extends Car{
    
    public PickUp () {
        
    }

    public PickUp(Integer passengersNumber, Integer numberOfDoors, String motor, String typeOfGasoline, Integer kilometers, String licensePlate, String model, String brand) {
        super(passengersNumber, numberOfDoors, motor, typeOfGasoline, kilometers, licensePlate, model, brand);
    }

    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
