package service;

import java.util.ArrayList;
import java.util.List;

import entity.Doctor;

public class DoctorService {

    private List<Doctor> doctors = new ArrayList<>();

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void displayAllDoctors() {
        for (Doctor d : doctors) {
            System.out.println(d.getId() + " " + d.getName());
        }
    }


    public List<Doctor> getAllDoctors() {
        return doctors;
    }
}