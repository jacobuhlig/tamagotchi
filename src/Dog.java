public class Dog extends Tamagotchi {
    public int loyalty = 2;
    public int intelligence;

    public Dog(String name, boolean gender, int intelligence) {
        super(name, gender);
        this.intelligence = intelligence;
    }

    //public void giveLove()... loyalty is affected by this method
}
