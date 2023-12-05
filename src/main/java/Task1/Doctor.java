package Task1;

import java.time.LocalDate;

public class Doctor {
    String name;
    String specialization;
    LocalDate experience;
    String cabinet;
    String telephone;

    public Doctor(String name, String specialization, LocalDate experience, String cabinet, String telephone) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.cabinet = cabinet;
        this.telephone = telephone;
    }

    void exam(Animal patient){
        System.out.println("The doctor " + name +" examined the " + patient);
    }
    void prescribe(){
        System.out.println("The doctor " + name + " prescribed medications");
    }
    void heal(Animal patient){
        System.out.println("The doctor " + name + " healed the " + patient);
    }
}
