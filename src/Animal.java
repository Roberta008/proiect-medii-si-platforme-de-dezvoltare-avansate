public abstract class Animal {
    protected final String _animalSpecies;
    protected final short _numberOfLegs;
    protected final short _animalAge;

    public Animal(String animalSpecies, short numberOfLegs, short animalAge) {
        _animalSpecies = animalSpecies;
        _numberOfLegs = numberOfLegs;
        _animalAge = animalAge;
    }

    public abstract void MakeSound();
}
