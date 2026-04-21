# 📚 Student-Teacher Management System (Java)

## 📌 Overview
This project is a simple Java console-based application that manages student and teacher records. It demonstrates core Object-Oriented Programming (OOP) principles including **abstraction**, **inheritance**, **interfaces**, and **polymorphism**. The program allows users to add students and teachers, store them in an array, and display their roles and study/teaching activities in a structured format.

---

## ⚙️ Features
- Menu-driven console interface
- Add **Student** with ID, Name, and Course
- Add **Teacher** with ID, Name, and Subject
- Display all added people with:
  - Role description
  - Study/Teaching activity
  - Formatted information (`ID: Name`)
- Fixed-size array storage (demonstrates array handling)
- Implements a `Teachable` interface for common behavior

---

## 🧠 Concepts Used
- **Interface** (`Teachable`) – defines common behavior  
- **Abstract Class** (`Person`) – provides common attributes and partial implementation  
- **Inheritance** – `Student` and `Teacher` extend `Person`  
- **Polymorphism** – array of `Person` references holds different subclass objects  
- **Method Overriding** – `role()` and `study()` are customized in subclasses  
- **Arrays** – fixed-size storage for objects  
- **User Input** – `Scanner` class for interactive input  


---

## 🖥️ How It Works
1. The program displays a menu with four options:
   - `1. Add Student`
   - `2. Add Teacher`
   - `3. Show All`
   - `4. Exit`
2. User chooses an option.
3. **Adding a person:**
   - Prompts for ID, Name, and Course/Subject.
   - Creates a `Student` or `Teacher` object and stores it in a fixed‑size `Person[]` array.
4. **Showing all records:**
   - Iterates through the array and calls `role()`, `study()`, and `getInfo()` for each object.
   - Polymorphism ensures the correct subclass methods are executed.
5. The loop continues until the user selects **Exit**.

---

## 💻 Sample Input
1.Add Student
2.Add Teacher
3.Show All
4.Exit
Choice: 1
ID: 101
Name: Alice
Course/Subject: Computer Science

Choice: 2
ID: 201
Name: Dr. Smith
Course/Subject: Mathematics

Choice: 3



## 📤 Sample Output
Alice is a Student
Alice studying Computer Science
101: Alice

Dr. Smith is a Teacher
Dr. Smith teaching Mathematics
201: Dr. Smith


---


✍️ Author
KARTHIKEYAN K U
