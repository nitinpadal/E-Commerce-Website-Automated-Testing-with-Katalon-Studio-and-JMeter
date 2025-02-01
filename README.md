# E-Commerce-Website-Automated-Testing-with-Katalon-Studio-and-JMeter


Project Overview:

The E-Commerce Website Automated Testing project leverages Katalon Studio for functional testing and JMeter for performance testing. The goal is to ensure the website responds as expected under various conditions, validating both functional correctness and system performance.
This project automates key workflows such as user authentication, product selection, cart management, checkout, and logout while also assessing system response times and load handling capabilities. It ensures smooth and error-free user interactions through comprehensive test automation and performance analysis.
________________________________________
Technologies Used:
•	Katalon Studio – For functional UI testing and automation.
•	JMeter – For performance and load testing.
•	Java & Groovy – Used for scripting within Katalon.
•	ChromeDriver – WebDriver implementation for browser interactions.
•	TestNG/JUnit – For structured test execution and reporting.
•	Maven – For managing dependencies and test execution.
________________________________________
Project Features:
1. Functional UI Testing with Katalon Studio
•	Login Functionality Testing:
o	Navigates to the e-commerce website’s login page.
o	Enters valid user credentials (admin@admin.com / password).
o	Asserts successful login by verifying the presence of the dashboard.
•	Product Selection and Cart Validation:
o	Adds an item to the cart.
o	Navigates to the cart and verifies that the selected product is present.
•	Checkout Process Automation:
o	Proceeds to the checkout page.
o	Fills in customer details (Name, Phone, Address, Country).
o	Completes the purchase and verifies success.
•	Order Confirmation Validation:
o	Verifies the success message: Congrats! Your order has been registered.
•	Logout Functionality:
o	Clicks on the Logout button.
o	Ensures redirection to the login page.
2. Performance Testing with JMeter
•	Load Testing:
o	Simulates multiple users accessing the website simultaneously.
o	Monitors response times and ensures stability under heavy traffic.
•	Stress Testing:
o	Tests system performance under extreme conditions.
o	Identifies potential bottlenecks and scalability issues.
•	Response Time Analysis:
o	Measures how quickly pages load and actions are completed.
•	Concurrent User Testing:
o	Simulates multiple users performing actions (login, add to cart, checkout).
________________________________________
Expected Outcomes:
•	Ensures that the e-commerce website functions correctly across multiple test scenarios.
•	Automates end-to-end testing for both functional and performance aspects.
•	Validates response times and system behavior under different loads.
•	Provides structured test reports using TestNG/JUnit and JMeter.
•	Enhances software reliability by identifying and resolving potential performance bottlenecks.
________________________________________
Future Enhancements:
•	Implement WebDriverWait instead of Thread.sleep for better synchronization.
•	Parameterize test cases to validate multiple user credentials.
•	Integrate Jenkins for continuous testing and reporting.
•	Extend JMeter testing with distributed load testing for large-scale performance validation.
•	Generate automated performance reports for detailed analysis.
________________________________________
Test Execution Summary:
Execution Environment:
•	Host Name: Nitin - 192.168.0.175
•	OS: Windows 11 (64-bit)
•	Katalon Version: 10.0.0.223
•	Browser: Chrome 132.0.0.0
Test Results:
•	Total Test Cases Executed: 2
•	Passed: 2
•	Failed: 0
•	Errors: 0
Test Cases:
1.	Valid Login & Purchase Flow (PASSED)
o	Successfully logged in and placed an order.
o	Verified the confirmation message.
2.	Invalid Login Attempt (PASSED)
o	Used incorrect credentials and verified error message.
