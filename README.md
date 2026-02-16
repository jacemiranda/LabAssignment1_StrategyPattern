## Project Overview
This project involves refactoring a legacy `Character` class from a `GameApp` scenario. The original implementation used rigid `if-else` conditional logic to determine attack and defense behaviors. This refactored version utilizes the **Strategy Design Pattern** to promote code decoupling and follow the **Open/Closed Principle**.

## Problem Scenario
[cite_start]The application supports three character types with specific capabilities[cite: 2, 3, 4, 5]:
* [cite_start]**Knight**: Attacks with a sword; uses Shield, Dodge, and Magic Barrier for defense[cite: 3].
* [cite_start]**Wizard**: Casts spells; uses a Magic Barrier for defense[cite: 4].
* [cite_start]**Archer**: Shoots arrows; uses Dodge for defense[cite: 5].

## Strategy Implementation

### 1. Attack Strategies (`AttackStrategy` Interface)
[cite_start]Defines the offensive capabilities[cite: 11]:
* [cite_start]`SwingSword`: Implementation for the Knight[cite: 14].
* [cite_start]`CastSpell`: Implementation for the Wizard[cite: 12].
* [cite_start]`ShootArrow`: Implementation for the Archer[cite: 13].

### 2. Defense Strategies (`DefenseStrategy` Interface)
[cite_start]Defines the defensive capabilities[cite: 7]:
* [cite_start]`Shield`: Used for physical blocking[cite: 8].
* [cite_start]`Dodge`: Used for avoiding attacks[cite: 9].
* [cite_start]`CreateMagic`: Used for magical protection[cite: 10].

## How to Run
1.  Open the project in **IntelliJ IDEA**.
2.  Navigate to the `GameApp.java` file.
3.  Run the `main` method to see the characters executing their specific strategies.

## UML Diagram
<img width="1878" height="1092" alt="StrategyPattern" src="https://github.com/user-attachments/assets/7e30e44f-c4f7-4e2a-a7db-2b451d4c4e1a" />

