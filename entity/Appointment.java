package entity;

public class Appointment {

    private int id;
    private Patient patient;
    private Doctor doctor;
    private AppointmentStatus status;

    public Appointment(int id, Patient patient, Doctor doctor, AppointmentStatus status) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }
}