# Employee Management System

This repository contains a Java program for managing employee details and performing salary calculations.

## Contents

1. [Introduction](#introduction)
2. [Usage](#usage)
3. [Employee Class](#employee-class)
4. [SpecialEmployee Class](#specialemployee-class)
5. [Contributing](#contributing)
6. [License](#license)

## Introduction

The Employee Management System is a Java program designed to manage employee information and automate salary calculations. It provides functionalities to input employee details, calculate salaries based on predefined formulas, and display the information.

## Usage

To use this program, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the `Assignment_5_main.java` file.
4. Follow the on-screen instructions to input employee details.
5. The program will calculate the salary based on predefined formulas and display the information.

## Employee Class

The `Employee` class is an abstract class representing an employee. It contains attributes such as employee name, address, designation, department, etc., along with methods to get and set these attributes. It also defines an abstract method `salaryCalculation()` to be implemented by subclasses.

## SpecialEmployee Class

The `SpecialEmployee` class extends the `Employee` class and implements the `salaryCalculation()` method. It provides a specific implementation for calculating the salary based on predefined formulas. Additionally, it includes methods for displaying employee details.

## Contributing

Contributions to improve the functionality or add new features are welcome! Please fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
