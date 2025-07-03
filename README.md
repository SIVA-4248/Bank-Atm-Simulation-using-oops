# 💳 Bank ATM Simulation in Java

This project simulates a basic **ATM system** using **Java OOP concepts** such as abstraction, inheritance, and interfaces.

## 🧠 Overview

The application allows a user to:
- Withdraw money from a current account.
- Deposit money into the account.
- Check account balance.
- Exit the system (remove the card).

It features real-time console interaction to simulate an ATM machine.

## 🔧 Technologies Used

- **Java (JDK 8 or above)**
- **Scanner class** for input handling
- **OOP concepts**: abstract class, interface, inheritance

## 🏗️ Code Structure

### 1. `holder` (Abstract Class)
- Represents the base account holder with `name` and `balance`.
- Declares an abstract method `displaybal()` to be implemented by subclasses.

### 2. `AtmOps` (Interface)
- Defines ATM operations: `withdraw()` and `deposit()`.

### 3. `CurrentAcc` (Concrete Class)
- Inherits from `holder`.
- Implements `AtmOps` interface.
- Provides logic for withdrawal, deposit, and displaying balance.
- Handles insufficient balance by prompting for deposit.

### 4. `BankAtm` (Main Class)
- Handles user interaction via console.
- Displays a menu for ATM operations.
- Loops until the user chooses to exit (Remove Card).

## 📌 How to Run

1. **Save the code in a file** named `BankAtm.java`.

2. **Compile the program** using:
   ```bash
   javac BankAtm.java
HERE BELOW IS THE OUTPUT THAT YOU WILL SEE AFTER SAVING THE FILE 

WELCOME TO THE BANK ATM name you entered 
Please insert your card into ATM !!!
CHOOSE OPERATION 
1. WITHDRAWAL 
2. DEPOSIT 
3. CHECK BALANCE 
4. REMOVE CARD


This project successfully demonstrates a simple Bank ATM system using core Java concepts such as abstraction, interfaces, and inheritance. It allows a single user to interact with their current account to perform essential ATM operations like withdrawal, deposit, and balance check.

The system emphasizes modular OOP design and console-based interaction, making it a great beginner-level project for learning Java and understanding real-world banking workflows.

💡 Conclusion:

The Bank ATM Simulation is a foundational Java project that highlights how real-world operations can be modeled using object-oriented programming. It serves as a solid base for future enhancements such as multi-user support, PIN validation, transaction records, and graphical user interface integration.
