📌 Street Marketing System (Java OOP MVP)

📖 Project Description

The Street Marketing System is a console-based Java application that simulates a real-world street marketing company. It manages marketers, supervisors, and marketing campaigns while tracking performance and calculating bonuses.

The project is designed as a Minimum Viable Product (MVP) to demonstrate core Object-Oriented Programming (OOP) principles in Java.

It includes interactive user input using Scanner, making the system dynamic and user-driven instead of hardcoded values.


---

✨ Features

Create marketing campaigns dynamically

Add marketers with sales data via user input

Add supervisors and team information

Display system reports

Calculate bonuses based on sales

Demonstrates full OOP principles



---

🧠 OOP Concepts Implemented

1. Classes and Objects

Files:

Person.java

Marketer.java

Supervisor.java

Campaign.java


Description: Each entity in the system is modeled as a class. Objects are created dynamically in Main.java using user input.


---

2. Encapsulation

Files:

Person.java

Marketer.java

Supervisor.java

Campaign.java


Description: All important data fields are declared as private or protected and accessed using getters and setters.

Example:

Person.java (lines ~5–25)

Marketer.java (lines ~10–40)



---

3. Inheritance

Files:

Marketer.java

Supervisor.java

Person.java


Description: Both Marketer and Supervisor inherit from the Person class using the extends keyword.

Example:

Marketer extends Person (Marketer.java line 1)

Supervisor extends Person (Supervisor.java line 1)



---

4. Polymorphism

A. Method Overriding (Runtime Polymorphism)

Files:

Marketer.java

Supervisor.java


Both subclasses override the work() method from Person.

Example:

work() override in Marketer (~lines 20–30)

work() override in Supervisor (~lines 15–25)



---

B. Method Overloading (Compile-time Polymorphism)

Files:

SalesCalculator.java


The method calculateBonus() is overloaded with different parameter types.

Example:

calculateBonus(int sales)

calculateBonus(double sales, double percentage)



---

C. Runtime Polymorphism via Superclass Reference

Files:

Main.java


Example:

Person p1 = marketer;
Person p2 = supervisor;

This demonstrates dynamic method dispatch.


---

⌨️ New Feature: User Input (Interactive System)

The system now uses Scanner to accept real-time user input.

File: Main.java

Input includes:

Campaign name

Product name

Marketer details (name, age, location, sales)

Supervisor details (name, age, team size)


Benefit: This makes the system interactive and simulates real-world data entry in business applications.


---

▶️ How to Compile and Run

Step 1: Compile

javac *.java

Step 2: Run

java Main


---

📂 Project Structure

StreetMarketingSystem/
│
├── Person.java
├── Marketer.java
├── Supervisor.java
├── Campaign.java
├── SalesCalculator.java
├── Main.java
└── README.md


---

🖥️ Example Program Flow

Enter campaign name: Summer Promo
Enter product name: Energy Drink

Enter marketer name: Abel
Enter marketer age: 22
Enter marketer location: Piazza
Enter number of sales: 15

Enter supervisor name: Sara
Enter supervisor age: 30
Enter team size: 5


---

📊 Sample Output

Campaign: Summer Promo
Product: Energy Drink

Abel is promoting products on the street.
Sara is supervising street marketers.

Marketer Bonus: 150
Supervisor Bonus: 300.0


---

🚀 CI/CD Automated PR Review Pipeline

GitHub Actions

GitLab CI/CD

Bitbucket Pipelines


Suggested Features:

Compile Java code automatically

Run basic unit tests

Check code style (Checkstyle / SpotBugs)

Fail build if errors or warnings exist

Provide automated feedback on Pull Requests


Example GitHub Actions Flow:

1. Developer creates a Pull Request


2. Pipeline automatically triggers


3. Code is compiled and tested


4. Feedback is shown in PR


5. Merge is blocked if issues are found




---

👨‍💻 Author - Eyuel Hailu

Student MVP Project – Object-Oriented Programming in Java