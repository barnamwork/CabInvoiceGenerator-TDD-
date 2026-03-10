# 🚕 Cab Invoice Generator (TDD)

A subscription-based cab billing system built using **Test Driven
Development (TDD)** in Java.

The customer books rides during the month and receives an invoice
summary at the end of the month.

This project follows the **RED → GREEN → REFACTOR** cycle and
demonstrates clean, testable architecture using Maven and JUnit 5.

------------------------------------------------------------------------

## 🛠 Tech Stack

-   Java 17
-   Maven
-   JUnit Jupiter 5.10.0
-   GitFlow

------------------------------------------------------------------------

## 📌 Problem Statement

Build an invoice generator that calculates cab fare based on:

### 🚗 Normal Ride

-   ₹10 per km\
-   ₹1 per minute\
-   Minimum fare ₹5

### 🚘 Premium Ride

-   ₹15 per km\
-   ₹2 per minute\
-   Minimum fare ₹20

The system supports: - Single ride calculation - Multiple rides
aggregation - Invoice summary generation - User-based invoice service -
Mixed ride categories

------------------------------------------------------------------------

## 📚 Features / Use Cases

### ✅ UC1 --- Calculate Fare (Single Ride)

Given distance and time, calculate total fare: Fare = distance \*
costPerKm + time \* costPerMinute\
Minimum fare validation is applied.

### ✅ UC2 --- Multiple Rides (Aggregate Fare)

Accepts multiple rides and returns total combined fare.

### ✅ UC3 --- Enhanced Invoice Summary

Returns an `InvoiceSummary` object containing: - Total number of rides\
- Total fare\
- Average fare per ride

### ✅ UC4 --- Invoice Service (UserId Based)

Introduces: - `RideRepository` interface - `InvoiceService` class

Given a userId: - Fetch rides from repository - Return invoice summary

Repository is stubbed in unit tests to ensure fast and deterministic
testing.

### ✅ UC5 --- Premium Ride Support

Supports two ride categories:

Category   Cost/Km   Cost/Min   Minimum Fare
  ---------- --------- ---------- --------------
NORMAL     ₹10       ₹1         ₹5
PREMIUM    ₹15       ₹2         ₹20

Allows mixed rides in a single invoice.

------------------------------------------------------------------------

## 📂 Project Structure

CabInvoiceGenerator\
│\
├── pom.xml\
└── src\
├── main\
│ └── java\
│ └── com/cabinvoicegenerator\
│ ├── InvoiceGenerator.java\
│ ├── Ride.java\
│ ├── RideCategory.java\
│ ├── InvoiceSummary.java\
│ ├── RideRepository.java\
│ └── InvoiceService.java\
│\
└── test\
└── java\
└── com/cabinvoicegenerator\
├── InvoiceGeneratorTest.java\
└── InvoiceServiceTest.java

------------------------------------------------------------------------

## ▶ How to Run Tests

### In IntelliJ

Right-click `src/test/java` → Run All Tests

### Using Maven

mvn test

------------------------------------------------------------------------

## 🔄 TDD Workflow Followed

For every use case: 1. RED --- Write failing test\
2. GREEN --- Write minimum code to pass\
3. REFACTOR --- Improve code quality while keeping tests green

------------------------------------------------------------------------

## 🌿 Git Branch Strategy

-   main → README only\
-   develop → Complete working code\
-   feature/\* → Individual use case branches

All features merged using: git flow feature finish -k

------------------------------------------------------------------------

## 👨‍💻 Author

Aaditya Ranjan

------------------------------------------------------------------------

## 🚀 Final Status

✔ Fully working\
✔ All test cases passing\
✔ Supports NORMAL & PREMIUM rides\
✔ Clean Maven structure\
✔ Proper GitFlow history
