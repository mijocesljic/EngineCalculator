package com.company;

import java.lang.Math.*;

public class PistonForce extends Torque{

    private double radius;

    private double pressure;

    public PistonForce(double radius, double pressure) {
        this.radius = radius;
        this.pressure = pressure;
    }

    public double calculateForce(){
        double area = Math.PI * (radius * radius);
        double force = area * pressure;

        return force;
    }
}
