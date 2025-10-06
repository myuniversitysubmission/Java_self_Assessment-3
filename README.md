# Java Self Assessment 3 – Warehouse Process Simulation

## 📌 Project Overview
This project is part of **Java Self Assessment 3** for our university course.  
It simulates an **Industrial Warehouse Process** involving various operations and **Autonomous Guided Vehicles (AGVs)**.

The simulation helps to:
- Represent warehouse industrial processes programmatically.
- Calculate total **process duration**, **energy consumption**, and **number of AGVs used**.
- Demonstrate the use of **Object-Oriented Programming (OOP)** principles in Java.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 📂 Project Structure
JAVA_SELF_ASSESSMENT_3/
├── src/ # Java source files
│ ├── AGV.java
│ ├── Resources.java
│ ├── IOperation.java
│ ├── HumanOperation.java
│ ├── TransportOperation.java
│ ├── IndustrialProcess.java
│ └── WarehouseSimulation.java # Main class
├── .gitignore
├── README.md
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## ⚙️ Key Classes
- **AGV** – Represents autonomous guided vehicles with battery load, consumption, and speed.
- **Resources** – Base class for resource types.
- **IOperation** – Represents an industrial process operation.
- **HumanOperation** – Represents operations involving human labor.
- **TransportOperation** – Represents transport operations performed by AGVs.
- **IndustrialProcess** – Combines all operations and calculates process statistics.
- **WarehouseSimulation (Main)** – Runs the simulation.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
UML class diagram:<img width="4600" height="5092" alt="Warehouse_UML png" src="https://github.com/user-attachments/assets/d6499055-ed52-4aca-a052-e02d9360dc01" />
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 🚀 How to Run
1. Open the project in **Eclipse IDE**.
2. Ensure the project uses at least **Java 8+**.
3. Locate the `WarehouseSimulation` class inside `src`.
4. Right-click → **Run As → Java Application**.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 📊 Sample Output
=== Warehouse Process Simulation ===
Process ID: Process1
Total Process Duration: 57.0 minutes
Total AGVs used: 3
Total Energy Consumption: 17.0 units

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
## 📦 Requirements
- Java Development Kit (**JDK 8 or above**)
- Eclipse IDE (or any preferred Java IDE)
- Git for version control

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 👥 Team

Adesh Moore

🏭 1. WarehouseSimulation

Type: Main (controller) class

Purpose: Entry point of the whole program — it contains the main() method.

Creates:

Resources (like AGV, HumanResource)

Operations (HumanOperation, TransportOperation)

An IndustrialProcess (which groups operations)

Relationship:

Uses (dashed arrow) → IndustrialProcess

You need to learn:

How to write a main class that creates and connects objects.

How to instantiate classes and call their methods.

Dnyaneshwar 

⚙️ 2. IndustrialProcess

Type: Normal class

Purpose: Represents a full warehouse process (e.g., receiving, packaging).

Contains:

A list of operations (IOperation) — meaning it’s made up of several smaller tasks.

Key Methods:

addOperation()

getTotalDuration()

getTotalEnergy()

countAGVs()

Relationship:

Composition (solid diamond) → IOperation
→ means IndustrialProcess owns the operations, and if it’s deleted, the operations go too.

You need to learn:

Composition: one object containing others.

How to use ArrayList in Java to store multiple objects.

🔧 3. IOperation (Interface / Abstract Class)

Type: Abstract class or Interface

Purpose: Blueprint for all operations.

Attributes:

id, description, nominalTime

A list of Resources

Methods:

addResource()

getDuration()

getEnergyConsumption()

Relationship:

Parent class for HumanOperation and TransportOperation

You need to learn:

What an abstract class is (cannot be instantiated directly).

How to use inheritance (extends).

How polymorphism allows treating all operations the same (IOperation reference).

Anil 

🙋 4. HumanOperation

Type: Subclass of IOperation

Purpose: Represents operations done by humans (manual tasks).

Implements:

getDuration() and getEnergyConsumption() with human-based logic.

You need to learn:

How to override methods from a parent class.

How to provide different behavior for different subclasses.

🚚 5. TransportOperation

Type: Subclass of IOperation

Purpose: Automated transport tasks done by AGVs.

Implements:

Same methods as HumanOperation but with AGV-specific calculations.

You need to learn:

How to design multiple subclasses that behave differently but share the same parent.

🔩 6. Resources (Abstract Class)

Type: Abstract class

Purpose: Base type for all resources used by operations.

Attributes:

id, name

Method:

getEnergyConsumption() (to be defined by subclasses)

You need to learn:

Abstract classes (again).

The difference between inheritance and composition.

Harshavarthan 

🤖 7. AGV (Autonomous Guided Vehicle)

Type: Subclass of Resources

Purpose: Represents robot vehicles.

Attributes:

speed, battery, consumption

Implements:

getEnergyConsumption() — returns energy based on usage.

👷 8. HumanResources

Type: Subclass of Resources

Purpose: Represents human workers.

Attributes:

hourlyRate or energy/time usage

Implements:

getEnergyConsumption() — human workload energy.
---

## 📄 License
This project is intended **only for educational purposes** as part of the university coursework.

