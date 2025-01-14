# financial-system
A Java-based financial system designed to calculate marginal tax rates and visualize tax distributions using JavaFX for the user interface and REST APIs for dynamic data fetching.

Features
Marginal Tax Calculator:

Calculates tax liability based on salary, filing status, and year.
Displays detailed tax brackets and effective tax rates.
Dynamic Tax Data Integration:

Fetches tax rules and rates from a REST API.
Provides visualizations of tax liabilities over multiple years.
Interactive Graphs and Visualizations:

Displays tax liability as bar charts for easy understanding.
Dynamically updates tax brackets and tax rates based on inputs.
Responsive and Intuitive UI:

Built with JavaFX for a modern and user-friendly design.
Supports multiple filing statuses and tax years.
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/FullStackJoshua/financial-system.git
cd financial-system
Build the project using Maven:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn javafx:run
Requirements
Java: JDK 17+
Maven: 3.6+
JavaFX SDK: 17+ (Ensure it's properly configured in your environment)
Usage
Enter your salary in the input field.
Select your filing status (Single, Married, etc.).
Choose the tax year to calculate tax liability.
Click on the calculate button to see:
Tax brackets and their respective rates.
Effective tax rate and total tax liability.
Graphical representation of the tax distribution.
Technology Stack
JavaFX: For building the graphical user interface.
REST APIs: To fetch tax data dynamically.
Maven: For build automation.
GitHub: For version control.
