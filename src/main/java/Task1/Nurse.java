package Task1;

public class Nurse {
    String name;
    String cabinet;
    String telephone;

    public Nurse(String name, String cabinet, String telephone) {
        this.name = name;
        this.cabinet = cabinet;
        this.telephone = telephone;
    }

    void test(Animal patient){
        System.out.println("The nurse " + name + " took tests from the " + patient);
    }
    void bandage(Animal patient){
        System.out.println("The nurse " + name + " bandaged the " + patient);
    }
    void injection(Animal patient){
        System.out.println("The nurse " + name + " gave the injection to the " + patient);
    }

    void card(Animal patient){
        System.out.println("The nurse " + name + " made an entry in the " + patient + "'s card");
    }
}


