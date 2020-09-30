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
public class Motocycle extends Vehicle{

    private String ccMotor;
    private String motor;

    public Motocycle() {
        
    }

    public Motocycle(String ccMotor, String motor, String licensePlate, String model, String brand) {
        super(licensePlate, model, brand);
        this.ccMotor = ccMotor;
        this.motor = motor;
    }
    
    
    
    @Override
    public String getInfo() {
        return "";
    }
    
}
