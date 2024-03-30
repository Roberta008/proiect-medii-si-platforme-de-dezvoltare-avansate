public class Cat extends Animal {
    private final String _catName;

    public Cat(String catName, String animalSpecies, short numberOfLegs, short animalAge) {
        super(animalSpecies, numberOfLegs, animalAge);
        _catName = catName;
    }

    @Override
    public void MakeSound() {
        System.out.printf("%s called %s makes sound <<Meow>>!%n", _animalSpecies, _catName);
    }
}
