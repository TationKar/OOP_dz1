package Task1;

import java.time.LocalDate;

public class Vulture extends Animal implements Flyable{
    public Vulture(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    public Vulture() {

    }
}
