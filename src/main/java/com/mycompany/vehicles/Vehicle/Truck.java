package com.mycompany.vehicles.Vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 *
 * @author marl8n
 */
public class Truck extends Vehicle{
    private String typeOfGasoline;
    private String motor;
    private Double tons;

    public Truck(String typeOfGasoline, String motor, Double tons, String licensePlate, String model, String brand) {
        super(licensePlate, model, brand);
        this.typeOfGasoline = typeOfGasoline;
        this.motor = motor;
        this.tons = tons;
    }

    public String getTypeOfGasoline() {
        return typeOfGasoline;
    }

    public void setTypeOfGasoline(String typeOfGasoline) {
        this.typeOfGasoline = typeOfGasoline;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Double getTons() {
        return tons;
    }

    public void setTons(Double tons) {
        this.tons = tons;
    }
    
    

    @Override
    public String getInfo() {
        return "";
    }
}
