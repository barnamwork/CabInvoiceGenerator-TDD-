package com.bridgelabz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceGeneratorTest {

    @Test
    void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.calculateFare(2.0, 5);
        assertEquals(25.0, fare);
    }

    @Test
    void givenDistanceAndTime_ShouldReturnMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.calculateFare(0.1, 1);
        assertEquals(5.0, fare);
    }

    @Test
    void givenMultipleRides_ShouldReturnAggregateFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };

        double totalFare = invoiceGenerator.calculateFare(rides);
        assertEquals(30.0, totalFare);
    }

    @Test
    void givenMultipleRides_ShouldReturnInvoiceSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };

        InvoiceSummary summary = invoiceGenerator.calculateFareSummary(rides);

        assertEquals(2, summary.getNumberOfRides());
        assertEquals(30.0, summary.getTotalFare());
        assertEquals(15.0, summary.getAverageFare());
    }
}