# SDP Assignment 3 - Bridge Pattern

**Course:** Software Design Patterns
**Topic:** Food Delivery System

## Project Description
This project implements the **Bridge structural design pattern** in Java.
The system separates the abstraction (what we are delivering) from the implementation (how we are delivering it) to avoid a combinatorial explosion of subclasses.

- **Abstraction:** `Order` (Refined by `PizzaOrder`, `SushiOrder`)
- **Implementor:** `DeliveryType` (Implemented by `WalkDelivery`, `CarDelivery`)

## 5 Clean Code Principles Applied

1. **Meaningful Names:**
   Class and interface names clearly distinguish between Abstraction and Implementor roles. `Order` clearly acts as the abstraction, while `DeliveryType` acts as the implementor doing the actual delivery work.
2. **Single Responsibility Principle (Small, focused classes):**
   Each class has only one reason to change. For example, `CarDelivery` only handles the logic for delivering by car, and `PizzaOrder` only handles pizza-specific logic.
3. **No Duplicated Logic:**
   By using the Bridge pattern, we avoided creating redundant classes like `PizzaWalkDelivery` and `PizzaCarDelivery`. The delivery logic is written only once in the Concrete Implementor classes and is reused.
4. **Clear Separation of Responsibilities:**
   The `Order` class delegates the delivery task to `DeliveryType` without knowing the low-level details of how the delivery is executed. Implementor details do not leak into the client.
5. **Backward-Compatible Design (Open/Closed Principle):**
   The system is open for extension but closed for modification. If we need to add a new delivery method (e.g., `ScooterDelivery`), we can simply create a new class implementing `DeliveryType` without changing any existing Abstraction code.