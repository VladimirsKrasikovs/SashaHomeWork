package org.example;

public class Transport {

    private String type;
    private int fuelTank;
    private double fuelConsumption;

    public Transport(String type, int fuelTank, double fuelConsumption) {
        this.type = type;
        this.fuelTank = fuelTank;
        this.fuelConsumption = fuelConsumption;
    }

    public String getType() {
        return type;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double transportDistance() {
        double distance = fuelTank/fuelConsumption*100;
        return distance;
    }
    public double transportFuelConsumptionOnOneKM() {
        double consumption = fuelConsumption/100;
        return consumption;
    }
    


    }


