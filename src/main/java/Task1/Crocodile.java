package Task1;

import java.time.LocalDate;

public class Crocodile extends Animal implements Crawling, Goable, Swimable{
    public Crocodile(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}
