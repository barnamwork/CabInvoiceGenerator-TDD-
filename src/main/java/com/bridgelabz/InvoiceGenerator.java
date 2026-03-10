package com.bridgelabz;

public class InvoiceGenerator {

    // UC1 compatibility (Normal ride default)
    public double calculateFare(double distance, int time) {
        Ride ride = new Ride(distance, time);
        return calculateFare(ride);
    }

    // Core method used for category-based calculation
    public double calculateFare(Ride ride) {
        double fare = ride.distance * ride.category.costPerKm +
                ride.time * ride.category.costPerMinute;

        return Math.max(fare, ride.category.minimumFare);
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }

        return totalFare;
    }

    public InvoiceSummary calculateFareSummary(Ride[] rides) {
        double totalFare = calculateFare(rides);
        return new InvoiceSummary(rides.length, totalFare);
    }
}