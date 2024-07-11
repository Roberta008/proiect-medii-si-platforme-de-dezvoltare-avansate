using Proiect_Animal_Sounds.src.Interfaces;

namespace Proiect_Animal_Sounds.src
{
    internal class Lion : IAnimal
    {
        public void MakeSound()
        {
            Console.WriteLine($"<{GetType().Name}> makes sound: <Roar>");
        }
    }
}
