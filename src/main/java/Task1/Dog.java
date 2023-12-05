package Task1;

import java.time.LocalDate;

public class Dog extends Animal  implements Goable, Swimable{
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}
