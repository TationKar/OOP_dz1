package Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    public  List<Animal> getPatients(){
        return patients;
    }

    public Doctor head = new Doctor("Ay-Bo-Lit", "Therapist", LocalDate.of(17,8,9), "1","567890");
    public Doctor intern = new Doctor("Lobanov", "Therapist", LocalDate.of(2,8,9), "4","567990");

    public Nurse headNurse = new Nurse("Alla", "2", "567790");
    public Nurse juniorNurse = new Nurse("Elli", "3", "567690");

    public VeterinaryClinic addPatient(Animal patient){
        patients.add(patient);
        return this;
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    }
    public List<Goable> getGoable(){
        List<Goable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }

    public List<Crawling> getCrawling(){
        List<Crawling> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Crawling){
                result.add((Crawling) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFly(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }
}
