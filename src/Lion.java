public class Lion extends Animal {
    private final String _lionName;

    public Lion(String lionName, String animalSpecies, short numberOfLegs, short animalAge) {
        super(animalSpecies, numberOfLegs, animalAge);
        _lionName = lionName;
    }

    @Override
    public void MakeSound() {
        System.out.printf("%s called %s makes sound <<Roar>>!%n", _animalSpecies, _lionName);
    }
}
