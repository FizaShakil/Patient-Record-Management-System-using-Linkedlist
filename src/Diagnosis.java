/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fiza
 */
public class Diagnosis {
    private String patientID;
    private String diagnosis;
    private String treatment;
    private String admitRequired;
    private String roomType;

    public Diagnosis(String patientID, String diagnosis, String treatment, String admitRequired, String roomType) {
        this.patientID = patientID;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.admitRequired = admitRequired;
        this.roomType = roomType;
    }

    // Getters and setters
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getAdmitRequired() {
        return admitRequired;
    }

    public void setAdmitRequired(String admitRequired) {
        this.admitRequired = admitRequired;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public String toString() {
        return "Patient ID: " + patientID + ", Diagnosis: " + diagnosis + ", Treatment: " + treatment +
               ", Ward Required: " + admitRequired + ", Room Type: " + roomType;
    }
}

