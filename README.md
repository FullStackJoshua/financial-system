# Financial System

A Java-based **financial system** designed to calculate marginal tax rates and visualize tax distributions using **JavaFX** for the user interface and REST APIs for dynamic data fetching.

## Features

- **Marginal Tax Calculator**:
  - Calculates tax liability based on salary, filing status, and year.
  - Displays detailed tax brackets and effective tax rates.

- **Dynamic Tax Data Integration**:
  - Fetches tax rules and rates from a REST API.
  - Provides visualizations of tax liabilities over multiple years.

- **Interactive Graphs and Visualizations**:
  - Displays tax liability as bar charts for easy understanding.
  - Dynamically updates tax brackets and tax rates based on inputs.

- **Responsive and Intuitive UI**:
  - Built with JavaFX for a modern and user-friendly design.
  - Supports multiple filing statuses and tax years.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/FullStackJoshua/financial-system.git
   cd financial-system
2. Build the project using Maven:
   ```bash
   mvn clean install
3. Run the application:
   ```bash
   mvn javafx:run

## Requirements

- **Java**: JDK 17+
- **Maven**: 3.6+
- **JavaFX SDK**: 17+ (Ensure it's properly configured in your environment)

## Usage

1. **Enter your salary** in the input field.
2. **Select your filing status** (Single, Married, etc.).
3. **Choose the tax year** to calculate tax liability.
4. **Click on the calculate button** to view:
   - Tax brackets and their respective rates.
   - Effective tax rate and total tax liability.
   - Graphical representation of the tax distribution.

## Technology Stack

- **JavaFX**: For building the graphical user interface.
- **REST APIs**: To fetch tax data dynamically.
- **Maven**: For build automation.
- **GitHub**: For version control.
