import java.util.ArrayList;
import java.util.List;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>(of(
                new Cat("Casper", "American Shorthair", (short) 4, (short) 5),
                new Dog("Rex", "Airedale Terrier", (short) 4, (short) 6),
                new Lion("Simba", "Panthera leo", (short) 4, (short) 8),
                new Snake("Slytherin", "Ball Python", (short) 0, (short) 10)));
        listOfAnimals.forEach(Animal::MakeSound);
    }
}

