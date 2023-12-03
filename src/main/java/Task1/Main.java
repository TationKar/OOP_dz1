package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"), "petr",
                LocalDate.of(3,12,21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCycle();
        dog.breathe();

        Animal duck = new Duck();
        animals.add(duck);
        Animal fish = new Fish();
        animals.add(fish);
        Animal snake = new Snake();
        animals.add(snake);

        System.out.println("___________");

        for (Animal anml: animals) {
            String an = anml.getClass().getSimpleName();
            if (!an.equals("Fish") && !an.equals("Snake"))
            {
                anml.toGo();
            }
            else
            {
                System.out.println(an + " not to go");
            }

            if (an.equals("Duck"))
            {
                anml.fly();
            }
            else
            {
                System.out.println(an + " not to fly");
            }

            anml.swim();
            System.out.println();
        }
    }
}
