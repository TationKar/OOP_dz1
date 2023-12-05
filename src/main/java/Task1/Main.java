package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat(); //экземпляр класса
//        cat.setName("barsic");
        Cat cat = new Cat("Barsic", new Illness("enures"), "Masha", LocalDate.of(2, 2, 22));

        System.out.println(cat.getName());
        Dog dog = new Dog("Max",new Chumka("chumka"), "Petr",
                LocalDate.of(3,12,21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCycle();
        dog.breathe();

        Animal duck = new Duck("Kryak", new Illness("loss of feathers"), "Nils", LocalDate.of(5,9,2));
        animals.add(duck);
        Animal fish = new Fish( "Gold", new Illness("fatness"), "Deniska", LocalDate.of(0,8,14));
        animals.add(fish);
        Animal snake = new Snake("Snegg", new Illness("poisoning"), "Garry", LocalDate.of(32,7,9));
        animals.add(snake);
        Animal croc = new Crocodile("Gena", new Illness("depression"), "Cheburashka", LocalDate.of(45,3,8));
        animals.add(croc);
        Animal vulture = new Vulture("Griff", new Illness("fracture"), "Robert Grant", LocalDate.of(7,7,7));
        animals.add(vulture);

        System.out.println("___________");

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog).addPatient(duck).addPatient(fish).addPatient(snake).addPatient(croc).addPatient(vulture);
        System.out.println("Список бегающих:");
        System.out.println(clinic.getGoable());
        System.out.println("Список плавающих:");
        System.out.println(clinic.getSwimable());
        System.out.println("Список ползающих:");
        System.out.println(clinic.getCrawling());
        System.out.println("Список летающих:");
        System.out.println(clinic.getFly());
        clinic.juniorNurse.card(duck);
        clinic.headNurse.test(cat);
        clinic.head.exam(dog);
        clinic.intern.heal(croc);
        }
    }

