package com.company;

public class Torque extends MotorLeistung {
    Double area;
    Double lever;
    Double torque;
    public Torque(PistonArea pistonArea, Lever lever){
        pistonArea.setArea(0.0);
        lever.set
    }

    public Double getTorque() {
        return torque;
    }

    public Double getLever(){
        return lever;
    }

    public Torque(Double lever) {
        this.lever = lever;
    }
}
