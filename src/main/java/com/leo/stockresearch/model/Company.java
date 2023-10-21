package com.leo.stockresearch.model;

import lombok.Data;

@Data
public class Company {
    private double pe;
    private double eps;
    private double currentPrice;

    public Company() {}

    public Company(double pe, double eps, double currentPrice) {
        this.pe = pe;
        this.eps = eps;
        this.currentPrice = currentPrice;
    }

    public double getPe() {
        return pe;
    }

    public void setPe(double pe) {
        this.pe = pe;
    }

    public double getEps() {
        return eps;
    }


    public void setEps(double eps) {
        this.eps = eps;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "Company{" +
                "pe=" + pe +
                ", eps=" + eps +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
