public class Snake extends Animal {
    private final String _snakeName;

    public Snake(String snakeName, String animalSpecies, short numberOfLegs, short animalAge) {
        super(animalSpecies, numberOfLegs, animalAge);
        _snakeName = snakeName;
    }

    @Override
    public void MakeSound() {
        System.out.printf("%s called %s makes sound <<Hiss>>!%n", _animalSpecies, _snakeName);
    }
}
