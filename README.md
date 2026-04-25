# 🚆 Railway Reservation System – Extended Problem Statement

## 🌍 Overview

Design a **Railway Reservation System** that allows users to:
- Search trains
- Check seat availability
- Book tickets
- Cancel reservations
- Generate final travel charts

The system supports multiple seat categories:
- AC Coach
- Non-AC Coach
- Seater

### Constraints:
- Each coach type has:
    - **60 confirmed seats**
    - **10 waiting list seats**
- Must handle:
    - Concurrent bookings
    - Real-time availability
    - Seat state transitions

---

## 👤 Actors in the System

### Passenger
- Search trains
- Book tickets
- Cancel tickets
- Check booking status

### Admin/System
- Manage train schedules
- Prepare charts
- Handle exceptional scenarios

---

## 🚉 Core Functional Domains

### 1. 🔍 Train Search & Discovery

Passengers should be able to:
- Search trains between **source and destination**
- Filter by:
    - Date of journey
    - Seat type (AC / Non-AC / Seater)

View:
- Departure & arrival times
- Available seats
- Waiting list count

#### Scenarios:
- Multiple trains between same stations
- Boarding from intermediate stations
- Different seat availability for different segments

---

### 2. 📊 Availability Checking

System must provide real-time availability based on:
- Train
- Date
- Seat type

#### Seat States:
- Available
- Booked (Confirmed)
- Waiting List
- Cancelled
- RAC (optional)

#### Scenarios:
- Last seat booked by multiple users simultaneously
- Waiting list reaches max (10)
- Cancellation promotes waiting list passengers

---

### 3. 🎟️ Booking Module

Passengers can:
- Select train, seat type, and passenger count
- Enter details
- Confirm booking

#### Booking Outcomes:
- Confirmed Ticket
- Waiting List Ticket
- Booking Failure

#### Scenarios:
- Booking 5 tickets when only 3 available
- Partial vs full booking decisions
- Group vs individual booking
- Concurrent booking conflicts
- Duplicate booking attempts

---

### 4. ❌ Cancellation Module

Passengers can:
- Cancel confirmed or waiting list tickets

#### Effects:
- Confirmed → seat becomes available
- Waiting list → removed from queue
- Trigger promotion of waiting list

#### Scenarios:
- Cancellation before chart preparation
- Multiple cascading promotions
- Refund handling (optional)

---

### 5. 📄 Chart Preparation Module

Chart is prepared before departure.

#### Responsibilities:
- Freeze bookings
- Convert waiting list (if possible)
- Assign final seat numbers
- Mark unconfirmed passengers

#### Scenarios:
- Late cancellations
- No-shows (optional)
- Last-minute allocations

---

## 🔄 State Transitions

Passenger/Ticket lifecycle:

Requested → Confirmed

Requested → Waiting List

Waiting List → Confirmed

Confirmed → Cancelled

Waiting List → Cancelled


---

## ⚙️ Constraints & Rules

- Each coach type is independent
- Max:
    - 60 confirmed seats
    - 10 waiting list
- No overbooking
- Ensure consistency under concurrency

---

## ⚡ Non-Functional Requirements

### 1. Concurrency
- Multiple users booking simultaneously
- Prevent double booking

### 2. Scalability
- Handle high traffic

### 3. Performance
- Fast availability checks
- Near real-time booking

### 4. Reliability
- No inconsistent seat allocation

---

## 🧩 Edge Cases

- Booking the 60th seat
- Booking when waiting list is full
- Cancellation with no waiting list
- System failure during booking
- Retry mechanisms
- Rapid repeated booking attempts

---

## 🔮 Possible Extensions

- RAC (Reservation Against Cancellation)
- Dynamic pricing
- Multi-leg journeys
- Seat preference (window/aisle)
- Payment integration
- Notifications (SMS/Email)
- Train delays/rescheduling

---

## 🧠 Learning Objectives

This problem helps you practice:
- Object modeling
- State management
- Concurrency handling
- Data consistency
- Queue management
- Separation of concerns
- Extensible design

---

## 🎯 Goal

- Break system into components
- Identify entities & relationships
- Handle real-world scenarios
- Apply design patterns **naturally while implementing**
