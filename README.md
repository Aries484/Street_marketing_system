📌 Street Marketing System (Java OOP MVP)

📖 Project Description

The Street Marketing System is a console-based Java application that simulates a real-world street marketing company. It manages marketers, supervisors, and marketing campaigns while tracking performance and calculating bonuses.
The project is designed as a Minimum Viable Product (MVP) to demonstrate core Object-Oriented Programming (OOP) principles in Java.
It now includes interactive user input using Scanner, making the system dynamic and user-driven instead of hardcoded values.

✨ Features

Create marketing campaigns dynamically
Add marketers with sales data via user input
Add supervisors and team information
Display system reports
Calculate bonuses based on sales
Demonstrates full OOP principles


🧠 OOP Concepts Implemented

1. Classes and Objects
   Files:

Person.java
Marketer.java
Supervisor.java
Campaign.java

Each entity in the system is modeled as a class. Objects are created dynamically in Main.java using user input.

2. Encapsulation
   Files:

Person.java
Marketer.java
Supervisor.java
Campaign.java

All important data fields are declared as private or protected and accessed using getters and setters.

3. Inheritance
   Files:

Marketer.java
Supervisor.java
Person.java

Marketer and Supervisor inherit from Person using the extends keyword.
Example:

Marketer extends Person
Supervisor extends Person


4. Polymorphism
   A. Method Overriding
   Files:

Marketer.java
Supervisor.java

Both override the work() method from Person.

B. Method Overloading
Files:

SalesCalculator.java

calculateBonus() is overloaded with different parameter types.

C. Runtime Polymorphism
Files:

Main.java

Person p1 = marketer;
Person p2 = supervisor;


⌨️ User Input Feature
The system uses Scanner to take real-time input from the user.
Inputs:

Campaign name
Product name
Marketer details
Supervisor details


▶️ How to Compile and Run

Compile
javac *.java

Run
java Main


📂 Project Structure

StreetMarketingSystem/
├── Person.java
├── Marketer.java
├── Supervisor.java
├── Campaign.java
├── SalesCalculator.java
├── Main.java
└── README.md


📊 Example Output
Campaign: Summer Promo
Product: Energy Drink

Abel is promoting products on the street.
Sara is supervising street marketers.

Marketer Bonus: 150
Supervisor Bonus: 300.0

👨‍💻 Author - Eyuel Hailu
Street Marketing System – Java OOP MVP Project
