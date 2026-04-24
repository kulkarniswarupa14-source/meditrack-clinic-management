package service;

import java.util.ArrayList;
import java.util.List;

import entity.Appointment;
import entity.Patient;
import entity.Doctor;
import entity.AppointmentStatus;

public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();

    public void createAppointment(int id, Patient p, Doctor d) {
        appointments.add(new Appointment(id, p, d, AppointmentStatus.CONFIRMED));
    }

    public void displayAppointments() {
        for (Appointment a : appointments) {
            System.out.println(
                a.getId() + " " +
                a.getPatient().getName() + " -> " +
                a.getDoctor().getName() + " [" +
                a.getStatus() + "]"
            );
        }
    }
}