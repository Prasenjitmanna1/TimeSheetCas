**Project Name: TimeSheet **


# Overview
The goal of this project is to streamline the TimeSheet portal at Cognizant by utilizing Selenium WebDriver for automation. This entails maneuvering through the Be.Cognizant portal, retrieving user data, confirming the OneCognizant interface, locating the TimeSheet, and ensuring the accuracy of the information.

## Libraries and Dependencies
- **Maven Repository:** Maven 4.0.0
- **Apache POI:** 5.2.5
- **TestNG:** 7.10.1
- **Extent Report:** 5.1.1
- **Selenium WebDriver:** 5.8.0


## Automation Flow
1. Navigate to Be.Cognizant portal.
2. Extract user information from the profile.
3. Verify the presence of OneCognizant link.
4. Click on OneCognizant link.
5. Search for timesheet in the search bar.
6. Click on timesheet and navigate to the portal.
7. Check timesheet title is present on Time sheet Portal.
8. Get last three weeks details from Time sheet Portal.
9. Select Date from Search By field and select current date in the calendar and click on Search.
10. Verify the starting day of current week is saturday and ending day of current week is friday.
11. Select each Status value from Search By field and click on Search.
12. Validate Search results are displayed based on Status

## Libraries Explanation
- **Maven Repository:** Used for project management and dependency resolution.
- **Apache POI:** Handles Excel operations for data-driven testing.
- **TestNG:** Facilitates test case organization and execution.
- **TestNG Report:** Generates comprehensive test reports.
- **Selenium WebDriver:** Automates browser interactions.


## Screenshots
Screenshots are captured at relevant steps for documentation and analysis.

## How to Run
1. **Open Eclipse IDE:**
   - Launch Eclipse IDE on your machine.

2. **Import Project:**
   - Select `File` -> `Import` from the menu.
   - Choose `Existing Maven Projects` and click `Next`.
   - Browse to the directory where you cloned the repository and select the project.

3. **Update Maven Project:**
   - Right-click on the project in the Project Explorer.
   - Choose `Maven` -> `Update Project`.
   - Click `OK` to update dependencies.

4. **Set Up Configuration:**
   - Open the `src/test/resources/config.properties` file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.

5. **Run Test Suite:**
   - Locate the test suite file (`CrossBrowsertestng.xml`)
   - Right-click on the file and choose `Run As` -> `TestNG Suite`.

6. **View Reports:**
   - After execution, open the `test-output` folder.
   - Find the TestNG file (`index.html`) for detailed test case reports.

## Reporting
1. **Locate Test Reports:**
   - After the execution, navigate to the `test-output` folder in the project directory.

2. **Open Extent Report:**
   - Inside the `test-output` folder, find the Extent Report HTML file named `index.html`.

3. **View Test Reports:**
   - Open the `index.html` file using any web browser.
   - This report provides a detailed overview of test executions, including passed and failed tests, test duration, and any exceptions encountered.

4. **Screenshots and Logs:**
   - screenshots captured during test execution and relevant logs for test cases.

5. **Analyze Results:**
   - Utilize the visual representation in the TestNG Report to quickly identify test status and any issues encountered during the test run.


