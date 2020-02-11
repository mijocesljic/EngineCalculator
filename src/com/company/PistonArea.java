package com.company;
import java.lang.Math.*;

public class PistonArea extends PistonForce {
private Double area;
private Double PistonRadius;

    protected void setArea(Double area) {
        this.area = (Math.PI) * PistonRadius;
    }

    public void setPistonRadius(Double pistonRadius) {
        PistonRadius = 0.0;
    }

    public Double getArea() {
        return area;
    }

    public PistonArea(Double area, Double PistonRadius){
        setArea(0.0);
        setPistonRadius(0.0);
        return get;
    }
}
