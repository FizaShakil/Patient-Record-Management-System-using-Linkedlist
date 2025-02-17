# Patient Record Management System

## Overview
The **Patient Record Management System** is a desktop application developed in **Java** using **NetBeans IDE**, **MySQL** as the database, and **LinkedList** as the data structure for efficient data handling. This system allows medical staff to manage patient information, diagnosis records, and treatment details seamlessly.

## Features
- **Add Patient Records**: Users can store new patient details in the system.
- **Search Patient Records**: Retrieve patient details using unique patient IDs.
- **Add Diagnosis Information**: Record and store patient diagnoses, prescribed treatments, and admission requirements.
- **Update Records**: Modify existing patient and diagnosis information.
- **Delete Records**: Remove patient or diagnosis data as needed.
- **Display Records**: Fetch and display patient and diagnosis records in a LinkedList format.

## Database Structure
The system interacts with **two main tables** in MySQL:

### `patient` Table
Stores general patient information, including:
- `patientID`: Unique identifier for each patient
- `name`: Patient's full name
- `age`: Patient's age
- `gender`: Gender of the patient
- `bloodGroup`: Blood Group of patient
- `contact`: Contact number
- `address`: Residential address

### `patientreport` Table
Stores diagnosis and treatment details, including:
- `patientID`: Links the record to a specific patient
- `diagnosis`: Medical diagnosis information
- `treatment`: Prescribed medicine and treatment
- `wardReq`: Whether admission is required (Yes/No)
- `typeWard`: Type of room required if admitted

## Data Structure Usage
The system employs a **LinkedList** to dynamically store and manage patient diagnosis records. This enhances retrieval and modification operations efficiently.

## How It Works
1. **Adding a Patient:** The user inputs patient details, which are stored in the `patient` table.
2. **Searching a Patient:** A patient ID is entered to fetch details from the database.
3. **Adding Diagnosis Information:** The user inputs diagnosis details, which are stored in the `patientreport` table and added to a LinkedList.
4. **Updating Information:** Users can modify patient records directly in the system.
5. **Deleting Records:** Unwanted patient records can be deleted.
6. **Displaying Data in Console:** The patient records fetched from the database are printed using the LinkedList.

## Technologies Used
- **Java (Swing for GUI)**
- **NetBeans IDE**
- **MySQL Database**
- **LinkedList Data Structure**

## Future Enhancements
- Implement authentication for security.
- Enhance UI with improved design and responsiveness.
- Introduce reports and analytics for patient insights.

This project simplifies hospital data management, ensuring efficient patient record handling, using CRUD operations.
