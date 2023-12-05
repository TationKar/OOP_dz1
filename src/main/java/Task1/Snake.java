package Task1;

import java.time.LocalDate;

public class Snake extends Animal implements Swimable, Crawling{
    public Snake(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
}
