package com.bridgelabz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceServiceTest {

    @Test
    void givenUserId_ShouldReturnInvoiceSummary() {

        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };

        RideRepository repository = userId -> rides;

        InvoiceService service = new InvoiceService(repository);
        InvoiceSummary summary = service.getInvoiceSummary("user1");

        assertEquals(2, summary.getNumberOfRides());
        assertEquals(30.0, summary.getTotalFare());
        assertEquals(15.0, summary.getAverageFare());
    }
}