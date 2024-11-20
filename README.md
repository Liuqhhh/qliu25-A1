# AssignmentOne Java Project

## Project Overview
This project, **AssignmentOne**, is a simple Java application designed to demonstrate object-oriented programming concepts, such as inheritance, polymorphism, and collections. It simulates a health management system where different health professionals, such as General Practitioners and Nutritionists, can be managed, and appointments with patients can be created, viewed, and canceled.

## Features
1. **Health Professional Management**: The project includes classes for different health professionals:
   - `HealthProfessional`: Base class for health professionals.
   - `GeneralPractitioner`: A class that represents general practitioners, extending `HealthProfessional`.
   - `Nutritionist`: A class that represents nutritionists, also extending `HealthProfessional`.

2. **Appointment Management**: The project also includes an `Appointment` class that allows the creation and management of appointments for patients with health professionals.

3. **Use of Collections**: The project uses `ArrayList` to store appointment objects, allowing easy manipulation such as adding, viewing, and canceling appointments.

## Classes Included
### 1. `HealthProfessional`
- The base class that contains common attributes for health professionals, including `id`, `name`, and `department`.
- Includes methods for printing basic details about a health professional.

### 2. `GeneralPractitioner`
- A subclass of `HealthProfessional` that adds a specific attribute to differentiate general practitioners from other health professionals.
- Contains methods for printing detailed information, including specialization.

### 3. `Nutritionist`
- Another subclass of `HealthProfessional` that contains a unique attribute to describe a nutritionist's certification.
- Methods are included for printing detailed information about the nutritionist.

### 4. `Appointment`
- Represents an appointment between a patient and a health professional.
- Contains attributes like patient name, mobile phone number, time slot, and the selected health professional.
- Methods are included to print the appointment details.

## Main Method Overview
- The `main` method of the `AssignmentOne` class is responsible for creating objects, printing health professional details, creating appointments, and managing them.
- **Part 3**: Demonstrates creating instances of `GeneralPractitioner` and `Nutritionist`, and printing their details.
- **Part 5**: Demonstrates the creation and management of appointments using an `ArrayList`.
  - Two appointments with general practitioners and two appointments with nutritionists are created.
  - Existing appointments are printed, one appointment is canceled, and the updated list of appointments is printed again.

## How to Run
1. Clone the GitHub repository to your local machine.
2. Make sure you have a Java Development Kit (JDK) installed.
3. Compile the `.java` files:
   ```sh
   javac *.java
   ```
4. Run the `AssignmentOne` class:
   ```sh
   java AssignmentOne
   ```

## Project Structure
The project structure is as follows:
```
username-A1/
  ├── src/
      ├── AssignmentOne.java
      ├── HealthProfessional.java
      ├── GeneralPractitioner.java
      ├── Nutritionist.java
      ├── Appointment.java
```
- Each class is placed in a separate file for better modularity and code organization.

## Requirements
- Java Development Kit (JDK) 8 or above.
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse, VS Code) for easier navigation and compilation.

## Example Output
```
Hello, this is Assignment One!
General Practitioner Details:
ID: 1, Name: Dr. Smith, Department: General Medicine
Specialty: Family Health
...
------------------------------
Patient Name: John Doe, Mobile Phone: 1234567890, Time Slot: 08:00
General Practitioner Details:
ID: 1, Name: Dr. Smith, Department: General Medicine
Specialty: Family Health
...
------------------------------
No appointment found with mobile phone: 1234567890
------------------------------
```
This output shows the details of health professionals, the appointments created, and the management of appointment cancellations.

## License
This project is open source and available under the [MIT License](LICENSE).

## Author
This project was created by [Qihao Liu]. Contributions and feedback are welcome!

