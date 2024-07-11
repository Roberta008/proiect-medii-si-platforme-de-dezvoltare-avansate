using Proiect_Animal_Sounds.src.Interfaces;

namespace Proiect_Animal_Sounds.src
{
    internal class Dog : IAnimal
    {
        public void MakeSound()
        {
            Console.WriteLine($"<{GetType().Name}> makes sound: <Woof>");
        }
    }
}
