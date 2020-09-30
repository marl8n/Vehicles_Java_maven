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
public abstract class Car extends Vehicle{

    protected Integer passengersNumber;
    protected Integer numberOfDoors;
    protected String motor;
    protected String typeOfGasoline;
    protected Integer kilometers;
    
    Car () {
        
    }

    
    
    public Car(Integer passengersNumber, Integer numberOfDoors, String motor, String typeOfGasoline, Integer kilometers, String licensePlate, String model, String brand) {
        super(licensePlate, model, brand);
        this.passengersNumber = passengersNumber;
        this.numberOfDoors = numberOfDoors;
        this.motor = motor;
        this.typeOfGasoline = typeOfGasoline;
        this.kilometers = kilometers;
    }
    
    

    public Integer getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(Integer passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTypeOfGasoline() {
        return typeOfGasoline;
    }

    public void setTypeOfGasoline(String typeOfGasoline) {
        this.typeOfGasoline = typeOfGasoline;
    }

    public Integer getKilometers() {
        return kilometers;
    }

    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }
    
    
    
    @Override
    public abstract String getInfo();
    
}
