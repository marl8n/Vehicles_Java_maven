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
public class Autobus extends Vehicle{

    private String typeOfGasoline;
    private String motor;
    private String numberOfPassengers;

    public Autobus(String typeOfGasoline, String motor, String numberOfPassengers, String licensePlate, String model, String brand) {
        super(licensePlate, model, brand);
        this.typeOfGasoline = typeOfGasoline;
        this.motor = motor;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getTypeOfGasoline() {
        return typeOfGasoline;
    }

    public String getMotor() {
        return motor;
    }

    public String getNumberOfPassengers() {
        return numberOfPassengers;
    }
    
    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
