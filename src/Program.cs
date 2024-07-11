using Proiect_Animal_Sounds.src.Interfaces;

namespace Proiect_Animal_Sounds.src
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IAnimal[] listOfAnimals = [
                new Cat(),
                new Dog(),
                new Lion(),
                new Snake()
            ];
            foreach (var currentAnimal in listOfAnimals)
            {
                currentAnimal.MakeSound();
            }
        }
    }
}
