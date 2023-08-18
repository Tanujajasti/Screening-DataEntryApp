# Screening-DataEntryApp
A simple data Entry Application


PREREQUISITES
  - Java: Make sure you have Java JDK 11 or later installed.
  - Git: Install Git for version control
  - Your Preferred IDE: You can use an IDE of your choice, such as IntelliJ or Visual Studio Code.



STEPS TO SET-UP A SIMPLE DATA ENTRY APPLICATION

Step 1: Clone the Repository
  - Open your terminal or command prompt.
  - Navigate to the directory where you want to clone the repository.
  - Clone the repository using `git clone https://github.com/Tanujajasti/DataEntryApp.git
`

Step 2: Import the Project in IntelliJ IDEA(Or your preferred IDE)
  - Import the project in your preferred IDE
  - Configure JDK

Step 3: Run the Application
  - Locate the DataEntryAppApplication.java file in the src/main/java/com/app/DataEntryApp directory.
  - Right-click within the class and choose "Run" to start the Spring Boot application.
  - Wait for the application to start. You should see console output indicating that the application has started successfully.

Step 4: Access the Application
  - Open a web browser.
  - Access the application by navigating to http://localhost:8080/persons/form in the browser.
  - You should see the "Data Entry Form" page. You can fill out the form and submit person data.
  - You should be redirected to a success page which also dispays the information you just submitted along with any previously submitted data.
  - You can click on "Add New Person" to add more data.
  - To view the list of entered persons without having to submitting the form, go to http://localhost:8080/persons/list.



ENDPOINTS
  - GET /persons/form
    This endpoint is used to display the data entry form where users can input information about a person. It Renders the person-form.html Thymeleaf template, which contains the form for entering person details.

  - POST /persons/save
    This endpoint is used to handle form submissions and save person information to the database. It Takes the form data submitted by the user, creates a Person object, saves it to the database using the PersonRepository, and then redirects to the /persons/list endpoint.

  - GET /persons/list
    This endpoint displays a list of all persons that have been entered into the application. It Renders the person-list.html Thymeleaf template, which displays a table with the details of each person retrieved from the database using the PersonRepository.
