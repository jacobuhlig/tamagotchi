public class Game {
    public static void main(String[] args) {

        Cat cudles = new Cat("Cudles", true);

        cudles.sleepState(true);

        System.out.println("Cudles mood is: " + cudles.mood);
        System.out.println("Cudles energy is: " + cudles.energy);

        cudles.play();
        cudles.play();
        cudles.play();
        cudles.play();
        cudles.play();

        cudles.feed();
        cudles.feed();
        cudles.feed();
        cudles.feed();

        cudles.sleepState(true);

        cudles.lickFur();
    }
}
