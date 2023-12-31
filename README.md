# Selenium WebDriver Project with TestNG Framework

## Overview

This project contains automated test cases built using Selenium WebDriver and TestNG to test the functionality of Automation practice. On "Master" branch

----------------------------------------------

## Prerequisites

Selenium WebDriver libraries for Java
TestNG framework
Compatible WebDriver for your chosen browser (e.g., ChromeDriver, GeckoDriver)

----------------------------------------------

## Setup

Clone the repository:
git clone https://github.com/Heba114/Q-pros_WebTask

Import the project into your IDE as a Maven project.

Configure WebDriver:
Ensure the WebDriver executable is in your system's PATH or specify its path in the code.
You can use a tool like WebDriverManager for automatic management.

-----------------------------------------------

## Running Tests

Right-click on the testng.xml file in your IDE and choose "Run As TestNG Suite".

## Project Structure

src/
├── main/
│   └── java/
│       └── [Pages]/
│           ├── DetailsPage/   # Page object classes for web elements
│           ├── HomePage/        # Page object classes for web elements
│           └── ShoppingCartPage/     # Page object classes for web elements
└── test/
    └──java/
│           ├── BaseTests/   # Setup tests
│           ├── DetailsTests/       # Test scenarios for details page
│           └── ShoppingCartPage/ # Test scenarios for shopping cart page 
 └── testng.xml       # TestNG configuration file
