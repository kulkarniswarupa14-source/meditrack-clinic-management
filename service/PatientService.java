package service;

import java.util.ArrayList;
import java.util.List;

import entity.Patient;
import util.Validator;
import util.IdGenerator;

public class PatientService {

    private List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient p) {
        Validator.validateAge(p.getAge());
        Validator.validateName(p.getName());

        p.setId(IdGenerator.generateId());
        patients.add(p);
    }

    public void displayAllPatients() {
        for (Patient p : patients) {
            System.out.println(p.getId() + " " + p.getName());
        }
    }

    public Patient searchPatient(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public Patient searchPatient(String name) {
        for (Patient p : patients) {
            if (p.getName().equals(name)) return p;
        }
        return null;
    }
}