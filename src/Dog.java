public class Dog extends Animal {
    private final String _dogName;

    public Dog(String dogName, String animalSpecies, short numberOfLegs, short animalAge) {
        super(animalSpecies, numberOfLegs, animalAge);
        _dogName = dogName;
    }

    @Override
    public void MakeSound() {
        System.out.printf("%s called %s makes sound <<Woof>>!%n", _animalSpecies, _dogName);
    }
}
