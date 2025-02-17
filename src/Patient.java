/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fiza
 */
public class Patient {
    private String patientId;
    private String name;
    private String contactNumber;
    private String age;
    private String gender;
    private String bloodGroup;
    private String address;

    public Patient(String patientId, String name, String contactNumber, String age, String gender, 
                   String bloodGroup, String address) {
        this.patientId = patientId;
        this.name = name;
        this.contactNumber = contactNumber;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Contact: " + contactNumber + 
               ", Age: " + age + ", Gender: " + gender + ", Blood Group: " + bloodGroup + 
               ", Address: " + address;
    }
    
    // Add getter and setter methods as needed
}
