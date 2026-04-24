package entity;

public class Doctor {

    private int id;
    private String name;
    private int age;
    private String specialization;
    private double fee;

    public Doctor(int id, String name, int age, String specialization, double fee) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.fee = fee;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getSpecialization() { return specialization; }
    public double getFee() { return fee; }

   
    public void setId(int id) {
        this.id = id;
    }
}